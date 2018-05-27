/*
 * http://docs.groovy-lang.org/next/html/documentation/template-engines.html
 */

package tryout

import groovy.text.SimpleTemplateEngine

class Function {
	def visibility
	def type
	def name 
	
	String print() {
		print "$visibility $type $name() {\n}\n"
	}

	static main(args) {
		// Template sample
		String script = '''
<% functions.each{it -> it.print()%>
<%} %>
RotaryTextController knob = new RotaryTextController()
		'''
		def list = [
			new Function(visibility: "public", type: "void", name: "init"),
			new Function(visibility: "public", type: "void", name: "start"),
			new Function(visibility: "public", type: "void", name: "stop")
			]
		def binding = [
			functions: list
			]
		def engine = new SimpleTemplateEngine()
		def template = engine.createTemplate(script).make(binding)
		println template.toString()
	}

}
