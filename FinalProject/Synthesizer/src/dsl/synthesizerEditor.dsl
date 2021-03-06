/*DSL usage*/

/*knobs*/
controls
	.add(new RotaryKnob(
			type: 'knob',
			name: 'myKnobForFirstOscillator',
			digits: 5
		)
	)

controls
	.add(new RotaryKnob(
			type: 'knob',
			name: 'myFirstKnobForThirdOscillator',
			digits: 10
		)
	)

controls
	.add(new RotaryKnob(
			type: 'knob',
			name: 'mySecondKnobForThirdOscillator',
			digits: 10
		)
	)
	
controls	
	.add(new RotaryKnob(
			type: 'knob',
			name: 'myKnobForFourthOscillator',
			digits: 10
		)
	)

/*sliders*/
controls
	.add(new Slider(
		type: 'slider',
		name: 'mySliderForFirstOscillator'
		)
	)

controls
	.add(new Slider(
		type: 'slider',
		name: 'myFirstSliderForSecondOscillator'
		)
	)
	
controls
	.add(new Slider(
		type: 'slider',
		name: 'mySecondSliderForSecondOscillator'
		)
	)
	
controls
	.add(new Slider(
		type: 'slider',
		name: 'mySliderForFourthOscillator'
		)
	)

/*oscillators*/
oscillators
	.add(new Oscillator(
			name: 'myFirstOsc',
			type: 'SineOscillator',
			amplitude: new Amplitude(
				minimum : 0.0,
				maximum : 1.0,
				defaultValue : 0.5
			),
			frequency: new Frequency(
				minimum : 50.0,
				maximum : 10000.0,
				defaultValue : 300.0
			)
	))
	
oscillators
	.add(new Oscillator(
			name: 'mySecondOsc',
			type: 'SawtoothOscillator',
			amplitude: new Amplitude(
				minimum : 0.0,
				maximum : 1.0,
				defaultValue : 0.3
			),
			frequency: new Frequency(
				minimum : 70.0,
				maximum : 9000.0,
				defaultValue : 500.0
			)
	))

oscillators
	.add(new Oscillator(
			name: 'myThirdOsc',
			type: 'TriangleOscillator',
			amplitude: new Amplitude(
				minimum : 0.0,
				maximum : 1.0,
				defaultValue : 0.7
			),
			frequency: new Frequency(
				minimum : 30.0,
				maximum : 7000.0,
				defaultValue : 800.0
			)
	))
	
oscillators
	.add(new Oscillator(
			name: 'myFourthOsc',
			type: 'SquareOscillator',
			amplitude: new Amplitude(
				minimum : 0.0,
				maximum : 1.0,
				defaultValue : 0.9
			),
			frequency: new Frequency(
				minimum : 90.0,
				maximum : 6000.0,
				defaultValue : 1000.0
			)
	))

/*filters*/
filters
	.add(new LinearRamp(
		name: 'frequencyRamp',
		type: 'LinearRamp',
		input: new LinearRampInput(
			minimum: 50.0, 
			actualValue: 300.0, 
			maximum: 10000.0
		),
		connectsTo: 'frequency',
		time: new LinearRampTime(
			duration: 0.2
			)
		))

filters
	.add(new LinearRamp(
		name: 'amplitudeRamp',
		type: 'LinearRamp',
		input: new LinearRampInput(
			minimum: 0.0, 
			actualValue: 0.5, 
			maximum: 1.0
		),
		connectsTo: 'amplitude',
		time: new LinearRampTime(
			duration: 0.2
			)
		))
filters
	.add(new FilterHighPass(
		name: 'myHighPass',
		type: 'FilterHighPass',
		amplitude: new Amplitude(
				minimum : 0.0,
				maximum : 1.0,
				defaultValue : 0.3
			)
	))


/*Connections btw. controllers and oscillators*/
/*Oscillator 1*/
connections
	.add(
		new Connection(
			filter: 'amplitudeRamp',
			fromController: 'myKnobForFirstOscillator',
			toOscillator: 'myFirstOsc'
		)
	)
connections
	.add(
		new Connection(
			filter: 'frequencyRamp',
			fromController: 'mySliderForFirstOscillator',
			toOscillator: 'myFirstOsc'
		)
	)
	
/*Oscillator 2*/
connections
	.add(
		new Connection(
			filter: 'amplitudeRamp',
			fromController: 'myFirstSliderForSecondOscillator',
			toOscillator: 'mySecondOsc'
		)
	)
connections
	.add(
		new Connection(
			filter: 'frequencyRamp',
			fromController: 'mySecondSliderForSecondOscillator',
			toOscillator: 'mySecondOsc'
		)
	)

	
/*Oscillator 3*/
connections
	.add(
		new Connection(
			filter: 'amplitudeRamp',
			fromController: 'myFirstKnobForThirdOscillator',
			toOscillator: 'myThirdOsc'
		)
	)
connections
	.add(
		new Connection(
			filter: 'frequencyRamp',
			fromController: 'mySecondKnobForThirdOscillator',
			toOscillator: 'myThirdOsc'
		)
	)
	
/*Oscillator 4*/
connections
	.add(
		new Connection(
			filter: 'amplitudeRamp',
			fromController: 'mySliderForFourthOscillator',
			toOscillator: 'myFourthOsc'
		)
	)
connections
	.add(
		new Connection(
			filter: 'frequencyRamp',
			fromController: 'myKnobForFourthOscillator',
			toOscillator: 'myFourthOsc'
		)
	)
	

/*Combination of Waveforms*/
waveformOperations
	.add(
		new Operation(
			name: 'Division'
		)
	)
