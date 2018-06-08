package example;

import com.jsyn.JSyn;
import com.jsyn.Synthesizer;
import com.jsyn.data.SegmentedEnvelope;
import com.jsyn.unitgen.LineOut;
import com.jsyn.unitgen.SawtoothOscillatorBL;
import com.jsyn.unitgen.SineOscillator;
import com.jsyn.unitgen.VariableRateMonoReader;

/**
 * Envelope.java
 * Lesson 4
 * Create Envelope sample using duration-value pair
 * 
 * @author Nga Pham
 * References: http://www.softsynth.com/jsyn/docs/usersguide.php#TimeSleeping
 * 
 * Library: JSyn (C) 1997 Phil Burk, visit www.softsynth.com
 */

public class Envelope {

	static double[] data = {
			0.02, 1.0,  // duration,value pair for frame[0]; Take 0.02 seconds to go to value 1.0.
			0.30, 0.8,  // duration,value pair for frame[1]; Take 0.30 seconds to drop to 0.5.
			0.30, 0.6,  // duration,value pair for frame[2]
			0.30, 0.4,  // duration,value pair for frame[3]
			0.30, 0.2,
			0.30, 0.0   // duration,value pair for frame[4]
	};
	
//	SegmentedEnvelope myEnvData;
Synthesizer synth;
VariableRateMonoReader myEnvPlayer;
SawtoothOscillatorBL myOsc;
LineOut myLineOut;
	
	private void startSynthesisEngine() {
		synth = JSyn.createSynthesizer();
		synth.start();	// using the default outputs at 44100 Hz. 
	}
	
	private void buildUnitGenerators() {
		synth.add(myOsc = new SawtoothOscillatorBL());
		synth.add(myLineOut = new LineOut());
		myOsc.frequency.set(440.0); // "hard wire" the frequency at 440Hz
		myOsc.amplitude.set(0.5); 	// and amplitude to half
	}
	
	private void createEnvelope() {
		SegmentedEnvelope myEnvData = new SegmentedEnvelope(data);
		myEnvPlayer = new VariableRateMonoReader();
		myEnvPlayer.dataQueue.clear();
		myEnvPlayer.dataQueue.queue(myEnvData, 0, myEnvData.getNumFrames());
		synth.add(myEnvPlayer);
//		myEnvPlayer.start();
	}
	
	private void startUnitGenerators() {
		// Start execution of units. JSyn 'pulls' data so the only unit you have to start() is 
		// the last one, in this case our LineOut
		myLineOut.start();
	}
	

	private void connectUnitGenerators() {
		// Connect oscillator to both channels of stereo player.
		myOsc.output.connect(0, myLineOut.input, 0);
		myOsc.output.connect(0, myLineOut.input, 1);
		// Connect EnvelopePlayer to oscillator
		myEnvPlayer.output.connect(myOsc.amplitude);
		
	}

	public static void main(String[] args) {
		Envelope e = new Envelope();
		
		e.startSynthesisEngine();
		e.buildUnitGenerators();
		e.createEnvelope();
		e.connectUnitGenerators();
		e.startUnitGenerators();
	}

}
