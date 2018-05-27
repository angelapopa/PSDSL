/*
 * http://docs.groovy-lang.org/next/html/documentation/template-engines.html
 */

package dsl

import RotaryValues;
import groovy.text.SimpleTemplateEngine

class Function {
	def visibility
	def type
	def name

	String print() {
		print "$visibility $type $name() {\n}\n"
	}
}

def rotaryKnob2(RotaryValues values) {
	return values
}

def controls = []
def sound(){}

def class RotaryValues
{
	int x
	int y
	int width
	int height
	def createRotationController(int count) {
		return "RotaryTextController knob$count  = new RotaryTextController($x)\n"
	}
}

///different file
/*DSL usage*/

// Template sample
String script = '''
<% functions.each{it -> it.print()%>
<%} %>
<% int count = 0
control_list.each{it -> print it.createRotationController(count++)  %>
<%} %>

		'''
def list = [
	new Function(visibility: "public", type: "void", name: "init"),
	new Function(visibility: "public", type: "void", name: "start"),
	new Function(visibility: "public", type: "void", name: "stop")
]

controls
		.add(rotaryKnob2(
		new RotaryValues(
		x: 10,
		y: 2,
		width: 20,
		height: 20
		)
		))

controls
		.add(rotaryKnob2(
		new RotaryValues(
		x: 10,
		y: 2,
		width: 20,
		height: 20
		)
		))

def binding = [
	functions: list,
	control_list: controls
]
def engine = new SimpleTemplateEngine()
def template = engine.createTemplate(script).make(binding)
println template.toString()


