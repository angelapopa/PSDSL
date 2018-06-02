package tryout;
import javax.swing.JApplet;
import javax.swing.JLabel;

import com.jsyn.JSyn;
import com.jsyn.Synthesizer;
import com.jsyn.unitgen.LineOut;
import com.jsyn.unitgen.SineOscillator;

import groovy.json.JsonSlurper
import groovy.json.JsonSlurper
import groovy.text.SimpleTemplateEngine
import groovy.lang.MetaClass

/**
 * Play a sinewave oscillator in a swing JApplet. As simple as it gets!
 * Uses pure Java API and meta programming in Groovy
 * 
 * @author Nga Pham
 * Based on program of Nick Didkovsky, didkovn@mail.rockefeller.edu (C) 2012
 * 
 * Library: JSyn (C) 1997 Phil Burk, visit www.softsynth.com
 */

class SynthesizerExample extends JApplet {
	def filePath = new File(".").absoluteFile.getParentFile().getParent()
	def sluper = new JsonSlurper()
	def lineOuts = sluper.parse(new FileReader(filePath + '/src/json/lineOuts.json'))
	def oscillators = sluper.parse(new FileReader(filePath + '/src/json/oscillators.json'))
	// declare units
	SineOscillator myOsc;
	LineOut myLineOut;
	
	// An instance of Jsyn Synthesis Engine
	Synthesizer synth;
	
	/*
	 * Default method to start JApplet
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
		synth.start();
	}
	
	private void buildUnitGenerators() {
		
		
		synth.add(myOsc = new SineOscillator());
		synth.add(myLineOut = new LineOut());
		myOsc.frequency.setup(50.0, 300.0, 10000.0); // "hard wire" the frequency at 440Hz
		myOsc.amplitude.set(0.5); 	// and amplitude to half
	}

	private void connectUnitGenerators() {
		// Connect oscillator to channel 0 of stereo player.
		myOsc.output.connect(0, myLineOut.input, 0);
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

