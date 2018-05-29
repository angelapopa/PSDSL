/*
 * http://docs.groovy-lang.org/next/html/documentation/template-engines.html
 */

package dsl

import org.apache.ivy.core.module.descriptor.ExtendsDescriptor;

import RotaryValues;
import groovy.text.SimpleTemplateEngine


// Component definition
class Function {
	def visibility
	def type
	def name

	String print() {
		print "$visibility $type $name() {\n}\n"
	}
}

class Property {
	def visibility
	def type
	def name
	def decl() {
		return "$visibility $type $name;"
	}
}

def rotaryKnob2(RotaryValues values) {
	return values
}

def class RotaryValues
{
	int x
	int y
	int width
	int height
	def createRotationController(int count) {
		return "RotaryTextController knob$count  = new RotaryTextController($x);"
	}
}

def class LinearRampInput {
	def minimum
	def maximum
	def actualValue
	def setInputValue() {
		return ".input.setup($minimum, $actualValue, $maximum);"
	}
}

def class LinearRampTime {
	def duration
	def setDuration() {
		return ".time.set($duration);"
	}
}

def class LinearRamp extends Property {
	String rampName
	LinearRampInput input
	LinearRampTime time
	def getRampName(int count) {
		rampName = "$name$count"
	}
	def decl() {
		println "$visibility $type $rampName;"
	}
	def setInputValue() {
		if (input != null) {
			return "$rampName" + input.setInputValue()
		}
	}
	def setDuration() {
		if (time != null) {
			return "$rampName" + time.setDuration()
		}
	}
}

///different file
/*DSL usage*/

// Template sample
String script = '''
<% functions.each{it.print()} %>
<% int count = 0
control_list.each{println it.createRotationController(count++)} %>
<%count = 0
ramp_list.each{it.getRampName(count); it.decl(); 
println it.setInputValue(); println it.setDuration()} %>

		'''
def list = [
	new Function(visibility: "public", type: "void", name: "init"),
	new Function(visibility: "public", type: "void", name: "start"),
	new Function(visibility: "public", type: "void", name: "stop")
]

def controls = []
def sound(){}
def ramps = []
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
		
ramps
	.add(new LinearRamp(
		name: 'ramp',
		visibility: 'private',
		type: 'LinearRamp',
		input: new LinearRampInput(
			minimum: 0.0, 
			actualValue: 0.5, 
			maximum: 1.0
		),
		time: new LinearRampTime(
			duration: 0.2
			)
		))

// Start Template engine
def binding = [
	functions: list,
	control_list: controls,
	ramp_list: ramps
]
def engine = new SimpleTemplateEngine()
def template = engine.createTemplate(script).make(binding)
println template.toString()


