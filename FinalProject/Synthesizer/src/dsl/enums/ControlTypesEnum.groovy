package dsl.enums

enum ControlTypes{
	KNOB("knob"), SLIDER("slider")
	
	def String name
	
	ControlTypes(String name){
		this.name = name
	}
}

/*
 * Utility methods
 */

public String printAllControlTypeNames(){
	def StringBuilder allNames = new StringBuilder()
		ControlTypes.values().each{ ct ->
			allNames.append(ct.name + ", ")
		}
		allNames
	}
	
public boolean isValidControlType(String name){
		boolean found = false;
		ControlTypes.values().each { ct ->
			if (ct.name == name){
				found = true;
			}
		}
		return found;
	}
