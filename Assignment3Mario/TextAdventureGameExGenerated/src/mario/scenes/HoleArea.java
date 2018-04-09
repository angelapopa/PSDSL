//generated
package mario.scenes;

import mario.steps.*;
import mario.objects.*;
import mario.characters.*;

import java.util.List;
import java.util.ArrayList;

public class HoleArea extends Scene{
	
	private String name = "HOLE AREA";
	private String description = "There is a hole in the floor. \nWhat do you do?";
	
	//constructor
	public HoleArea(){
		super();
		
		addStep(new WalkThroughHoleStep());
		addStep(new JumpOverHoleStep());
	}
	
	//getter and setters
	public String getName(){
		return name;
	}
	public String getDescription(){
		return description;
	}
	
}
