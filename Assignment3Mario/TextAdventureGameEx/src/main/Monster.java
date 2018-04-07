package main;

public class Monster extends DangerousObject {
	
	int healthPoints;

	public Monster() {
		healthPoints = 3;
		this.actions.add(Action.ATTACK);
	}

	public int getHealthPoints() {
		return healthPoints;
	}
}
