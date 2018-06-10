package dsl

//DSL definition
def rotaryKnob(RotaryValues values) {
	return values
}

def controls = []
def oscillators = []
def connections = []
def linearRamps = []

enum ControlTypes{
	KNOB("knob"), SLIDER("slider")
	
	def String name
	
	ControlTypes(String name){
		this.name = name
	}
}

class UnitGenerator {
	def type
	def name
}

def class RotaryValues
{
	String name
	int digits
}

def class Amplitude
{
	String uiType
	float minimum
	float maximum
	float defaultValue
}

def class Frequency
{
	String uiType 
	float minimum
	float maximum
	float defaultValue
}

def class Oscillator extends UnitGenerator {
	Amplitude amplitude
	Frequency frequency
}

class LinearRampInput {
	def minimum
	def maximum
	def actualValue
}

class LinearRampTime {
	def duration
}

def class LinearRamp extends UnitGenerator {
	LinearRampInput input
	LinearRampTime time
}

def class Connection
{
	String linear
	String from
	String to
}

/*
 * Utility methods
 */

public String printAllControlTypeNames(){
	def StringBuilder allNames = new StringBuilder()
	ControlTypes.values().each{ ct ->
		allNames.append(ct.name + ", ")
	}
	allNames
}

public boolean isValidEnumName(String name){
	boolean found = false;
	ControlTypes.values().each { ct ->
		if (ct.name == name){
			found = true;
		}
	}
	return found;
}