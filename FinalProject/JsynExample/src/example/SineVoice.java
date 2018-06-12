package example;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

import com.jsyn.JSyn;
import com.jsyn.Synthesizer;
import com.jsyn.ports.UnitInputPort;
import com.jsyn.ports.UnitOutputPort;
import com.jsyn.swing.SoundTweaker;
import com.jsyn.unitgen.Circuit;
import com.jsyn.unitgen.LineOut;
import com.jsyn.unitgen.SineOscillator;
import com.jsyn.unitgen.UnitVoice;
import com.softsynth.shared.time.TimeStamp;

/**
 * SineVoice.java
 * Lesson 1
 * 
 * Bundle the single oscillator on Lesson 0 up into a Circuit that implements UnitVoice
 * A Circuit is a wrapper around units, exposing to the outside only input and output ports
 * UnitVoice: Provide getOutput() method for other classes to connect; 
 * noteOn() to set values to frequency and amplitude;
 * noteOff() to shut the note down.
 * 
 * @author Nga Pham
 * Based on program of Nick Didkovsky, didkovn@mail.rockefeller.edu (C) 2012
 * 
 * Library: JSyn (C) 1997 Phil Burk, visit www.softsynth.com
 */
public class SineVoice extends Circuit implements UnitVoice {
	
	private SineOscillator myOsc;
	public UnitInputPort frequency, amplitude;
	
	/**
	 * Add units and connect them in the constructor
	 */
	public SineVoice() {
		add(myOsc = new SineOscillator());
		addPort(amplitude = myOsc.amplitude);
		addPort(frequency = myOsc.frequency); 
		amplitude.setup(0.0, 0.5, 1.0);
		frequency.setup(20.0, 440.0, 1000.0);
	}

	// implements UnitSource
	@Override
	public UnitOutputPort getOutput() {
		return myOsc.output;
	}

	/**
	 *  noteOn and noteOff implements UnitVoice(non-Javadoc)
	 * noteOn() to set values to frequency and amplitude;
	 * noteOff() to shut the note down.
	 */
	@Override
	public void noteOff(TimeStamp timeStamp) {
		amplitude.set(0, timeStamp);
	}

	@Override
	public void noteOn(double freqValue, double amplValue, TimeStamp timeStamp) {
		myOsc.frequency.set(freqValue, timeStamp);
		myOsc.amplitude.set(amplValue, timeStamp);

	}

	/**
	 * Create SoundTweaker inside JFrame
	 * @param args
	 */
	public static void main(String[] args) {
		final Synthesizer synth = JSyn.createSynthesizer();
		synth.start();
		
		SineVoice myVoice = new SineVoice();
		synth.add(myVoice);
		
		LineOut myLineOut = new LineOut();
		synth.add(myLineOut);
		
		myVoice.getOutput().connect(0, myLineOut.input, 0);
		myVoice.getOutput().connect(0, myLineOut.input, 1);
		myLineOut.start();
		
		SoundTweaker myTweaker = new SoundTweaker(synth, "Test sound", myVoice);
		
		JFrame jf = new JFrame();
        jf.add(myTweaker);
        jf.pack();
        jf.setVisible(true);
        jf.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                synth.stop();
                System.exit(0);
            }
        });

	}
}
