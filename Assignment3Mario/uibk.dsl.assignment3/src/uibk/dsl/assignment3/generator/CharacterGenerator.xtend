package uibk.dsl.assignment3.generator

import org.eclipse.xtext.generator.IFileSystemAccess2
import java.util.List
import uibk.dsl.assignment3.game.Character
import uibk.dsl.assignment3.game.Action

class CharacterGenerator extends IngredientGenerator{
	val generatedObjectPackageName = "characters";
	
	new(String packageName) {
		super(packageName)
	}
		
	def generateCharacters(List<Character> characters, IFileSystemAccess2 fsa) {
		
		for (c : characters){
			val String fileName = this.getGeneratedPackageNamePath + "/" + generatedObjectPackageName + "/" 
				+ getFormattedName(c.name) + ".java";
			fsa.generateFile(fileName, compile(c));
		}
	}
	
	def String compile(Character character) {
		'''
		//generated
		package «generatedPackageNamePathDecl».«generatedObjectPackageName»;
		
		public class «getFormattedName(character.name)» {
			
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
			
			
			//TODO: methods
			
			
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
	
}