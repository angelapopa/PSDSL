package uibk.dsl.assignment3.generator

import org.eclipse.xtext.generator.IFileSystemAccess2
import java.util.List
import uibk.dsl.assignment3.game.Character
import uibk.dsl.assignment3.game.Action
import uibk.dsl.assignment3.game.Object
import java.util.Set
import java.util.HashSet

class CharacterGenerator extends IngredientGenerator{
	val generatedObjectPackageName = "characters";
	
	new(String packageName) {
		super(packageName)
	}
		
	def generateCharacters(List<Character> characters, List<Object> objects, IFileSystemAccess2 fsa) {
		
		val Set<Object> objectsToHandle = new HashSet();
		
		//calculate all non super type objects, they will be used as objects to be handled by a character
		for (o : objects){
			if (o.superType !== null){
				objectsToHandle.add(o);
			}
		}
		
		for (c : characters){
			val String fileName = this.getGeneratedPackageNamePath + "/" + generatedObjectPackageName + "/" 
				+ getFormattedName(c.name) + ".java";
			fsa.generateFile(fileName, compile(c, objectsToHandle));
		}
	}
	
	def String compile(Character character, Set<Object> objectsToHandle) {
		'''
		//generated
		package «generatedPackageNamePathDecl».«generatedObjectPackageName»;
		
		import «generatedPackageNamePathDecl».objects.*;
		
		public class «getFormattedName(character.name)» {
			
			private String name = "«getFormattedName(character.name)»";
			«FOR attribute : character.attributes»
			private «getAttributeType(attribute.value)» «attribute.name» = «attribute.value»;
			«ENDFOR»
			
			
			//constructors
			public «getFormattedName(character.name)»(){
			}
			
			«IF character.attributes.size > 0»
			public «getFormattedName(character.name)»(«getFormattedParameterList(character.attributes)»){
				«FOR attribute : character.attributes»
					this.«attribute.name» = «attribute.name»;
				«ENDFOR»
			}
			«ENDIF»
			
			«««for each action of a non super type object create a method»»»
			««« currently it is not taken into account what actions the character can do»»»
			
			//methods			
			«IF objectsToHandle.size > 0»
			«FOR object : objectsToHandle»
			«FOR action : getActions(object)»
			public void «getPlainName(action.literal)»«getFormattedName(object.name)»(«getFormattedName(object.name)» «getFormattedName(object.name).toFirstLower»){
				«IF action.getName() == Action.PICK.getName()»
				this.healthPoints += «getFormattedName(object.name).toFirstLower».getHealthPoints();
				«ELSEIF action.getName() == Action.ATTACK.getName()»
				this.healthPoints -= «getFormattedName(object.name).toFirstLower».getHealthPoints();
				if (this.healthPoints < 0) {
					setHealthPoints(0);
				}
				«ELSE»
				//no action is required
				«ENDIF»
			}
			
			«ENDFOR»
			«ENDFOR»
			«ENDIF»		
			//getters and setters
			«FOR attribute : character.attributes»
			public «getAttributeType(attribute.value)» get«attribute.name.toFirstUpper»(){
				return «attribute.name»;
			}
			
			public void set«attribute.name.toFirstUpper»(«getAttributeType(attribute.value)» «attribute.name»){
				this.«attribute.name» = «attribute.name»;
			}
			«ENDFOR»
		}

		'''
	}
	
	def Set<Action> getActions(Object object) {
		val Set<Action> actions = new HashSet<Action>();
		
		for (action : object.actions){
			actions.add(action);
		}
		for (action : object.superType.actions){
			actions.add(action);
		}
		return actions;
	}
	
}