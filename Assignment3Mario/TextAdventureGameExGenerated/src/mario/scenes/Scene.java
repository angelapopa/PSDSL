//generated
package mario.scenes;

import mario.objects.*;
import mario.characters.*;
import java.util.List;

public class Scene {
	
	List<Step> steps;
	
	//constructor
	public Scene(){
	}
	
	//methods
	public void addStep(Step step){
		this.steps.add(step);
	}
	
	//getters and setters
	public List<Step> getSteps() {
		return steps;
	}
