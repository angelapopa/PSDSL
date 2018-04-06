package main;

public class Hero {
	
	String name;
	int healthPoints;

	public Hero() {
		this.name = "Mario";
		this.healthPoints = 10;
	}

	public int getHealthPoints() {
		return healthPoints;
	}

	public void setHealthPoints(int healthPoints) {
		this.healthPoints = healthPoints;
	}

	public void pickupBomb(Bomb bomb) {
		this.healthPoints += bomb.getHealthPoints();
	}
	
	public void pickupMushroom(Mushroom mushroom) {
		this.healthPoints += mushroom.getHealthPoints();
	}
	
	public void attackMonster(Monster monster) {
		this.healthPoints -= monster.getHealthPoints();
		if (this.healthPoints < 0) {
			setHealthPoints(0);
		}
	}
	
	public void attackBigMonster(BigMonster monster) {
		this.healthPoints -= monster.getHealthPoints();
		if (this.healthPoints < 0) {
			setHealthPoints(0);
		}
	}
}
