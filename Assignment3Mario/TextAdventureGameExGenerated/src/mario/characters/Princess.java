//generated
package mario.characters;

import mario.objects.*;

public class Princess {
	
	private String name = "Princess";
	private int healthPoints = 50;
	
	
	//constructors
	public Princess(){
	}
	
	public Princess(int healthPoints){
		this.healthPoints = healthPoints;
	}
	
							
	//methods			
	public void attackMonster(Monster monster){
		this.healthPoints -= monster.getHealthPoints();
		if (this.healthPoints < 0) {
			setHealthPoints(0);
		}
	}
	
	public void walkthroughMonster(Monster monster){
		//no action is required
	}
	
	public void jumpoverMonster(Monster monster){
		//no action is required
	}
	
	public void attackBigMonster(BigMonster bigMonster){
		this.healthPoints -= bigMonster.getHealthPoints();
		if (this.healthPoints < 0) {
			setHealthPoints(0);
		}
	}
	
	public void walkthroughBigMonster(BigMonster bigMonster){
		//no action is required
	}
	
	public void jumpoverBigMonster(BigMonster bigMonster){
		//no action is required
	}
	
	public void jumpoverMushroom(Mushroom mushroom){
		//no action is required
	}
	
	public void pickupMushroom(Mushroom mushroom){
		this.healthPoints += mushroom.getHealthPoints();
	}
	
	public void jumpoverBomb(Bomb bomb){
		//no action is required
	}
	
	public void pickupBomb(Bomb bomb){
		this.healthPoints += bomb.getHealthPoints();
	}
	
	//getters and setters
	public int getHealthPoints(){
		return healthPoints;
	}
	
	public void setHealthPoints(int healthPoints){
		this.healthPoints = healthPoints;
	}
}

