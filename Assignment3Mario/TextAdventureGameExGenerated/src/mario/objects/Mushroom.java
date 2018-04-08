//generated
package mario.objects;

import mario.game.*;


public class Mushroom extends UsefulObject{
	
	private String description = "Mushroom";
	private int healthPoints = 2;
	
	
	//constructors
	public Mushroom(){
		super();
	}
	
	public Mushroom(String description, int healthPoints){
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

