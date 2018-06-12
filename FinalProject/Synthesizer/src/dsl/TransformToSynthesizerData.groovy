def filePath = new File(".").absolutePath.replace('.', '')

def dslControlTypes = new File(filePath+ '/src/dsl/ControlTypesEnum.groovy').text
def dslOscillatorTypes = new File(filePath+ '/src/dsl/OscillatorTypesEnum.groovy').text
def dslRampConnectionTypes = new File(filePath+ '/src/dsl/RampConnectionTypesEnum.groovy').text

def dslDef = new File(filePath+ '/src/dsl/synthesizerGrammar.groovy').text
def dsl = new File(filePath + '/src/dsl/synthesizerEditor.dsl').text
def dslValidator = new File(filePath + '/src/dsl/SynthesizerValidator.groovy').text

def controlsOutput = filePath + 'src/json/controls.json'
def oscillatorsOutput = filePath + 'src/json/oscillators.json'
def linearRampsOutput = filePath + 'src/json/filters.json'
def connectionsOutput = filePath + 'src/json/connections.json'

def script = """
${dslDef}
${dsl}

${dslControlTypes}
${dslOscillatorTypes}
${dslRampConnectionTypes}

${dslValidator}

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