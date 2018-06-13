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

linearRamps.each { ramp ->
	if (!RampConnectionTypes.isValidRampConnectionType(ramp.connectsTo)){
		throw new Exception("type "
			+ ramp.connectsTo + " is not supported! Try one of the following >> " + RampConnectionTypes.printAllRampConnectionTypes())
	}
}

connections.each { conn ->
	boolean found = false
	controls.each { ct ->
		if (ct.name == conn.from){
			found = true
		}
	}
	if (!found){
		throw new Exception("Please use UnitControllers as connection source! " + conn.from + " is no UnitControllder!")
	}

    found = false
	oscillators.each { osc ->
		if (osc.name == conn.to){
			found = true
		}
	}
	if (!found){
		throw new Exception("Please use UnitOscillators as connection destination! " + conn.to + " is no UnitOscillator!")
	}	
}

waveformOperations.each { w ->
	if (!ArithFunctionTypes.isValidArithFunctionType(w)){
	throw new Exception("type "
			+ w + " is not supported! Try one of the following >> " + ArithFunctionTypes.printAllArithFunctionTypeNames())
}
	
}

