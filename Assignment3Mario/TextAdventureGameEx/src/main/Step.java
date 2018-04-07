package main;

public class Step {
	String name;
	Action action;
	UsefulObject usefulObject;
	DangerousObject dangerousObject;

	public Step(String name, Action action, UsefulObject usefulObject) {
		super();
		this.name = name;
		this.action = action;
		this.usefulObject = usefulObject;
	}

	public Step(String name, Action action, DangerousObject dangerousObject) {
		super();
		this.name = name;
		this.action = action;
		this.dangerousObject = dangerousObject;
	}
	
	

}
