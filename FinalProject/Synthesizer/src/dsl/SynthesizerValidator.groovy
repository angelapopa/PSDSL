oscillators.each { osc ->
	if (!isValidOscillatorType(osc.type)){
		throw new Exception("type "
			+ osc.type + " is not supported! Try one of the following >> " + printAllOscillatorTypeNames())
	}
}

controls.each { ct ->
	if (!isValidControlType(ct.type)){
		throw new Exception("type "
			+ ct.type + " is not supported! Try one of the following >> " + printAllControlTypeNames())
	}
}

linearRamps.each { ramp ->
	if (!isValidRampConnectionType(ramp.connectsTo)){
		throw new Exception("type "
			+ ramp.connectsTo + " is not supported! Try one of the following >> " + printAllRampConnectionTypes())
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
