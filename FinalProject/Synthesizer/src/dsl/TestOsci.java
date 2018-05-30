package dsl;

import java.awt.GridLayout;
import java.util.List;

import javax.swing.JApplet;
import javax.swing.JPanel;

import com.jsyn.JSyn;
import com.jsyn.Synthesizer;
import com.jsyn.swing.ExponentialRangeModel;
import com.jsyn.swing.JAppletFrame;
import com.jsyn.swing.PortControllerFactory;
import com.jsyn.swing.PortModelFactory;
import com.jsyn.swing.RotaryTextController;
import com.jsyn.unitgen.LineOut;
import com.jsyn.unitgen.LinearRamp;
import com.jsyn.unitgen.SawtoothOscillatorBL;
import com.jsyn.unitgen.UnitOscillator;

/**
 * Play a tone using a JSyn oscillator and some knobs.
 *
 * @author Phil Burk (C) 2010 Mobileer Inc
 * 
 */

public class TestOsci extends JApplet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Synthesizer synth;
	private UnitOscillator osc;
	private LinearRamp lag;
	private LineOut lineOut;
	/*
	private List<Controls> controls;
	
	public TestOsci() {
		// TODO Auto-generated constructor stub
	}
	*/
	public TestOsci(LinearRamp lag) {
		lag = this.lag;
	}

	public void init() {
		synth = JSyn.createSynthesizer();
		
		// tone generator
		synth.add(osc = new SawtoothOscillatorBL());
		// lag to smooth out amplitude changes
		
		synth.add(lineOut = new LineOut());
		// connect oscillator to output
		osc.output.connect(0, lineOut.input, 0); // LineOut		
		
		// minimum, current and maximum values for the port				
		synth.add(lag = new LinearRamp());
		// output mixer
		lag.output.connect(osc.amplitude);
		lag.input.setup(lag.getx()), 0.5, 1.0); //LinearRampInput
		lag.time.set(lag.getDuration()); //LinearRampTime
		// arrange faders in a stack
		
		setLayout(new GridLayout(0, 1));//GridLayout
		
		ExponentialRangeModel amplitudeModel = PortModelFactory
				.createExponentialModel(lag.input);
		
		RotaryTextController knob = new RotaryTextController(amplitudeModel, 5);//RotaryKnob?
		JPanel knobPanel = new JPanel();
		knobPanel.add(knob);
		add(knobPanel);
		
		osc.frequency.setup(50.0, 300.0, 10000.0);//Frequency
		add(PortControllerFactory.createExponentialPortSlider(osc.frequency));
		validate();
	}

	public void start() {
		// start (default stereo output at 44100Hz)
		synth.start();
		// start line out, pulls data from the oscillator
		lineOut.start();
	}

	public void stop() {
		synth.stop();
	}

	public static void main(String args[]) {
		TestOsci applet = new TestOsci();
		JAppletFrame frame = new JAppletFrame("SawFaders", applet);
		frame.setSize(440, 200);//Frame
		frame.setVisible(true);
		frame.test();
	}
}
