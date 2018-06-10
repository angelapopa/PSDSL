package dsl

//DSL definition
def rotaryKnob(RotaryValues values) {
	return values
}

def controls = []
def oscillators = []
def connections = []
def linearRamps = []

class UnitGenerator {
	def type
	def name
}

def class RotaryValues
{
	String name
	int digits
}

def class Frequency
{
	float minimum
	float maximum
	float defaultValue
}

def class Oscillator extends UnitGenerator {
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
