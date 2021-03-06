/*
 * generated by Xtext 2.12.0
 */
package uibk.dsl.assignment3.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import uibk.dsl.assignment3.game.Adventure
import uibk.dsl.assignment3.game.Character
import uibk.dsl.assignment3.game.Object
import uibk.dsl.assignment3.game.Scene
import uibk.dsl.assignment3.game.Step

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class GameGenerator extends AbstractGenerator {
	
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		
		val all = resource.allContents;	
		
		val adventure = all.filter(Adventure).toList.get(0);
		val allObjects = adventure.ingredients.filter(Object).toList;
		val allCharacters = adventure.ingredients.filter(Character).toList;
		val allScenes = adventure.ingredients.filter(Scene).toList;
		val allSteps = adventure.ingredients.filter(Step).toList;
		
		new ObjectGenerator(adventure.name).generateObjects(allObjects, fsa);
		new CharacterGenerator(adventure.name).generateCharacters(allCharacters, allObjects, fsa);
		new ActionGenerator(adventure.name).generateAction(allCharacters, allObjects, fsa);
		
		new SceneGenerator(adventure.name).generateScenes(allScenes, allObjects, fsa);
		new StepGenerator(adventure.name).generateSteps(allSteps, allObjects, fsa);
		
		//TODO
		//new ConditionGenerator().generateConditions(fsa);
		//TODO
		//new AdventureGenerator().generateAdventures(fsa);
		//TODO
		//new GameGenerator().generateGame(fsa);
	}

}
