//generated
package mario.game;

public enum Action {
	
	PICK("Pick up"),WALK("Walk through"),ATTACK("Attack"),JUMP("Jump over");
	
	private String actionName;
	
	//constructor
	private Action(String actionName){
		this.actionName = actionName;
	}
	
	//getter
	public String getactionName(){
		return actionName;
	}
}

