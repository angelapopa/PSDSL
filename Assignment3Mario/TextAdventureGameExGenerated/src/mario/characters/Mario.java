//generated
package mario.characters;

import mario.objects.*;

public class Mario {
	
	private String name = "Mario";
	private int healthPoints = 10;
	
	
	//constructors
	public Mario(){
	}
	
	public Mario(int healthPoints){
		this.healthPoints = healthPoints;
	}
	
							
	//methods			
	public void walkthroughMonster(Monster monster){
		//no action is required
	}
	
	public void attackMonster(Monster monster){
		this.healthPoints -= monster.getHealthPoints();
		if (this.healthPoints < 0) {
			setHealthPoints(0);
		}
	}
	
	public void jumpoverMonster(Monster monster){
		//no action is required
	}
	
	public void walkthroughBigMonster(BigMonster big_monster){
		//no action is required
	}
	
	public void attackBigMonster(BigMonster big_monster){
		this.healthPoints -= big_monster.getHealthPoints();
		if (this.healthPoints < 0) {
			setHealthPoints(0);
		}
	}
	
	public void jumpoverBigMonster(BigMonster big_monster){
		//no action is required
	}
	
	public void pickupBomb(Bomb bomb){
		this.healthPoints += bomb.getHealthPoints();
	}
	
	public void jumpoverBomb(Bomb bomb){
		//no action is required
	}
	
	public void pickupMushroom(Mushroom mushroom){
		this.healthPoints += mushroom.getHealthPoints();
	}
	
	public void jumpoverMushroom(Mushroom mushroom){
		//no action is required
	}
	
	//getters and setters
	public int getHealthPoints(){
		return healthPoints;
	}
	
	public void setHealthPoints(int healthPoints){
		this.healthPoints = healthPoints;
	}
}

