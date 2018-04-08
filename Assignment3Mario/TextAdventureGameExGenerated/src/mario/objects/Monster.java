//generated
package mario.objects;

import java.lang.*;


public class Monster extends DangerousObject{
	
	private String description = "Monster";
	private int healthPoints = 3;
	
	
	//constructors
	public Monster(){
		super();
	}
	
	public Monster(String description, int healthPoints){
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

