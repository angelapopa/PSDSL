//generated
package mario.steps;

import mario.scenes.Scene;
		
public class Step {
			
	private Condition condition;
	private Scene scene;
		
	//constructors
	public Step(){
	}
	
	public Step(Condition condition, Scene scene){
		this.condition = condition;
		this.scene = scene;
	}
	
	//getters and setters
	public Condition getCondition() {
		return this.condition;
	}
