package tryout
def filePath = new File(".").absolutePath.replace('.', '')

def dslDef = new File(filePath+ '/src/tryout/synthesizer.groovy').text
def dsl = new File(filePath + '/src/tryout/synthesizerEditor.dsl').text

def controlsOutput = filePath + 'src/json/controls.json'
def soundsOutput = filePath + 'src/json/sounds.json'
def componentsOutput = filePath + 'src/json/components.json'
def linearRampsOutput = filePath + 'src/json/linearRamps.json'
def lineOutsOutput = filePath + 'src/json/lineOuts.json'

def script = """
${dslDef}

${dsl}

println controls.get(0).getX()
// ERROR here; delete file will handle exception

new File('${controlsOutput}').write(new groovy.json.JsonBuilder(controls).toPrettyString())
new File('${soundsOutput}').write(new groovy.json.JsonBuilder(sounds).toPrettyString())
new File('${componentsOutput}').write(new groovy.json.JsonBuilder(components).toPrettyString())
new File('${linearRampsOutput}').write(new groovy.json.JsonBuilder(linearRamps).toPrettyString())
new File('${lineOutsOutput}').write(new groovy.json.JsonBuilder(lineOuts).toPrettyString())
"""
/*
new File('${layoutsOutput}').write(new groovy.json.JsonBuilder(layouts).toPrettyString())
new File('${gridLayoutsOutput}').write(new groovy.json.JsonBuilder(gridLayouts).toPrettyString())
new File('${framesOutput}').write(new groovy.json.JsonBuilder(frames).toPrettyString())
*/

new GroovyShell().evaluate(script)

println 'the dsl data was exported to following files:'
println controlsOutput
println soundsOutput
println componentsOutput