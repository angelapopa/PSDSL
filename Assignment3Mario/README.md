# PSDSL
Assignment 3 - Adventure Game

Level: assignment 3

# Getting started
## Game Description

We construct a simple, interactive game code-base, which simulates the Mario game with some features removed or added (thus we call the future generated game as "Mariolike"). 
The story for first version: Mario will have to rescue the Princess. On the way to the highest tower where stayed the Princess, he will get through some obstacles (DangerousObject) and collect some helpful stuffs (UsefulObject). There is a big monster guarding the tower and Mario have to defeat it to meet the Princess and win the game.

## Objects Definition

Main character: Mario  
Side character: the Princess  
Object: DangerousObject | UsefulObject  
DangerousObject: big monster | monster | hole  
UsefulObject: bomb | mushroom  

## Story plots:
1. In the Start Scene: There is one object: Mario with initial state (HP = 10).
2. If Mario meets mushrhoom, he will have to choose one of following actions:
* If he pick up, the HP will increase to 3.
* If he jump over, nothing change.
3. If Mario meets bomb, he will have to choose one of following actions:
* If he pick up, the HP will increase to 1.
* If he jump over, nothing change.
4. If Mario meets hole, he will have to choose one of following actions:
* If he jumps over, he will pass and then continue to next Scene.
* If he walks through, he will fail (HP = 0) and then lose the game.
5. If Mario meets monster (HP = 3), he will have to choose one of following actions:
* If he attack the monster, the program will compare the HP of Mario and the monster.
	* If HP of Mario < HP of monster: Mario will die (HP = 0), monster will still alive.
	* If HP of Mario = HP of monster: both Mario and monster will die.
	* If HP of Mario > HP of monster: monster will die, Mario will alive and continue to next Scene.
* If he walk through the monster, Mario will die (HP = 0), monster will still alive.
* If he jump over the monster: both Mario and monster will alive, Mario will continue to next Scene.

6. In the End Scene: There are Mario, the big_monster (HP = 7) and the princess. Mario have to attack the big_monster
* If he wins, he will meet the Princess and win the game.
* If he loses, he will lose the game.

# Deployment
## DSL

### CodeBase.xtext
This file efines main class of Mariolike, which consist of a main function, some properties, and some function 
 to execute the workflow. The properties should be game ingredients that we defined in Game.xtext file, graphic components or data type like String, boolean...
### Game.xtext
This xtext file defines main ingredients of Mariolike: Character, Object, Scene and Step.

## Demo game definition
The definition of CodeBase.xtext is main.game, in which we defines main classes for executing game, including data structures and graphics.

The definition of Game.xtext is mario.game, in which we defines all the ingredients needed for our future game.

## Demo game design (Code generation)

We have completely generated code for all ingredients like Scene, Step, Character and Object.
We didn't finish main class design due to lack of time and many issues to fix when generating code.

## How to generate code
Xtend generates files on valid grammars.

To get started...

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

    val all = resource.allContents;
		val allObjects = all.filter(Object).toList;
		generateAllObjects(allObjects, fsa);
	}
```

Temporarily the xtext file has the start and end elements commented out to ease the generator process.

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
	Scene | Character | Object | Step
;

AttributeType: STRING | INT;

Attribute:
	name=ID value=AttributeType
;

// a scene bundles objects and contains steps to escape to a new scene
Scene:
	'scene' name = ID '{'
	attributes += Attribute*
	('characters' '(' characters += [Character]')')?
	('objects' '(' objects += [Object] (',' objects += [Object])* ')')?
	('steps' '(' step += [Step] (',' step += [Step])* ')')?
	'}'
;

Character:
	'character' name = (STRING | ID) '{'
	attributes += Attribute*
	('actions' '(' actions += Action (',' actions += Action)* ')')?
	'}'
;
[...]
```

In the editor, mario.game file looks like this:

```
game Mario

character Mario {
	healthPoints 10
	actions(pick up, attack)
}
[...]

object useful_object {
	description "Useful Objects"
	actions(pick up, jump over)
}

object bomb is a useful_object {
	description "Bomb"
	healthPoints 4
}               
[...]

object dangerous_object {
	description "Dangerous Objects"
	actions(walk through, jump over)
}
[...]

object big_monster is a dangerous_object {
	description "Big Monster"
	healthPoints 13
	actions(attack)
}

scene start_scene {
	name "MARIOLIKE"
	description "This is a game similar to the classical Mario game."
	characters(Mario)
	objects(useful_object, dangerous_object)
	steps(go_bomb_area)
}

step go_bomb_area {
	go bomb_area
}

scene bomb_area {
	name "BOMB AREA"
	description "There is a bomb on the floor. \nWhat do you do?"
}

scene big_monster {
	name "BIG MONSTER AREA"
	description "A BIG MONSTER is standing in front of you and \npreventing you to meet the princess. \nWhat do you do?"
	steps(attack_bigmonster, walk_through_bigmonster, jump_over_bigmonster)
}

step attack_bigmonster {
	if attack big_monster
	then go end_scene and Mario.healthPoints - 7
	else invalid "Invalid input. You have to attack, walk through or jump over the BIG BOSS"
}

step walk_through_bigmonster {
	if walk through big_monster
	then go end_scene and Mario.die
	else invalid "Invalid input. You have to attack, walk through or jump over the monster"
}

step jump_over_bigmonster {
	if jump over big_monster
	then go end_scene and Mario.die
	else invalid "Invalid input. You have to attack, walk through or jump over the BIG BOSS"
}

scene end_scene {
	name "THE END"
	description_if_die "Oh, you have died! \nYou have lost the game."
	description_if_win "Congratulations! \n You have defeated the big monster and saved princess. \nYou are true hero!"
}
```

In the editor Eclipse project, there should a new folder `src-gen` be manually created. The file `mario.game` should live in the root folder of the eclipse project (not the src folder).

```
Game
  |_src
  |_src_gen
    |_BigMonster.java  (generated automatically)
  |_mario.game
```

Steps to generate code:
* Generate Xtext Artifacts by right clicking on `Game.xtext`
* Run/Debug by right clicking on the `uibk.dsl.assignment3` project
* after the second Eclipse instance opened change smth. in the editor (`mario.game`) and save the file
* see the generated changes in `src_gen/BigMonster.java`


```
//generated
package mario.objects;

import mario.game.*;


public class BigMonster extends DangerousObject{

	private String description = "Big Monster";
	private int healthPoints = 13;


	//constructors
	public BigMonster(){
		super();
	}

	public BigMonster(String description, int healthPoints){
		this.description = description;
		this.healthPoints = healthPoints;
		addAction(Action.ATTACK);
	}


	//methods
	public void addAction(Action action){
		this.actions.add(action);
	}

	//getters and setters
	public String getDescription(){
		return description;
	}
	public int getHealthPoints(){
		return healthPoints;
	}
}

```

## Examples
We created a text-based adventure game with simple GUI as a reference for our future game, with exactly the same ingredients (such as Scene, Step, Action, Object). To construct the game components, we used:
* Java programming language.
* Graphical input and output with Java Swing.
This game is located in folder TextAdventureGameEx.

Our future game generated by our DSL will be similar with this one, with some minor modification if needed.

