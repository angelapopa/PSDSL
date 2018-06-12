package dsl.enums

enum OscillatorTypes{
	FUNCTION("FunctionOscillator"), 
	IMPULSE("ImpulseOscillator"),
	IMPULSEBL("ImpulseOscillatorBL"),
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
