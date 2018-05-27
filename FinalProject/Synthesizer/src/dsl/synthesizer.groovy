//DSL definition

def rotaryKnob(RotaryValues values) {
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
