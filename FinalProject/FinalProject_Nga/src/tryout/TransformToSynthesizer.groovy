package tryout
def filePath = new File(".").absolutePath.replace('.', '')

def dslDef = new File(filePath+ '/src/tryout/synthesizerObject.groovy').text
def dsl = new File(filePath + '/src/tryout/synthesizerEditor.dsl').text

//def controlsOutput = filePath + 'src/json/controls.json'
def oscillatorsOutput = filePath + 'src/json/oscillators.json'
def componentsOutput = filePath + 'src/json/components.json'
//def linearRampsOutput = filePath + 'src/json/linearRamps.json'
def lineOutsOutput = filePath + 'src/json/lineOuts.json'

def script = """
${dslDef}

${dsl}

new File('${oscillatorsOutput}').write(new groovy.json.JsonBuilder(oscillators).toPrettyString())
new File('${lineOutsOutput}').write(new groovy.json.JsonBuilder(lineOuts).toPrettyString())
"""
/*
new File('${layoutsOutput}').write(new groovy.json.JsonBuilder(layouts).toPrettyString())
new File('${gridLayoutsOutput}').write(new groovy.json.JsonBuilder(gridLayouts).toPrettyString())
new File('${framesOutput}').write(new groovy.json.JsonBuilder(frames).toPrettyString())
*/

new GroovyShell().evaluate(script)

println 'the dsl data was exported to following files:'
println oscillatorsOutput
println lineOutsOutput
println filePath