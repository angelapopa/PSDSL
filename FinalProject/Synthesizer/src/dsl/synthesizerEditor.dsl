/*DSL usage*/
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
			x: 10,
			y: 2,
			width: 20,
			height: 20
		)
	))

sounds
	.add(
		new Frequency(
			minimum : 50.0,
			maximum : 10.000,
			defaultValue : 300.0
		)
	)

components
	.add(
		new LinearRamp(
			minimum: 0.0,
			maximum: 1.0,
			actualValue: 0.5
		)
	)
