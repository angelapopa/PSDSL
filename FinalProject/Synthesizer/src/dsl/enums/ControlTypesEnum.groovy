//package dsl.enums causes problems for the transformation groovy script

public enum ControlTypes{
	KNOB("knob"), SLIDER("slider")

	String name

	ControlTypes(String name){
		this.name = name
	}

	/*
	 * Static utility methods
	 * are needed for the transformation scripts
	 */
	public static String printAllControlTypeNames(){
		def StringBuilder allNames = new StringBuilder()
		ControlTypes.values().each{ ct ->
			allNames.append(ct.name + ", ")
		}
		allNames
	}

	public static boolean isValidControlType(String name){
		boolean found = false;
		ControlTypes.values().each { ct ->
			if (ct.name == name){
				found = true;
			}
		}
		return found;
	}
}