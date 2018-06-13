//package dsl.enums causes problems for the transformation groovy script

enum RampConnectionTypes{
	AMPLITUDE("amplitude"), FREQUENCY("frequency")

	String name

	RampConnectionTypes(String name){
		this.name = name
	}

	/*
	 * Static utility methods
	 * are needed for the transformation scripts
	 */
	public static String printAllRampConnectionTypes(){
		def StringBuilder allNames = new StringBuilder()
		RampConnectionTypes.values().each{ ct ->
			allNames.append(ct.name + ", ")
		}
		allNames
	}

	public static boolean isValidRampConnectionType(String name){
		boolean found = false;
		RampConnectionTypes.values().each { ct ->
			if (ct.name == name){
				found = true;
			}
		}
		return found;
	}
}
