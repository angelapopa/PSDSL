package dsl.enums

enum RampConnectionTypes{
	AMPLITUDE("amplitude"), FREQUENCY("frequency")
	
	def String name
	
	RampConnectionTypes(String name){
		this.name = name
	}
}

public String printAllRampConnectionTypes(){
	def StringBuilder allNames = new StringBuilder()
	RampConnectionTypes.values().each{ ct ->
		allNames.append(ct.name + ", ")
	}
	allNames
}

public boolean isValidRampConnectionType(String name){
	boolean found = false;
	RampConnectionTypes.values().each { ct ->
		if (ct.name == name){
			found = true;
		}
	}
	return found;
}
