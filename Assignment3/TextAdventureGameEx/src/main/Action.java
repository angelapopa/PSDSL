package main;

public enum Action {
	JUMP("Jump over"),
	PICK("Pick up"),
	WALK("Walk through"),
	ATTACK("Attack");
	
	private String actionName;

	private Action(String actionName) {
		this.actionName = actionName;
	}

	public String getActionName() {
		return actionName;
	}
}
