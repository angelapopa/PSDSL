def file1 = "/dsl/synthesizerDSL.groovy"
def dslDef = new File(file1).text
def dsl = new File('synthetizer.dsl').text
def script = """
${dslDef}

${dsl}

println "$rotaryKnob.x, $rotaryKnob.y, $rotaryKnob.width, $rotaryKnob.heigth"
"""
new GroovyShell().evaluate(script)