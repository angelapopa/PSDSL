/*DSL usage*/
controls
	.add(rotaryKnob(
		new RotaryValues(
			name: 'myFirstKnob',
			digits: 5
		)
	))

controls	
	.add(rotaryKnob(
		new RotaryValues(
			name: 'mySecondKnob',
			digits: 10
		)
	))

oscillators
	.add(new Oscillator(
			name: 'myFirstOsc',
			type: 'SineOscillator',
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
			frequency: new Frequency(
				minimum : 70.0,
				maximum : 9000.0,
				defaultValue : 500.0
			)
	))

linearRamps
	.add(new LinearRamp(
		name: 'ramp',
		type: 'LinearRamp',
		input: new LinearRampInput(
			minimum: 0.0, 
			actualValue: 0.5, 
			maximum: 1.0
		),
		time: new LinearRampTime(
			duration: 0.2
			)
		))

lineOuts
	.add(
		new LineOut(
			
		)
	)

connections
	.add(
		new Connection(
			linear: 'ramp',
			from: 'myFirstKnob',
			to: 'myFirstOsc'
		)
	)

connections
	.add(
		new Connection(
			linear: 'ramp',
			from: 'mySecondKnob',
			to: 'mySecondOsc'
		)
	)
	
