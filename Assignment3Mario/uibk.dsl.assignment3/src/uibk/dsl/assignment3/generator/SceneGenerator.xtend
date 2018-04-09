package uibk.dsl.assignment3.generator

import java.util.HashMap
import java.util.List
import java.util.Map
import org.eclipse.xtext.generator.IFileSystemAccess2
import uibk.dsl.assignment3.game.Object
import uibk.dsl.assignment3.game.Scene
import java.util.Set
import java.util.HashSet

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
			fsa.generateFile(fileName, compile(s));
		}
	}
	
	def compileSuperClass(List<Scene> scenes, Set<Object> superClassObjects) {
		val Map<String, String> attributes = getAttributes(scenes);
		val Map<String, String> characters = getCharacters(scenes);
		val Map<String, String> objects = getObjects(scenes, superClassObjects);
		//todo add steps
		
		'''
		//generated
		package «generatedPackageNamePathDecl».«generatedObjectPackageName»;
		
		import «generatedPackageNamePathDecl».objects.*;
		import «generatedPackageNamePathDecl».characters.*;
		
		public class «Scene.simpleName» {
		
			«FOR attrKey : attributes.keySet»
			private «getAttributeType(attributes.get(attrKey))» «attrKey»;
			«ENDFOR»
			
			«FOR key : characters.keySet»
			private «characters.get(key)» «key»;
			«ENDFOR»
			«FOR objKey : objects.keySet»
			private «objects.get(objKey)» «objKey»;
			«ENDFOR»
			
			//constructor
			public «getFormattedName(Scene.simpleName)»(«getFormattedParamaterListScene(attributes, characters)»){
				«FOR attrKey : attributes.keySet»
					this.«attrKey» = «attrKey»;
				«ENDFOR»
				«FOR key : characters.keySet»
					this.«key.toFirstLower» = «key.toFirstLower»;
				«ENDFOR»
			}
			
			//getters and setters
			«FOR attrKey : attributes.keySet»
			public «getAttributeType(attributes.get(attrKey))» get«attrKey.toFirstUpper»(){
				return «attrKey»;
			}
			«ENDFOR»
			«FOR objKey : objects.keySet»
			public «objects.get(objKey)» get«objKey.toFirstUpper»(){
				return «objKey»;
			}
			public void set«objKey.toFirstUpper»(«objects.get(objKey)» «objKey»){
				this.«objKey» = «objKey»
			}
			«ENDFOR»
		'''
	}
	
	def String getFormattedParamaterListScene(Map<String, String> attributes, Map<String, String> characters){
		val Map<String, String> params = new HashMap<String, String>();
		for (attrKey : attributes.keySet){
			params.put(attrKey, getAttributeType(attributes.get(attrKey)));
		}
		for (characterKey : characters.keySet){
			params.put(characterKey.toFirstLower, getAttributeType(characters.get(characterKey)));
		}
		return getFormattedParameterList(params);
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
	
	def compile(Scene scene) {
		'''
		//generated
		package «generatedPackageNamePathDecl».«generatedObjectPackageName»;
		
		import «generatedPackageNamePathDecl».objects.*;
		import «generatedPackageNamePathDecl».characters.*;
		
		import java.util.ArrayList;

		
		'''
	}
	
}