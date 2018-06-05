//Note: did not manage to combine all groovy files via bindings,
// so the dsl editor and the grammar definition generate some json output (TransformToSynthesizerData.groovy)
// which is then used as input for the third file (MOP.groovy)

def filePath = new File(".").absolutePath.replace('.', '')

new GroovyShell().evaluate(new File(filePath + '/src/dsl/TransformToSynthesizerData.groovy'))
new GroovyShell().evaluate(new File(filePath + '/src/dsl/MOP.groovy'))