# PSDSL
A DSL project for game design

Level: assignment 3

# Description

Main character: Mario  
Side character: the Princess  
Object: DangerousObject | UsefulObject  
DangerousObject: big monster | monster | hole  
UsefulObject: bomb | mushroom  

# # Define Objects:

object hero {  
name: Mario,  
HP: 10,  
weapon: 0 bomb  
}  

object princess {  
	name: Princess Anna  
}  

object UsefulObject {  
	action: pick up, jump over  
}  

object bomb extends UsefulObject {  
	name: bomb,  
	value: 1  
}  

object mushroom extends UsefulObject {...}  

object DangerousObject {  
	action: jump over, walk through  
}  

object monster extends DangerousObject {  
	name: ...  
	HP: 7  
	action: attack, jump over, walk through  
}  

object big_monster extends DangerousObject {  
	name: ...  
	HP: 7  
	action: attack, jump over, walk through	 
}

# # Define Steps:
* In the Start Scene: There is one object: Mario with initial state.
* If Mario meets mushrhoom, he will have to choose one of following actions:
* If he pick up, the HP will increase to 3.
* If he jump over, nothing change.
* If Mario meets bomb, he will have to choose one of following actions:
* If he pick up, the weapon will increase to 1.
* If he jump over, nothing change.
* If Mario meets hole, he will have to choose one of following actions:
* If he jumps over, he will pass and then continue to next Scene.
* If he walks through, he will fail (HP = 0) and then lose the game.
* If Mario meets monster, he will have to choose one of following actions:
* If he attack the monster, the program will compare the HP of Mario and the monster.
* If HP of Mario < HP of monster: Mario will die (HP = 0), monster will still alive.
* If HP of Mario = HP of monster: both Mario and monster will die.
* If HP of Mario > HP of monster: monster will die, Mario will alive and continue to next Scene.
* If he walk through the monster, Mario will die (HP = 0), monster will still alive.
* If he jump over the monster: both Mario and monster will alive, Mario will continue to next Scene.

* In the End Scene: There are Mario, the big_monster and the princess. Mario have to attack the big_monster
* If he wins, he will meet the Princess and win the game.
* If he loses, he will lose the game.
