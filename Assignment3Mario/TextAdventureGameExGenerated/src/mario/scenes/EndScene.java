//generated
package mario.scenes;

import mario.objects.*;
import mario.characters.*;
import java.util.List;

import java.util.ArrayList;

public class EndScene extends Scene{
	
	private String name = "THE END";
	private String descriptionIfDie = "Oh, you have died! \nYou have lost the game.";
	private String descriptionIfWin = "Congratulations! \n You have defeated the big monster and saved princess. \nYou are true hero!";
	
	//constructor
	public EndScene(){
		super();
		
	}
	
	//getter and setters
	public String getName(){
		return name;
	}
	public String getDescriptionIfDie(){
		return descriptionIfDie;
	}
	public String getDescriptionIfWin(){
		return descriptionIfWin;
	}
	
}
