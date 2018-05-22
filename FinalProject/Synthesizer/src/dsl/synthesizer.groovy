// Modify the Object instance to a nicer editor

//DSL definition
def class RotaryKnob{
	def name
	int x
	int y
	int width
	int height
	
	def name(value) {
		name = value
	}
	
	def x(value) {
		x = value
	}
	
	def y(value) {
		y = value
	}
	
	def width(value) {
		width = value
	}
	
	def height(value) {
		height = value	
	}
	
	def print() {
		println "$name"
	}
}

def controls() {
	[ RotaryKnob : { 
		name -> 
		[x : x -> {
		new RotaryKnob(name: name, x: x)}]
	}  ]
}

def RotaryKnob rotaryKnob = new RotaryKnob();

/*DSL usage*/
rotaryKnob.with {
	x 0
	y 2
	width 20
	height 90
	name "myKnob"
}

controls RotaryKnob "myKnob2" x = 0, 2, ..

println (rotaryKnob.name + ": " + rotaryKnob.x + " " + rotaryKnob.y + " " + rotaryKnob.width + " " + rotaryKnob.height)

