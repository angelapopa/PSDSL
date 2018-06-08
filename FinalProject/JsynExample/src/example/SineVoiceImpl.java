package example;
import java.awt.BorderLayout;

import javax.swing.JApplet;
import javax.swing.JLabel;

import com.jsyn.JSyn;
import com.jsyn.Synthesizer;
import com.jsyn.devices.AudioDeviceManager;
import com.jsyn.swing.SoundTweaker;
import com.jsyn.unitgen.LineOut;
import com.jsyn.unitgen.SineOscillator;

/**
 * SineExample.java
 * Lesson 1
 * 
 * Play a sinewave oscillator in a swing JApplet using SineVoice wrapper class
 * Includes SoundTweaker which displays a scrollbar for every port
 * 
 * @author Nga Pham
 * Based on program of Nick Didkovsky, didkovn@mail.rockefeller.edu (C) 2012
 * 
 * Library: JSyn (C) 1997 Phil Burk, visit www.softsynth.com
 */
public class SineVoiceImpl extends JApplet {
	// declare units
	SineVoice myVoice;
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
//		synth.start();
		// Another way to start using specific sample rate, devices, etc...
		int numInputChannels = 2;
		int numOutputChannels = 2;
		synth.start(44100, AudioDeviceManager.USE_DEFAULT_DEVICE, numInputChannels, 
				AudioDeviceManager.USE_DEFAULT_DEVICE, numOutputChannels);
	}

	private void buildUnitGenerators() {
		synth.add(myVoice = new SineVoice());
		synth.add(myLineOut = new LineOut());
	}

	private void connectUnitGenerators() {
		// Connect oscillator to both channels of stereo player.
		myVoice.getOutput().connect(0, myLineOut.input, 0);
		myVoice.getOutput().connect(0, myLineOut.input, 1);
	}

	private void startUnitGenerators() {
		// Start execution of units. JSyn 'pulls' data so the only unit you have to start() is 
		// the last one, in this case our LineOut
		myLineOut.start();
	}

	private void buildGUI() {
		setLayout(new BorderLayout());
		add(BorderLayout.SOUTH, new SoundTweaker(synth, "Tweak your sound", myVoice));
	}

	public void stop() {
		if (synth != null) {
			synth.stop();
			synth = null;
		}
	}
}
