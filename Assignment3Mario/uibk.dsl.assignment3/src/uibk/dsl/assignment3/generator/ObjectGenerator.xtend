package uibk.dsl.assignment3.generator

import org.eclipse.xtext.generator.IFileSystemAccess2
import java.util.List
import uibk.dsl.assignment3.game.Object
import java.util.HashSet
import java.util.Set
import uibk.dsl.assignment3.game.Action

class ObjectGenerator extends IngredientGenerator{
	val generatedObjectPackageName = "objects";
	
	new(String packageName) {
		super(packageName);
  	}
		
	def generateObjects(List<Object> objects, IFileSystemAccess2 fsa) {
		generateAllObjects(objects, fsa);
	}
	
	def generateAllObjects(List<Object> objects, IFileSystemAccess2 fsa){
		
		val Set<Object> superClassObjects = new HashSet();
		
		//calculate all super type objects, they will be generated as interfaces
		for (o : objects){
			if (o.superType !== null){
				superClassObjects.add(o.superType);
			}
		}
		
		//generate all objects
		for (o : objects){
			val String fileName = generatedPackageNamePath + "/" + generatedObjectPackageName + "/" 
				+ getFormattedName(o.name) + ".java";
			fsa.generateFile(fileName, compile(o, superClassObjects.contains(o))
			);
		}
	
	}
	
	// « »
	def CharSequence compile(Object object, Boolean isSuperClass){
		'''
		//generated
		package «generatedPackageNamePathDecl».«generatedObjectPackageName»;
		
		import «generatedPackageNamePathDecl».game.*;
		
		««« if object is a super class»»»
		«IF isSuperClass»
		import java.util.ArrayList;
		import java.util.List;
		
		public class «getFormattedName(object.name)» {
			
			List<«Action.simpleName»> actions;
			
			//constructor
			public «getFormattedName(object.name)»() {
				this.actions = new ArrayList<«Action.simpleName»>();
				«FOR action : object.actions»
				this.actions.add(«Action.simpleName».«action.getName»);
				«ENDFOR»
			}
			
			//getters and setters
			public List<«Action.simpleName»> get«Action.simpleName»s() {
				return actions;
			}
		}
		«ENDIF»
		
		««« if object is a class
		«IF !isSuperClass»
		public class «getFormattedName(object.name)» «IF object.superType !== null»extends «getFormattedName(object.superType.name)»«ENDIF»{
			
			«FOR attribute : object.attributes»
			private «getAttributeType(attribute.value)» «attribute.name» = «attribute.value»;
			«ENDFOR»
			
			
			//constructors
			public «getFormattedName(object.name)»(){
				super();
			}
			
			«IF object.attributes.size > 0»
			public «getFormattedName(object.name)»(«getFormattedParameterList(object.attributes)»){
				«FOR attribute : object.attributes»
					this.«attribute.name» = «attribute.name»;
				«ENDFOR»
				«FOR action : object.actions»
					add«action.class.simpleName»(«Action.simpleName».«action.getName»);
				«ENDFOR»
			}
			«ENDIF»
			
			
			//methods
			«IF object.actions.size > 0»
			public void add«Action.simpleName»(«Action.simpleName» action){
				this.actions.add(action);
			}
			«ENDIF»
			
			//getters and setters
			«FOR attribute : object.attributes»
			public «getAttributeType(attribute.value)» get«attribute.name.toFirstUpper»(){
				return «attribute.name»;
			}
			«ENDFOR»
		}
		«ENDIF»
		««« end if object is a class

		'''
	}
}