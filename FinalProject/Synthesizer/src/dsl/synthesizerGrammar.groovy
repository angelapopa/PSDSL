package dsl

/*
 * DSL definition
 */

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

enum RampConnectionTypes{
	AMPLITUDE("amplitude"), FREQUENCY("frequency")
	
	def String name
	
	RampConnectionTypes(String name){
		this.name = name
	}
}

class UnitGenerator {
	def type
	def name
}

class UnitController {
	def type
	def name
}

def class RotaryKnob extends UnitController
{
	int digits
}

def class Slider extends UnitController
{
}

def class Amplitude
{
	float minimum
	float maximum
	float defaultValue
}

def class Frequency
{
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
	String name
	String connectsTo
	LinearRampInput input
	LinearRampTime time
}

def class Connection
{
	String filter
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
	
	public boolean isValidControlType(String name){
		boolean found = false;
		ControlTypes.values().each { ct ->
			if (ct.name == name){
				found = true;
			}
		}
		return found;
	}

public String printAllRampConnectionTypes(){
	def StringBuilder allNames = new StringBuilder()
	RampConnectionTypes.values().each{ ct ->
		allNames.append(ct.name + ", ")
	}
	allNames
}

public boolean isValidRampConnectionType(String name){
	boolean found = false;
	RampConnectionTypes.values().each { ct ->
		if (ct.name == name){
			found = true;
		}
	}
	return found;
}