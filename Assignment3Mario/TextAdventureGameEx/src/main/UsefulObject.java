package main;

import java.util.ArrayList;
import java.util.List;

public class UsefulObject {
	List<Action> actions;

	public UsefulObject() {
		
		actions = new ArrayList<Action>();
		actions.add(Action.PICK);
		actions.add(Action.JUMP);
	}

	public List<Action> getActions() {
		return actions;
	}

}
