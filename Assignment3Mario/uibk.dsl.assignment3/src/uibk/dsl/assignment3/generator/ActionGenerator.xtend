package uibk.dsl.assignment3.generator

import java.util.List
import org.eclipse.xtext.generator.IFileSystemAccess2
import uibk.dsl.assignment3.game.Character
import uibk.dsl.assignment3.game.Object
import uibk.dsl.assignment3.game.Action
import java.util.Set
import java.util.HashSet

class ActionGenerator extends IngredientGenerator{
	val generatedObjectPackageName = "game";
	
	new(String packageName) {
		super(packageName)
	}
	
	def generateAction(List<Character> characters, List<Object> objects, IFileSystemAccess2 fsa) {
		val String fileName = this.getGeneratedPackageNamePath + "/" + generatedObjectPackageName + "/" 
				+ "Action.java";
			fsa.generateFile(fileName, compile(characters, objects));
	}
	
	def String compile(List<Character> characters, List<Object> objects) {
		//a list of unique actions
		val Set<Action> actions = getAllPossibleActions(characters, objects);
		
		'''
		//generated
		package «generatedPackageNamePathDecl».«generatedObjectPackageName»;
		
		public enum «Action.simpleName» {
			
			«constructEnumLiterals(actions)»
			
			private String «Action.simpleName.toLowerCase»Name;
			
			//constructor
			private «Action.simpleName»(String «Action.simpleName.toLowerCase»Name){
				this.«Action.simpleName.toLowerCase»Name = «Action.simpleName.toLowerCase»Name;
			}
			
			//getter
			public String get«Action.simpleName»Name(){
				return «Action.simpleName.toLowerCase»Name;
			}
		}

		'''
	}
	
	def String constructEnumLiterals(Set<Action> actions){
		var String result = "";
		for (action : actions){
			result = result.concat(action.getName().toUpperCase).concat("(\"").concat(action.literal.toFirstUpper).concat("\")").concat(",");
		}
		return result.substring(0, result.length-1).concat(";");
	}
	
	def Set<Action> getAllPossibleActions(List<Character> characters, List<Object> objects){
		//a list of unique actions
		val Set<Action> actions = new HashSet<Action>();
		
		//collect all possible actions
		for (character : characters){
			for (action : getCharacterActions(character)){
				actions.add(action);
			}
		}
		for (object : objects){
			for (action : getObjectActions(object)){
				actions.add(action);
			}
		}
		return actions;
	}

	def Set<Action> getCharacterActions(Character character) {
		val Set<Action> actions = new HashSet<Action>();
		
		for (action : character.actions){
			actions.add(action);
		}
		return actions;
	}
	
	def Set<Action> getObjectActions(Object object) {
		val Set<Action> actions = new HashSet<Action>();
		
		for (action : object.actions){
			actions.add(action);
		}
		if (object.superType !== null){
			for (action : object.superType.actions){
				actions.add(action);
			}
		}
		
		return actions;
	}
	
}