//DSL definition

def rotaryKnob(RotaryValues values) {
	return values
}

def controls = []
def sounds = []
def components = []
/*
def layouts = []
def linearRampInputs = []
def linearRampTimes = []
def lineOuts = []
def gridLayouts = []
def frames = []*/

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

/*
def class LinearRampInput
{
	float minimum
	float maximum
	float actualValue
}

def class LinearRampTime
{
	float duration
}

def class LineOut
{
	int startValue
	int endValue
}

def class Frame{
	int width
	int height
}

def class GridLayout{
	int rows
	int columns
}
*/