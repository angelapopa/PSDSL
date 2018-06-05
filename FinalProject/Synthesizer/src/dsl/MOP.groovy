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
import com.jsyn.swing.DoubleBoundedRangeSlider;
import com.jsyn.swing.ExponentialRangeModel;
import com.jsyn.swing.PortControllerFactory;
import com.jsyn.swing.PortModelFactory;
import com.jsyn.swing.RotaryController;
import com.jsyn.swing.RotaryTextController;

import groovy.json.JsonSlurper
import groovy.text.SimpleTemplateEngine
import groovy.ui.ConsoleApplet
import groovy.test.*

// Database
def filePath = new File(".").absoluteFile.getParent()
def sluper = new JsonSlurper()
def connections = sluper.parse(new FileReader(filePath + '/src/json/connections.json'))
def lineOuts = sluper.parse(new FileReader(filePath + '/src/json/lineOuts.json'))
def oscillators = sluper.parse(new FileReader(filePath + '/src/json/oscillators.json'))
def linearRamps = sluper.parse(new FileReader(filePath + '/src/json/linearRamps.json'))

UnitOscillator myOsc
LineOut myLineOut
Synthesizer s
LinearRamp lag
DoubleBoundedRangeSlider synthSlider
RotaryTextController knob

// Meta programming
Synthesizer.metaClass.addUnits << {listOsci, listLineOut, listLinearRamps ->
	assert listOsci != null
	listOsci.each {
		if (it.type == 'SineOscillator') {
			myOsc = new SineOscillator()
			myOsc.frequency.setup(it.frequency.minimum, it.frequency.defaultValue, it.frequency.maximum)
			add(myOsc)
			println "Added new $it.type "//$name"
			println "with frequency: $it.frequency.minimum, $it.frequency.defaultValue, $it.frequency.maximum"
			
			if (listLineOut != null) {
				listLineOut.each {
					myLineOut = new LineOut()
					add(myLineOut)
					myOsc.output.connect(0, myLineOut.input, 0)
					myOsc.output.connect(0, myLineOut.input, 1)
					println "Added new LineOut"
					println "And connected it with Oscillator"
				}
			}

			if (listLinearRamps != null) {
				listLinearRamps.each {
					lag = new LinearRamp()
					add(lag)
					lag.output.connect(myOsc.amplitude)
					def lag_input = it.input
					if (lag_input != null) {
						lag.input.setup(lag_input.minimum, lag_input.actualValue, lag_input.maximum)
						println "Added new $it.type"
						println "With input value: $lag_input.minimum, $lag_input.actualValue, $lag_input.maximum"
					}
					def lag_time = it.time
					if (lag_time != null) {
						lag.time.set(lag_time.duration)
						println "With duration: $lag_time.duration"
					}

				}
			}

		}
	}
	def amplitudeModel = PortModelFactory.createExponentialModel(lag.input)
	knob = new RotaryTextController(amplitudeModel, 5)
	synthSlider = PortControllerFactory.createExponentialPortSlider(myOsc.frequency)
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
	myLineOut.start()
}

def buildAndConnectUnits(def listOsci, def listLineOut, def listLinearRamps) {
	s.addUnits(listOsci, listLineOut, listLinearRamps)
}


/*
 * Start main() function
 */
// Just release the block function. In the future, we can use block funtion instead
s = new JSyn().createSynthesizer()
s.start()

s.addUnits(oscillators, lineOuts, linearRamps)
// sound
myLineOut.start()

// Start UIs
def builder = new groovy.swing.SwingBuilder()
def frame = builder.frame(
		title: 'Synthesizer',
		size: [500, 300],
		defaultCloseOperation: javax.swing.WindowConstants.EXIT_ON_CLOSE,
		show: true

		) {
			gridLayout(cols: 1, rows: 2)
			panel(knob)
			slider(synthSlider)
		}
