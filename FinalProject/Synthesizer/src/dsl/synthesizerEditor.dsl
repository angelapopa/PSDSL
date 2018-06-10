/*DSL usage*/
controls
	.add(new RotaryKnob(
			type: 'knob',
			name: 'myFirstKnob',
			digits: 5
		)
	)

controls	
	.add(new RotaryKnob(
			type: 'knob',
			name: 'mySecondKnob',
			digits: 10
		)
	)

controls
	.add(new Slider(
		type: 'slider',
		name: 'myFirstSlider'
		)
	)
	
controls
	.add(new Slider(
		type: 'slider',
		name: 'mySecondSlider'
		)
	)

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
			type: 'SineOscillator',
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

linearRamps
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

linearRamps
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

connections
	.add(
		new Connection(
			filter: 'amplitudeRamp',
			from: 'myFirstKnob',
			to: 'myFirstOsc'
		)
	)

connections
	.add(
		new Connection(
			filter: 'frequencyRamp',
			from: 'myFirstSlider',
			to: 'myFirstOsc'
		)
	)
	
connections
	.add(
		new Connection(
			filter: 'frequencyRamp',
			from: 'mySecondKnob',
			to: 'mySecondOsc'
		)
	)

connections
	.add(
		new Connection(
			filter: 'amplitudeRamp',
			from: 'mySecondSlider',
			to: 'mySecondOsc'
		)
	)
