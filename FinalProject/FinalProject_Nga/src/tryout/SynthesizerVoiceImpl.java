package tryout;
import java.awt.BorderLayout;

import javax.swing.JApplet;

import com.jsyn.JSyn;
import com.jsyn.Synthesizer;
import com.jsyn.swing.SoundTweaker;
import com.jsyn.unitgen.LineOut;

public class SynthesizerVoiceImpl extends JApplet {
	// declare units
	SynthesizerVoice myVoice;
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
		synth.start();
	}

	private void buildUnitGenerators() {
		synth.add(myVoice = new SynthesizerVoice());
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
