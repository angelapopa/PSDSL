//generated
package mario.objects;

import java.lang.*;

import java.util.ArrayList;
import java.util.List;

public class UsefulObject {
	
	List<Action> actions;
	
	//constructor
	public UsefulObject() {
		this.actions = new ArrayList<Action>();
		this.actions.add(Action.PICK);
		this.actions.add(Action.JUMP);
	}
	
	//getters and setters
	public List<Action> getActions() {
		return actions;
	}
}


