
enum OscillatorTypes{
	FUNCTION("FunctionOscillator"), 
	IMPULSE("ImpulseOscillator"), 
	PULSE("PulseOscillator"), 
	REDNOISE("RedNoise"), 
	SAWTOOTH("SawtoothOscillator"), 
	SAWTOOTHBL("SawtoothOscillatorBL"), 
	SAWTOOTHDPW("SawtoothOscillatorDPW"), 
	SINE("SineOscillator"), 
	SQUARE("SquareOscillator"), 
	TRIANGLE("TriangleOscillator")
	
	def String name
	
	OscillatorTypes(String name){
		this.name = name
	}
}

enum ControlTypes{
	KNOB("knob"), SLIDER("slider")
	
	def String name
	
	ControlTypes(String name){
		this.name = name
	}
}

enum RampConnectionTypes{
	AMPLITUDE("amplitude"), FREQUENCY("frequency")
	
	def String name
	
	RampConnectionTypes(String name){
		this.name = name
	}
}

/*
 * Utility methods
 * TODO transform the 6 functions into 2 functions
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

public String printAllOscillatorTypeNames(){
	def StringBuilder allNames = new StringBuilder()
	OscillatorTypes.values().each{ ct ->
		allNames.append(ct.name + ", ")
	}
	allNames
}

public boolean isValidOscillatorType(String name){
	boolean found = false;
	OscillatorTypes.values().each { ct ->
		if (ct.name == name){
			found = true;
		}
	}
	return found;
}
