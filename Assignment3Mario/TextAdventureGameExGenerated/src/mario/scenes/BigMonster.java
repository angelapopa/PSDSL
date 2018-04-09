//generated
package mario.scenes;

import mario.objects.*;
import mario.characters.*;
import java.util.List;

import java.util.ArrayList;

public class BigMonster extends Scene{
	
	private String name = "BIG MONSTER AREA";
	private String description = "A BIG MONSTER is standing in front of you and \npreventing you to meet the princess. \nWhat do you do?";
	
	//constructor
	public BigMonster(){
		super();
		
		addStep(new AttackBigmonsterStep());
		addStep(new WalkThroughBigmonsterStep());
		addStep(new JumpOverBigmonsterStep());
	}
	
	//getter and setters
	public String getName(){
		return name;
	}
	public String getDescription(){
		return description;
	}
	
}
