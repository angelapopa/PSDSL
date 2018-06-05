/*DSL usage*/
/*
controls
	.add(rotaryKnob(
		new RotaryValues(
			x: 10,
			y: 2,
			width: 20,
			height: 20
		)
	))

controls	
	.add(rotaryKnob(
		new RotaryValues(
			x: 15,
			y: 5,
			width: 30,
			height: 30
		)
	))
	
controls	
	.add(rotaryKnob(
		new RotaryValues(
			x: 18,
			y: 7,
			width: 25,
			height: 25
		)
	))
*/
oscillators
	.add(new Oscillator(
			name: 'myOsc',
			type: 'SineOscillator',
			frequency: new Frequency(
				minimum : 50.0,
				maximum : 10.000,
				defaultValue : 300.0
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
/*	
gridLayouts
	.add(
		new GridLayout(
			rows: 0,
			columns: 1
		)
	)
	
frames
	.add(
		new Frame(
			width: 440,
			height: 200
		)
	)			
*/
