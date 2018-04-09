//generated
package mario.game;

public enum Action {
	
	ATTACK("Attack"),JUMP("Jump over"),WALK("Walk through"),PICK("Pick up");
	
	private String actionName;
	
	//constructor
	private Action(String actionName){
		this.actionName = actionName;
	}
	
	//getter
	public String getActionName(){
		return actionName;
	}
}

