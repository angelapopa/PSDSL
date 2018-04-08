//generated
package mario.objects;

import java.lang.*;


public class Bomb extends UsefulObject{
	
	private String description = "Bomb";
	private int healthPoints = 3;
	
	
	//constructors
	public Bomb(){
		super();
	}
	
	public Bomb(String description, int healthPoints){
		this.description = description;
		this.healthPoints = healthPoints;
	}
	
	
	//methods
	
	//getters and setters
	public String getDescription(){
		return description;
	}
	public int getHealthPoints(){
		return healthPoints;
	}
}

