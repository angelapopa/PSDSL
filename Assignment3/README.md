# PSDSL
A DSL project for game design

Level: assignment 3

# Description

We construct a simple, interactive game code-base, which simulates the Mario game with some features removed or added (thus we call the future generated game as "Mariolike"). 
The story plot for first version is: Mario will have to rescue the Princess. On the way to the highest tower where stayed the Princess, he will get through some obstacles (DangerousObject) and collect some helpful stuffs (UsefulObject). There is a big monster guarding the tower and Mario have to defeat it to meet the Princess and win the game.

# # Define Objects:

Main character: Mario  
Side character: the Princess  
Object: DangerousObject | UsefulObject  
DangerousObject: big monster | monster | hole  
UsefulObject: bomb | mushroom  

# # Define Steps:
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
