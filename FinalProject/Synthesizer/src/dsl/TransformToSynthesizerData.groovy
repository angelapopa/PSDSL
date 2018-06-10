def filePath = new File(".").absolutePath.replace('.', '')

def dslDef = new File(filePath+ '/src/dsl/synthesizerGrammar.groovy').text
def dsl = new File(filePath + '/src/dsl/synthesizerEditor.dsl').text

def controlsOutput = filePath + 'src/json/controls.json'
def oscillatorsOutput = filePath + 'src/json/oscillators.json'
def linearRampsOutput = filePath + 'src/json/filters.json'
def connectionsOutput = filePath + 'src/json/connections.json'

def script = """
${dslDef}

${dsl}

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

new File('${controlsOutput}').write(new groovy.json.JsonBuilder(controls).toPrettyString())
new File('${oscillatorsOutput}').write(new groovy.json.JsonBuilder(oscillators).toPrettyString())
new File('${linearRampsOutput}').write(new groovy.json.JsonBuilder(linearRamps).toPrettyString())
new File('${connectionsOutput}').write(new groovy.json.JsonBuilder(connections).toPrettyString())
"""

new GroovyShell().evaluate(script)

println 'the dsl data was exported to following files:'
println controlsOutput
println oscillatorsOutput
println linearRampsOutput
println connectionsOutput