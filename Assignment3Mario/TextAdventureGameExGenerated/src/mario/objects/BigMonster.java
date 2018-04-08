//generated
package mario.objects;

import java.lang.*;


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

