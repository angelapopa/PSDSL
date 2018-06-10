package dsl;

public enum ug {
	ImpulseOscillator,
	ImpulseOscillatorBL,
	PulseOscillator,
	PulseOscillatorBL,
	SawtoothOscillator,
	SawtoothOscillatorBL,
	SineOscillator,
	SquareOscillator,
	SquareOscillatorBL,
	FunctionOscillator,
	TriangleOscillator
	
	static main(args) {
		def a = ug.ImpulseOscillator
		println a
	}
}

