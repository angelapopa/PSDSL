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
import com.jsyn.swing.PortControllerFactory;
import com.jsyn.swing.PortModelFactory;
import com.jsyn.swing.RotaryController;
import com.jsyn.swing.RotaryTextController;

import groovy.json.JsonSlurper
import groovy.text.SimpleTemplateEngine
import groovy.ui.ConsoleApplet
import groovy.test.*

/*
 * Database
 */
def filePath = new File(".").absoluteFile.getParent()
def sluper = new JsonSlurper()
def lineOuts = sluper.parse(new FileReader(filePath + '/src/json/lineOuts.json'))
def oscillators = sluper.parse(new FileReader(filePath + '/src/json/oscillators.json'))
def linearRamps = sluper.parse(new FileReader(filePath + '/src/json/linearRamps.json'))

List<UnitOscillator> my_osc_list = []
List<LineOut> my_lo_list = []
Synthesizer s
List<LinearRamp> my_lag_list = []
//LinearRamp input
//UnitOscillator myOsc
//LineOut myLineOut
//Synthesizer s
//LinearRamp lag

/*
 * Meta programming
 */
// Using user-defined name to identify
UnitOscillator.metaClass.name = 'myOsci'	// This is default name
LinearRamp.metaClass.name = 'myLag'			// This is default name

// Adding all neccessary UnitGenerators 
Synthesizer.metaClass.addUnits << {listOsci, listLineOut, listLinearRamps ->
	assert listOsci != null
	listOsci.each {
		if (it.type == 'SineOscillator') {
			def myOsc = new SineOscillator(name: it.name)
			def freg = it.frequency
			myOsc.frequency.setup(freg.minimum, freg.defaultValue, freg.maximum)
			add(myOsc)
			my_osc_list << myOsc
			println "Added new $it.type $myOsc.name"
			println "with frequency: $freg.minimum, $freg.defaultValue, $freg.maximum"
			
			if (listLineOut != null) {
				listLineOut.each {
					def myLineOut = new LineOut()
					add(myLineOut)
					myOsc.output.connect(0, myLineOut.input, 0)
					myOsc.output.connect(0, myLineOut.input, 1)
					my_lo_list << myLineOut
					println "Added new LineOut"
					println "And connected it with $myOsc.name"
				}
			}

			if (listLinearRamps != null) {
				listLinearRamps.each {
					def lag = new LinearRamp(name: it.name)
					add(lag)
					lag.output.connect(myOsc.amplitude)
					def lag_input = it.input
					if (lag_input != null) {
						lag.input.setup(lag_input.minimum, lag_input.actualValue, lag_input.maximum)
						println "Added new $it.type $lag.name"
						println "With input value: $lag_input.minimum, $lag_input.actualValue, $lag_input.maximum"
					}
					def lag_time = it.time
					if (lag_time != null) {
						lag.time.set(lag_time.duration)
						println "With duration: $lag_time.duration"
					}
					my_lag_list << lag
				}
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
}

def buildAndConnectUnits(def listOsci, def listLineOut, def listLinearRamps) {
	s.addUnits(listOsci, listLineOut, listLinearRamps)
}

def returnItem (List<LinearRamp> list, String name) {
	for (LinearRamp it in list) {
		if (it.name == name) {
			return it
		}
	}
		
}

def returnItem2(def list, def name) {
	
}

/*
 * Start main() function
 */
// Just release the block function. In the future, we can use block funtion instead

s = new JSyn().createSynthesizer()
s.start()

s.addUnits(oscillators, lineOuts, linearRamps)
//myLineOut.start()
println my_lag_list.name

// Start UIs
def builder = new groovy.swing.SwingBuilder()
def frame = builder.frame(
		title: 'Synthesizer',
		size: [500, 300],
		defaultCloseOperation: javax.swing.WindowConstants.EXIT_ON_CLOSE,
		show: true

		) {
			gridLayout(cols: 1, rows: 2)
			def input = returnItem(my_lag_list, 'ramp')
			print input
			def amplitudeModel = PortModelFactory.createExponentialModel(input.input)
			panel(new RotaryTextController(amplitudeModel, 5))
			slider(PortControllerFactory.createExponentialPortSlider(myOsc.frequency))
		}
