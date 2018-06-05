package dsl

import java.applet.Applet
import java.awt.BorderLayout
import java.nio.file.attribute.AclEntry.Builder;

import org.apache.ivy.core.module.descriptor.ExtendsDescriptor;

import com.jsyn.JSyn;
import com.jsyn.Synthesizer;
import com.jsyn.unitgen.LineOut;
import com.jsyn.unitgen.LinearRamp;
import com.jsyn.unitgen.SineOscillator
import com.jsyn.unitgen.UnitOscillator
import com.jsyn.swing.ExponentialRangeModel;
import com.jsyn.swing.JAppletFrame;
import com.jsyn.swing.PortControllerFactory;
import com.jsyn.swing.PortModelFactory;
import com.jsyn.swing.RotaryTextController;

import groovy.json.JsonSlurper
import groovy.text.SimpleTemplateEngine
import groovy.ui.ConsoleApplet

// Database
def filePath = new File(".").absoluteFile.getParent()
def sluper = new JsonSlurper()
def lineOuts = sluper.parse(new FileReader(filePath + '/src/json/lineOuts.json'))
def oscillators = sluper.parse(new FileReader(filePath + '/src/json/oscillators.json'))

UnitOscillator myOsc
LineOut myLineOut
Synthesizer s
LinearRamp lag

// Meta programming
Synthesizer.metaClass.addUnits << {listOsci, listLineOut ->
	int count = 0
	listOsci.each {
		if (it.type == 'SineOscillator') {
			myOsc = new SineOscillator()
			myOsc.frequency.setup(it.frequency.minimum, it.frequency.defaultValue, it.frequency.maximum)
			add(myOsc)
			println "Added new $it.type "//$name"
			println "with frequency($it.frequency.minimum, $it.frequency.defaultValue, $it.frequency.maximum)"
			listLineOut.each {
				myLineOut = new LineOut()
				add(myLineOut)
				myOsc.output.connect(0, myLineOut.input, 0)
				myOsc.output.connect(0, myLineOut.input, 1)
			}
		}
	}
}

/*
UnitOscillator.metaClass.connectToLineOut << {lineOut, leftChannel, rightChannel = false ->
	if (leftChannel) {
		output.connect(0, lineOut.input, 0)
	}
	if (rightChannel) {
		output.connect(0, lineOut.input, 1)
	}
}
*/

// Define block functions
def startSynthesisEngine() {
	s = new JSyn().createSynthesizer()
	s.start()
	
	lag = new LinearRamp()
	lag.input.setup(0, 0.5, 1.0)
	s.add(lag)
}

def buildAndConnectUnits(def listOsci, def listLineOut) {
	s.addUnits(listOsci, listLineOut)
}


/*
 * Start main() function
 */
// Just release the block function. In the future, we can use block funtion instead
s = new JSyn().createSynthesizer()
s.start()

lag = new LinearRamp()
lag.input.setup(0, 0.5, 1.0)
s.add(lag)
s.addUnits(oscillators, lineOuts)

// Start UIs
def builder = new groovy.swing.SwingBuilder()
def frame = builder.frame(
		title: 'Swing',
		size: [500, 300],
		defaultCloseOperation: javax.swing.WindowConstants.EXIT_ON_CLOSE,
		show: true

		) {
			gridLayout(cols: 1, rows: 2)
			def amplitudeModel = PortModelFactory.createExponentialModel(lag.input)
			panel(new RotaryTextController(amplitudeModel, 5))
			slider(PortControllerFactory.createExponentialPortSlider(myOsc.frequency))
		}
		