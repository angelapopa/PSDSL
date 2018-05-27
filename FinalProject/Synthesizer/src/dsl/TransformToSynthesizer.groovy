def filePath = new File(".").absolutePath
filePath.replace('.', '')

def dslDef = new File(filePath+ '/src/dsl/synthesizer.groovy').text
def dsl = new File(filePath + '/src/dsl/synthesizerEditor.dsl').text
//def templateLogic = new File(filePath + '/src/dsl/Template_Nga.groovy').text

def script = """
${dslDef}

${dsl}

print controls.get(0).getX()
"""

new GroovyShell().evaluate(script)