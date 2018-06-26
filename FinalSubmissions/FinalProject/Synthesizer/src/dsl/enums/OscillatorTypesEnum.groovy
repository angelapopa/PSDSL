//package dsl.enums causes problems for the transformation groovy script

public enum OscillatorTypes{
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

	String name

	OscillatorTypes(String name){
		this.name = name
	}

	/*
	 * Static utility methods
	 * are needed for the transformation scripts
	 */
	public static String printAllOscillatorTypeNames(){
		def StringBuilder allNames = new StringBuilder()
		OscillatorTypes.values().each{ ct ->
			allNames.append(ct.name + ", ")
		}
		allNames
	}

	public static boolean isValidOscillatorType(String name){
		boolean found = false
		OscillatorTypes.values().each { ct ->
			if (ct.name == name){
				found = true
			}
		}
		found
	}
}
