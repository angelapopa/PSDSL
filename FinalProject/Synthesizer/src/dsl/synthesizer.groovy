package dsl

//DSL definition
def rotaryKnob(RotaryValues values) {
	return values
}

def controls = []
def sounds = []
def components = []
def lineOuts = []

class UnitGenerator {
	def type
	def name
}

def class RotaryValues
{
	int x
	int y
	int width
	int height
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

def class LineOut
{
	int startValue
	int endValue
}
