package example;

import com.jsyn.ports.UnitInputPort;
import com.jsyn.ports.UnitOutputPort;
import com.jsyn.unitgen.Circuit;
import com.jsyn.unitgen.Multiply;
import com.jsyn.unitgen.SineOscillator;
import com.jsyn.unitgen.UnitVoice;
import com.softsynth.shared.time.TimeStamp;

public class TwoSine extends Circuit implements UnitVoice {
	
	private SineOscillator osc1;
	private SineOscillator osc2;
	private Multiply mul;
	
	public UnitInputPort frequency1;
	public UnitInputPort frequency2;
	public UnitInputPort amplitude;

	public TwoSine() {
		add(osc1 = new SineOscillator());
		add(osc2 = new SineOscillator());
		add(mul = new Multiply());
		
		osc1.output.connect(mul.inputA);
		osc2.output.connect(mul.inputB);
		
		addPort(frequency1 = osc1.frequency, "frequency1");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public UnitOutputPort getOutput() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void noteOff(TimeStamp arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void noteOn(double arg0, double arg1, TimeStamp arg2) {
		// TODO Auto-generated method stub
		
	}

}
