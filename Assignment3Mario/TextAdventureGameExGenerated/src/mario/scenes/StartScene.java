//generated
package mario.scenes;

import mario.objects.*;
import mario.characters.*;
import java.util.List;

import java.util.ArrayList;

public class StartScene extends Scene{
	
	private String name = "MARIOLIKE";
	private String description = "This is a game similar to the classical Mario game.";
	private Character mario;
	private UsefulObject usefulObject;
	private DangerousObject dangerousObject;
	
	//constructor
	public StartScene(){
		super();
		
		addStep(new GoBombAreaStep());
	}
	
	//getter and setters
	public String getName(){
		return name;
	}
	public String getDescription(){
		return description;
	}
	
	public UsefulObject getUsefulObject(){
		return usefulObject;
	}
	
	public void setUsefulObject(UsefulObject usefulObject){
		this.usefulObject = usefulObject;
	}
	public DangerousObject getDangerousObject(){
		return dangerousObject;
	}
	
	public void setDangerousObject(DangerousObject dangerousObject){
		this.dangerousObject = dangerousObject;
	}
}
