package main;

public class BigMonster extends DangerousObject {

	int healthPoints;
	
	public BigMonster() {
		healthPoints = 7;
		this.actions.add(Action.ATTACK);
	}

	public int getHealthPoints() {
		return healthPoints;
	}

}
