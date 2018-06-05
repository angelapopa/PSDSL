def filePath = new File(".").absolutePath.replace('.', '')

def dslDef = new File(filePath+ '/src/dsl/synthesizer.groovy').text
def dsl = new File(filePath + '/src/dsl/synthesizerEditor.dsl').text

def oscillatorsOutput = filePath + 'src/json/oscillators.json'
def lineOutsOutput = filePath + 'src/json/lineOuts.json'
def linearRampsOutput = filePath + 'src/json/linearRamps.json'

def script = """
${dslDef}

${dsl}

new File('${oscillatorsOutput}').write(new groovy.json.JsonBuilder(oscillators).toPrettyString())
new File('${lineOutsOutput}').write(new groovy.json.JsonBuilder(lineOuts).toPrettyString())
new File('${linearRampsOutput}').write(new groovy.json.JsonBuilder(linearRamps).toPrettyString())
"""

new GroovyShell().evaluate(script)

println 'the dsl data was exported to following files:'
println oscillatorsOutput
println lineOutsOutput
println linearRampsOutput