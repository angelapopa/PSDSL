# PSDSL
Assignment 3 - Adventure Game

Level: assignment 3

# Generate Code

Xtend generates files on valid grammars.

Currently a small example is working.

The generator code:


```
package uibk.dsl.assignment3.generator

import org.eclipse.emf.ecore.resource.Resource

import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import uibk.dsl.assignment3.game.Object

class GameGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {

		var all = resource.allContents;
		var allObjects = all.filter(Object);
		var greeting = allObjects
				.map[name]
				.join(', ')
		fsa.generateFile('greetings.txt', 'People to greet: ' + greeting);
	}
```

Temporarily the xtext file has the start and end elements commented out, to ease the generator process.

```
[...]
// the actual game
Adventure:
	//('start' startScene = [Scene]) & // where to start
	//('end' endScene = [Scene]) & // when it's over
	(ingredients += Ingredient*) // the adventure's game ingredients
;

// what the adventure is composed of
Ingredient:
	Scene | Object | Character
;
[...]
```

In the editor the temporarily mario.game file looks like this:

```
object useful_object {
	description "Useful Objects"
	healthPoints 1
	actions(pick up, jump over)
}

object bomb is a useful_object {
	description "Bomb"
	healthPoints 1
}                 

object mushroom is a useful_object {
	description "Mushroom"
	healthPoints 3
}

object dangerous_object {
	description "Dangerous Objects"
	healthPoints 15
	actions(walk through, jump over)
}

object monster is a dangerous_object {
	description "Monster"
	healthPoints 3
	actions(attack)
}
```

In the editor Eclipse project, there should a new folder `src-gen` be manually created. The file `mario.game` should live in the root folder of the eclipse project (not the src folder).

```
Game
  |_src
  |_src_gen
    |_greeting.txt   (generated automatically)
  |_mario.game
```

Steps to generate code:
* Generate Xtext Artifacts by right clicking on Game.Xtext
* Run/Debug by right clicking on `uibk.dsl.assignment3` project
* after the second Eclipse instance opened change smth. in the editor (`mario.game`) and save the file
* see the generated changes in `src_gen/greeting.txt`


```
People to greet: useful_object, bomb, mushroom, dangerous_object, monster
```

This greeting.txt will be replaced in the future with java classes. Currently it is just a little working example.
