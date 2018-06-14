package dsl

/*
 * DSL definition
 */

def controls = []
def oscillators = []
def connections = []
def linearRamps = []

def waveformOperations = []

class UnitGenerator {
	def String type
	def String name
}

class UnitController {
	def String type
	def String name
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

def class Operation
{
	String name
}