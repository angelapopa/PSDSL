package dsl

/*
 * DSL definition
 */

def controls = []
def oscillators = []
def connections = []
def filters = []

def waveformOperations = []

class UnitGenerator {
	def String type
	def String name
}

class UnitController {
	def String type
	def String name
}

class RotaryKnob extends UnitController
{
	int digits
}

class Slider extends UnitController
{
}

class Amplitude
{
	float minimum
	float maximum
	float defaultValue
}

class Frequency
{
	float minimum
	float maximum
	float defaultValue
}

class Oscillator extends UnitGenerator {
	Amplitude amplitude
	Frequency frequency
}

class LinearRampInput {
	float minimum
	float maximum
	float actualValue
}

class LinearRampTime {
	float duration
}

class LinearRamp extends UnitGenerator {
	String name
	String connectsTo
	LinearRampInput input
	LinearRampTime time
}

def class Connection
{
	String filter
	String fromController
	String toOscillator
}

def class Operation
{
	String name
}

