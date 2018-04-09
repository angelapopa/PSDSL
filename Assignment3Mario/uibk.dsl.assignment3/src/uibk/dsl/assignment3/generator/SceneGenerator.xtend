package uibk.dsl.assignment3.generator

import java.util.HashMap
import java.util.HashSet
import java.util.List
import java.util.Map
import java.util.Set
import org.eclipse.xtext.generator.IFileSystemAccess2
import uibk.dsl.assignment3.game.Object
import uibk.dsl.assignment3.game.Scene
import uibk.dsl.assignment3.game.Step

class SceneGenerator extends IngredientGenerator{
	val generatedObjectPackageName = "scenes";
	
	new(String packageName) {
		super(packageName)
	}
	
	def generateAction(List<Scene> scenes, List<Object> objects, IFileSystemAccess2 fsa) {
		val Set<Object> superClassObjects = new HashSet();
		
		//calculate all super type objects, they will be generated as interfaces
		for (o : objects){
			if (o.superType !== null){
				superClassObjects.add(o.superType);
			}
		}
		
		//generate super class Scene
		val String fileNameSuperClass = generatedPackageNamePath + "/" + generatedObjectPackageName + "/" 
			+ getFormattedName(Scene.simpleName) + ".java";
		fsa.generateFile(fileNameSuperClass, compileSuperClass(scenes, superClassObjects));
		
		//generate all scenes
		for (s : scenes){
			val String fileName = generatedPackageNamePath + "/" + generatedObjectPackageName + "/" 
				+ getFormattedName(s.name) + ".java";
			fsa.generateFile(fileName, compile(s, superClassObjects));
		}
	}
	
	def compileSuperClass(List<Scene> scenes, Set<Object> superClassObjects) {
		val Map<String, String> attributes = getAttributes(scenes);
		val Map<String, String> characters = getCharacters(scenes);
		val Map<String, String> objects = getObjects(scenes, superClassObjects);
		
		'''
		//generated
		package «generatedPackageNamePathDecl».«generatedObjectPackageName»;
		
		import «generatedPackageNamePathDecl».objects.*;
		import «generatedPackageNamePathDecl».characters.*;
		import java.util.List;
		
		public class «Scene.simpleName» {
			
			List<«Step.simpleName»> steps;
			
			//constructor
			public «getFormattedName(Scene.simpleName)»(){
			}
			
			//methods
			public void add«Step.simpleName»(«Step.simpleName» step){
				this.steps.add(step);
			}
			
			//getters and setters
			public List<«Step.simpleName»> get«Step.simpleName»s() {
				return steps;
			}
		'''
	}
	
	def compile(Scene scene, Set<Object> superClassObjects) {
		'''
		//generated
		package «generatedPackageNamePathDecl».«generatedObjectPackageName»;
		
		import «generatedPackageNamePathDecl».objects.*;
		import «generatedPackageNamePathDecl».characters.*;
		import java.util.List;
		
		import java.util.ArrayList;

		public class «getFormattedName(scene.name)» extends «Scene.simpleName»{
			
			«FOR attr : scene.attributes»
			private «getAttributeType(attr.value)» «getFormattedName(attr.name).toFirstLower» = «attr.value»;
			«ENDFOR»
			«FOR character : scene.characters»
			private «character.class.simpleName.replace("Impl", "")» «getFormattedName(character.name).toFirstLower»;
			«ENDFOR»
			«FOR obj : scene.objects»
			private «getClassName(obj, superClassObjects)» «getFormattedName(obj.name).toFirstLower»;
			«ENDFOR»
			
			//constructor
			public «getFormattedName(scene.name)»(){
				super();
				
				«FOR step : scene.steps»
					add«Step.simpleName»(new «getFormattedName(step.getName)»«Step.simpleName»());
				«ENDFOR»
			}
			
			//getter and setters
			«FOR attr : scene.attributes»
			public «getAttributeType(attr.value)» get«getFormattedName(attr.name)»(){
				return «getFormattedName(attr.name).toFirstLower»;
			}
			«ENDFOR»
			
			«FOR obj : scene.objects»
			public «getClassName(obj, superClassObjects)» get«getFormattedName(obj.name).toFirstUpper»(){
				return «getFormattedName(obj.name).toFirstLower»;
			}
			
			public void set«getFormattedName(obj.name).toFirstUpper»(«getClassName(obj, superClassObjects)» «getFormattedName(obj.name).toFirstLower»){
				this.«getFormattedName(obj.name).toFirstLower» = «getFormattedName(obj.name).toFirstLower»;
			}
			«ENDFOR»
		}
		'''
	}
	
	def String getClassName(Object object, Set<Object> superClassObjects){
		if (superClassObjects.contains(object)){
			return getFormattedName(object.name)
		}
		return object.class.simpleName.replace("Impl", "");
	}
	
	def Map<String, String> getCharacters(List<Scene> scenes) {
		val Map<String, String>  characters = new HashMap<String, String>();
		if (scenes.get(0).getCharacters() !== null){
			characters.put(getFormattedName(scenes.get(0).characters.get(0).name), scenes.get(0).characters.get(0).class.simpleName.replace("Impl", ""));
		}
		return characters;
	}
	
	def Map<String, String> getObjects(List<Scene> scenes, Set<Object> superClassObjects) {
		val Map<String, String>  objects = new HashMap<String, String>();
		for (s : scenes){
			for (obj : s.objects){
				if (superClassObjects.contains(obj)){
					objects.put(getFormattedName(obj.name).toFirstLower, getFormattedName(obj.name))
				} else {
					objects.put(getFormattedName(obj.name).toFirstLower, obj.class.simpleName.replace("Impl", ""));
				}
			}
		}
		return objects;
	}
	
	def Map<String, String> getAttributes(List<Scene> scenes) {
		val Map<String, String> attributes = new HashMap<String,String>();
		for (s : scenes){
			for (attr : s.attributes){
				attributes.put(attr.name, attr.value);
			}
		}
		return attributes;
	}
	
}