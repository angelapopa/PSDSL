package tryout;

import com.jsyn.ports.UnitInputPort;
import com.jsyn.ports.UnitOutputPort;
import com.jsyn.unitgen.Circuit;
import com.jsyn.unitgen.SineOscillator;
import com.jsyn.unitgen.UnitVoice;
import com.softsynth.shared.time.TimeStamp;

public class SynthesizerVoice extends Circuit implements UnitVoice {
	private SineOscillator myOsc;
	public UnitInputPort frequency, amplitude;
	
	/**
	 * Add units and connect them in the constructor
	 */
	public SynthesizerVoice() {
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
}
