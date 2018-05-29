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
		new LinearRampInput(
			minimum: 0.0,
			maximum: 1.0,
			actualValue: 0.5
		)
	)
	
components
	.add(
		new LinearRampTime(
			duration: 0.2
		)
	)
	
components
	.add(
		new LineOut(
			startValue: 0
			endValue:0
		)
	)	
