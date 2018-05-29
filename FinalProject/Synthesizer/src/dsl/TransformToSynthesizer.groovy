def filePath = new File(".").absolutePath.replace('.', '')

def dslDef = new File(filePath+ '/src/dsl/synthesizer.groovy').text
def dsl = new File(filePath + '/src/dsl/synthesizerEditor.dsl').text

def controlsOutput = filePath + 'src/json/controls.json'
def soundsOutput = filePath + 'src/json/sounds.json'
def componentsOutput = filePath + 'src/json/components.json'

def script = """
${dslDef}

${dsl}

println controls.get(0).getX()
println sounds.get(0).getMinimum()
println components.get(0).getActualValue()

new File('${controlsOutput}').write(new groovy.json.JsonBuilder(controls).toPrettyString())
new File('${soundsOutput}').write(new groovy.json.JsonBuilder(sounds).toPrettyString())
new File('${componentsOutput}').write(new groovy.json.JsonBuilder(components).toPrettyString())
"""

new GroovyShell().evaluate(script)

println 'the dsl data was exported to following files:'
println controlsOutput
println soundsOutput
println componentsOutput