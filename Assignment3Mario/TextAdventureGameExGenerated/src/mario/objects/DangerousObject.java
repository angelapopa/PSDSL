//generated
package mario.objects;

import mario.game.*;

import java.util.ArrayList;
import java.util.List;

public class DangerousObject {
	
	List<Action> actions;
	
	//constructor
	public DangerousObject() {
		this.actions = new ArrayList<Action>();
		this.actions.add(Action.WALK);
		this.actions.add(Action.JUMP);
	}
	
	//getters and setters
	public List<Action> getActions() {
		return actions;
	}
}


