package uibk.dsl.assignment3.generator

import java.util.List
import org.eclipse.xtext.generator.IFileSystemAccess2
import uibk.dsl.assignment3.game.Step
import uibk.dsl.assignment3.game.Object
import java.util.Set
import java.util.HashSet
import uibk.dsl.assignment3.game.Condition
import uibk.dsl.assignment3.game.Scene

class StepGenerator extends IngredientGenerator{
	val generatedObjectPackageName = "steps";
	
	new(String packageName) {
		super(packageName);
  	}
		
	def generateSteps(List<Step> steps, List<Object> objects, IFileSystemAccess2 fsa) {
		val Set<Object> superClassObjects = new HashSet();
		
		//calculate all super type objects, to be able to get their class type
		for (o : objects){
			if (o.superType !== null){
				superClassObjects.add(o.superType);
			}
		}
		
		//generate super class Step
		val String fileNameSuperClass = generatedPackageNamePath + "/" + generatedObjectPackageName + "/" 
			+ getFormattedName(Step.simpleName) + ".java";
		fsa.generateFile(fileNameSuperClass, compileSuperClass(steps));
		
		//generate all scenes
		for (s : steps){
			val String fileName = generatedPackageNamePath + "/" + generatedObjectPackageName + "/" 
				+ getFormattedName(s.name) + getFormattedName(Step.simpleName) + ".java";
			fsa.generateFile(fileName, compile(s, superClassObjects));
		}
	}
	
	def compileSuperClass(List<Step> steps) {
		'''
		//generated
		package «generatedPackageNamePathDecl».«generatedObjectPackageName»;
		
		import «generatedPackageNamePathDecl».scenes.Scene;
				
		public class «Step.simpleName» {
					
			private «Condition.simpleName» condition;
			private «Scene.simpleName» scene;
				
			//constructors
			public «getFormattedName(Step.simpleName)»(){
			}
			
			public «getFormattedName(Step.simpleName)»(«Condition.simpleName» condition, «Scene.simpleName» scene){
				this.«Condition.simpleName.toFirstLower» = «Condition.simpleName.toFirstLower»;
				this.«Scene.simpleName.toFirstLower» = «Scene.simpleName.toFirstLower»;
			}
			
			//getters and setters
			public «Condition.simpleName» get«Condition.simpleName»() {
				return this.«Condition.simpleName.toFirstLower»;
			}
		'''
	}
	
	def compile(Step step, Set<Object> superClassObjects) {
		'''
		//generated
		package «generatedPackageNamePathDecl».«generatedObjectPackageName»;
		
		import «generatedPackageNamePathDecl».scenes.Scene;
		import «generatedPackageNamePathDecl».conditions.Condition;
		
		public class «getFormattedName(step.name)»«getFormattedName(Step.simpleName)» extends «Step.simpleName» {
					
			//constructors
			public «getFormattedName(step.name)»«getFormattedName(Step.simpleName)»(){
				super();
			}
			
			public «getFormattedName(step.name)»«getFormattedName(Step.simpleName)»(«Condition.simpleName.toFirstUpper» «Condition.simpleName.toFirstLower», «Scene.simpleName.toFirstUpper» «Scene.simpleName.toFirstLower»){
				super(«Condition.simpleName.toFirstLower», «Scene.simpleName.toFirstLower»);
			}
		}
		'''
	}
	
}