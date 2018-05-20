

	
package dsl;

	
import java.awt.GridLayout;
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


	public class TestOsciGenerated extends JApplet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Synthesizer synth;
	private UnitOscillator osc;
	private LinearRamp lag;
	private LineOut lineOut;

	public void init() {
		synth = JSyn.createSynthesizer();
		
		// tone generator
		synth.add(osc = new SawtoothOscillatorBL());
		// lag to smooth out amplitude changes
		
		synth.add(lineOut = new LineOut());
		// connect oscillator to output
		osc.output.connect(0, lineOut.input, 0);
		
		
	// minimum, current and maximum values for the port				
	synth.add(lag = new LinearRamp());
	// output mixer
	lag.output.connect(osc.amplitude);
	lag.input.setup(0.0, 0.5, 1.0);
	lag.time.set(0.2);

		
		setLayout(new GridLayout(0, 1));
		
		
	ExponentialRangeModel amplitudeModel = PortModelFactory
		.createExponentialModel(lag.input);

		
		

	RotaryTextController knob = new RotaryTextController(amplitudeModel, 5);
	JPanel knobPanel = new JPanel();
	knobPanel.add(knob);
	add(knobPanel);

		
		osc.frequency.setup(50.0, 300.0, 10000.0);
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
		frame.setSize(440, 200);
		frame.setVisible(true);
		frame.test();
	}
}
