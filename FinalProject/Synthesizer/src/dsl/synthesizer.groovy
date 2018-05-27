//DSL definition

def rotaryKnob(RotaryValues values) {
	return values
}

def controls = []
def sounds = []
def components = []

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

def class Frequency
{
	float minimum
	float maximum
	float defaultValue
}

def class LinearRamp
{
	float minimum
	float maximum
	float actualValue
}
