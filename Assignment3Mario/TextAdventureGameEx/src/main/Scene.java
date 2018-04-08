package main;

import java.util.ArrayList;
import java.util.List;

public class Scene {
	String name;
	String description;
	Hero hero;
	UsefulObject usefulObject;
	DangerousObject dangerousObject;
	
	public Scene(String name, String description, Hero hero) {
		super();
		this.name = name;
		this.description = description;
		this.hero = hero;
	}
	
	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public UsefulObject getUsefulObject() {
		return usefulObject;
	}

	public Scene setUsefulObject(UsefulObject usefulObject) {
		this.usefulObject = usefulObject;
		return this;
	}

	public DangerousObject getDangerousObject() {
		return dangerousObject;
	}

	public Scene setDangerousObject(DangerousObject dangerousObject) {
		this.dangerousObject = dangerousObject;
		return this;
	}
	
	
}
