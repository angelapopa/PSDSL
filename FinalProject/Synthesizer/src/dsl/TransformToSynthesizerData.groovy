def filePath = new File(".").absolutePath.replace('.', '')

def dslDef = new File(filePath+ '/src/dsl/synthesizer.groovy').text
def dsl = new File(filePath + '/src/dsl/synthesizerEditor.dsl').text

def controlsOutput = filePath + 'src/json/controls.json'
def oscillatorsOutput = filePath + 'src/json/oscillators.json'
def linearRampsOutput = filePath + 'src/json/linearRamps.json'
def connectionsOutput = filePath + 'src/json/connections.json'

def script = """
${dslDef}

${dsl}

oscillators.each { osci ->
		if (!isValidEnumName(osci.amplitude.uiType)){
			throw new Exception("type "
				+ osci.amplitude.uiType + " is not supported! Try one of the following >> " + printAllControlTypeNames())
		}
		if (!isValidEnumName(osci.frequency.uiType)){
			throw new Exception("type "
				+ osci.frequency.uiType + " is not supported! Try one of the following >> " + printAllControlTypeNames())
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