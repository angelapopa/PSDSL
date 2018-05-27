def filePath = new File(".").absolutePath
filePath.replace('.', '')

def dslDef = new File(filePath+ '/src/dsl/synthesizer.groovy').text
def dsl = new File(filePath + '/src/dsl/synthesizerEditor.dsl').text
//def templateLogic = new File(filePath + '/src/dsl/Template_Nga.groovy').text

def script = """
${dslDef}

${dsl}

println controls.get(0).getX()
println sounds.get(0).getMinimum()
println components.get(0).getActualValue()
"""

new GroovyShell().evaluate(script)