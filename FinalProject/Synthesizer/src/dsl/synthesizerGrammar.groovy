package dsl

import org.apache.ivy.core.module.descriptor.ExtendsDescriptor;

/*
 * DSL definition
 */

def controls = []
def oscillators = []
def connections = []
def filters = []

def waveformOperations = []

class UnitGenerator {
	String type
	String name
}

class UnitFilter extends UnitGenerator {
	Amplitude amplitude
	Frequency frequency
}

class UnitController {
	String type
	String name
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

class FilterHighPass extends UnitFilter {
	String connectsTo
}

class FilterLowPass extends UnitFilter {
	String connectsTo
}

class Connection
{
	String filter
	String fromController
	String toOscillator
}

class Operation
{
	String name
}
