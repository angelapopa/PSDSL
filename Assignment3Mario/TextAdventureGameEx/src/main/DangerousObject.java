package main;

import java.util.ArrayList;
import java.util.List;

public class DangerousObject {
	List<Action> actions;

	public DangerousObject() {
		actions = new ArrayList<Action>();
		actions.add(Action.WALK);
		actions.add(Action.JUMP);
	}

	public List<Action> getActions() {
		return actions;
	}

}
