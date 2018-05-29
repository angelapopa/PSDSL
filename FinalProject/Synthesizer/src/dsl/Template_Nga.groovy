/*
 * http://docs.groovy-lang.org/next/html/documentation/template-engines.html
 */

import groovy.json.JsonSlurper
import groovy.text.SimpleTemplateEngine
import dsl.TestOsci


def filePath = new File(".").absolutePath.replace('.', '')
def sluper = new JsonSlurper()
def controls = sluper.parse(new FileReader(filePath + '/src/json/controls.json'))
def sounds = sluper.parse(new FileReader(filePath + '/src/json/sounds.json'))


//call
new TestOsci().init(controls, sounds);

class Function {
	def visibility
	def type
	def name

	String print() {
		print "$visibility $type $name() {\n}\n"
	}
}

// Template sample
String script = '''
<%
 def createRotationController(control_element, count) {
		return "RotaryTextController knob$count  = new RotaryTextController($control_element.x)"
  }
%>
<% functions.each{it -> it.print()%>
<%} %>
<% int count = 0
control_list.each{it -> print createRotationController(it, count++)  %>
<%} %>

		'''
def list = [
	new Function(visibility: "public", type: "void", name: "init"),
	new Function(visibility: "public", type: "void", name: "start"),
	new Function(visibility: "public", type: "void", name: "stop")
]

def binding = [
	functions: list,
	control_list: controls
]
def engine = new SimpleTemplateEngine()
def template = engine.createTemplate(script).make(binding)
println template.toString()


