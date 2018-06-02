package tryout
//DSL definition

def rotaryKnob(RotaryValues values) {
	return values
}

def controls = []
def sounds = []
def components = []

def layouts = []
def linearRamps = []
def lineOuts = []

class Property {
	def visibility
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

class LinearRampInput {
	def minimum
	def maximum
	def actualValue
}

class LinearRampTime {
	def duration
}

def class LinearRamp extends Property {
	String rampName
	LinearRampInput input
	LinearRampTime time
}

def class LineOut
{
	int startValue
	int endValue
}
