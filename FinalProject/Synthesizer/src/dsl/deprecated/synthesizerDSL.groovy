package dsl.deprecated
//feedback teacher:
//good idea, this approach of generating a java class is the intended way
//yes, java code can be executed from within a groovy script (TODO: find the way :) )
//TODO: refactor the grammar/dsl usage, using closures or overwrite the setters


def knobTemplate = """

	RotaryTextController knob = new RotaryTextController(amplitudeModel, 5);
	JPanel knobPanel = new JPanel();
	knobPanel.add(knob);
	add(knobPanel);
"""

//DSL definition

def rotaryKnob2(RotaryValues2 values) {
	return values
}

def controls = []
def sound(){}

def class RotaryValues2
{
	int x
	int y
	int width
	int height
}

///different file
/*DSL usage*/
controls
	.add(rotaryKnob2(
		new RotaryValues2(
			x: 10,
			y: 2,
			width: 20,
			height: 20
		)
	))
	
controls	
	.add(rotaryKnob2(
		new RotaryValues2(
			x: 10,
			y: 2,
			width: 20,
			height: 20
		)
	))

println controls.get(0).getX()
/*
rotaryKnob.with {
	
	setX(0)
	setY(2)
	setWidth(20)
	setHeigth(20)
}
*/
	
class SawTooth {
	float minimum
	float maximum
	float defaultValue
}

def mySawTooth = new SawTooth();
mySawTooth.with {
	setMinimum(50.0)
	setMaximum(10000.0)
	setDefaultValue(300.0)
}


/**/
def className = "TestOsciGenerated"

def packagedef = """
package dsl;
"""

def imports = """
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
"""

def linearRamp = """
	// minimum, current and maximum values for the port				
	synth.add(lag = new LinearRamp());
	// output mixer
	lag.output.connect(osc.amplitude);
	lag.input.setup(0.0, 0.5, 1.0); //TODO inject values from editor
	lag.time.set(0.2);
"""

def amplitude = """
	ExponentialRangeModel amplitudeModel = PortModelFactory
		.createExponentialModel(lag.input);
"""



def script = """

	${packagedef}
	${imports}

	public class ${className} extends JApplet {

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
		
		${linearRamp}
		
		setLayout(new GridLayout(0, 1));
		
		${amplitude}
		
		${knobTemplate}
		
		osc.frequency.setup($mySawTooth.minimum, $mySawTooth.defaultValue, $mySawTooth.maximum);
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
		$className applet = new $className();
		JAppletFrame frame = new JAppletFrame("SawFaders", applet);
		frame.setSize(440, 200);
		frame.setVisible(true);
		frame.test();
	}
}
"""

println script
def inputFile = new File("/home/angi/git/dsl/PSDSL2/PSDSL/FinalProject/Synthesizer/src/dsl/"+className+".java")
inputFile.write(script)

//def sout = new StringBuffer(), serr = new StringBuffer()
//def proc = "java TestOsci".execute()
//proc.consumeProcessOutput(sout, serr)
//proc.waitFor()
//println "out> $sout err> $serr"
//

//new GroovyShell().evaluate(inputFile)

//def output = "groovyc /home/angi/Documents/PS_DSL/groovyworkspace3/Synthetiser/src/dsl/TestOsciGenerated".execute().text

println "$mySawTooth.minimum, $mySawTooth.defaultValue, $mySawTooth.maximum"
//println "$rotaryKnob.x, $rotaryKnob.y, $rotaryKnob.width, $rotaryKnob.heigth"

def class Controls{}
def Sound(){}
def class Slider2 extends Controls
{
	int value
}

def class SawToothOscillator// extends Sound
{
	float minimum;
	float maximum;
	float defaultValue;
}

//def RotaryKnob rotaryKnob = new RotaryKnob();
//def Slider slider = new Slider();
//def mySawTooth = new SawToothOscillator();


/*
 DSL usage nice to have
 
  rotaryKnob.with {
	x 0
	y 2
	width 20
	heigth 90
}
 */

/*
def controls = new Controls {
	rotaryKnob = myKnob
	slider "mySlider"
	...
}
Sound {
	mySawTooth "mySawTooth" (
	min : 50,
	maximum : 10.000,
	default : 300.0
	)
}

Connections {
	linear (0.5) "myKnob" "mySawTooth"
	...
}


def add(controls, sound){
	println(controls.toString());
	this
}

synthetizer add controls, sound build
*/
