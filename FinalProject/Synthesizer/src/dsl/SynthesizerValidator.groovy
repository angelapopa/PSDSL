oscillators.each { osc ->
	if (!OscillatorTypes.isValidOscillatorType(osc.type)){
		throw new Exception("type "
			+ osc.type + " is not supported! Try one of the following >> " + OscillatorTypes.printAllOscillatorTypeNames())
	}
}

controls.each { ct ->
	if (!ControlTypes.isValidControlType(ct.type)){
		throw new Exception("type "
			+ ct.type + " is not supported! Try one of the following >> " + ControlTypes.printAllControlTypeNames())
	}
}

filters.each { ramp ->
	if (ramp.type == (GroovyObject) FilterTypes.LINEAR_RAMP &&
		!RampConnectionTypes.isValidRampConnectionType(ramp.connectsTo)){
		throw new Exception("type "
			+ ramp.connectsTo + " is not supported! Try one of the following >> " + RampConnectionTypes.printAllRampConnectionTypes())
	}
}

connections.each { conn ->
	boolean found = false
	controls.each { ct ->
		if (ct.name == conn.fromController){
			found = true
		}
	}
	if (!found){
		throw new Exception("Please use UnitControllers as connection source! " + conn.fromController + " is no UnitController!")
	}

    found = false
	oscillators.each { osc ->
		if (osc.name == conn.toOscillator){
			found = true
		}
	}
	if (!found){
		throw new Exception("Please use UnitOscillators as connection destination! " + conn.toOscillator + " is no UnitOscillator!")
	}	
}

waveformOperations.each { w ->
	if (!ArithFunctionTypes.isValidArithFunctionType(w)){
	throw new Exception("type "
			+ w + " is not supported! Try one of the following >> " + ArithFunctionTypes.printAllArithFunctionTypeNames())
	}
}

if (waveformOperations.size() > 1){
	throw new Exception("Too many values. Only one operation for combining waveforms is supported!")
}

