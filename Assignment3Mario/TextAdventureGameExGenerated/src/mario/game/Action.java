//generated
package mario.game;

public enum Action {
	
	JUMP("Jump over"),ATTACK("Attack"),PICK("Pick up"),WALK("Walk through");
	
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

