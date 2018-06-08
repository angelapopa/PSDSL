package example;

import javax.swing.JApplet;
import javax.swing.JLabel;

import com.jsyn.JSyn;
import com.jsyn.Synthesizer;
import com.jsyn.unitgen.LineOut;
import com.jsyn.unitgen.SineOscillator;

/**
 * SineExample.java
 * Lesson 0
 * Play a sinewave oscillator in a swing JApplet. As simple as it gets!
 * Uses pure Java API
 * 
 * @author Nga Pham
 * Based on program of Nick Didkovsky, didkovn@mail.rockefeller.edu (C) 2012
 * 
 * Library: JSyn (C) 1997 Phil Burk, visit www.softsynth.com
 */
public class SineExample extends JApplet {
	// declare units
	SineOscillator myOsc;
	LineOut myLineOut;
	
	// An instance of Jsyn Synthesis Engine
	Synthesizer synth;
	
	/*
     * executes when you load web page.
     */
	public void start() {
		startSynthesisEngine();
		buildUnitGenerators();
        connectUnitGenerators();
        startUnitGenerators();
        buildGUI();
	}

	private void startSynthesisEngine() {
		synth = JSyn.createSynthesizer();
		synth.start();	// using the default outputs at 44100 Hz. 
	}
	
	private void buildUnitGenerators() {
		synth.add(myOsc = new SineOscillator());
		synth.add(myLineOut = new LineOut());
		myOsc.frequency.set(440.0); // "hard wire" the frequency at 440Hz
		myOsc.amplitude.set(0.5); 	// and amplitude to half
	}

	private void connectUnitGenerators() {
		// Connect oscillator to both channels of stereo player.
		myOsc.output.connect(0, myLineOut.input, 0);
		myOsc.output.connect(0, myLineOut.input, 1);
	}
	
	private void startUnitGenerators() {
		// Start execution of units. JSyn 'pulls' data so the only unit you have to start() is 
		// the last one, in this case our LineOut
		myLineOut.start();
	}

	private void buildGUI() {
		add(new JLabel("JSyn Sine Example #1: Play a sine wave at 440Hz"));
	}
	
	public void stop() {
		if (synth != null) {
			synth.stop();
			synth = null;
		}
	}
}
