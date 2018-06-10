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

/*
 * Database
 */
def filePath = new File(".").absoluteFile.getParent()
def sluper = new JsonSlurper()
def connections = sluper.parse(new FileReader(filePath + '/src/json/connections.json'))
def lineOuts = sluper.parse(new FileReader(filePath + '/src/json/lineOuts.json'))
def oscillators = sluper.parse(new FileReader(filePath + '/src/json/oscillators.json'))
def linearRamps = sluper.parse(new FileReader(filePath + '/src/json/linearRamps.json'))
def controls = sluper.parse(new FileReader(filePath + '/src/json/controls.json'))

def osc_list = []		//internal list of all jsyn oscillators
def lineout_list = []	//internal list of all jsyn LineOut
def linear_list = []	//internal list of all jsyn linear Ramps
def knob_list = []		//internal list of all jsyn knobs
def slider_list = [] 	//internal list of all jsyn sliders

Synthesizer s
DoubleBoundedRangeSlider synthSlider

/**
 * Meta programming
 */
// Using user-defined name for unit identification
UnitOscillator.metaClass.name = 'myOsci'	// This is default name
LinearRamp.metaClass.name = 'myLag'			// This is default name

//special list method to find elements by name
List.metaClass.findUnit << {searchTerm ->
	def result
	each {
		for (int i=0; i < it.size(); i++){
			if (searchTerm == it[i].name){
				result = it[i]
			}
		}
	}
	result
}

// Adding all necessary UnitGenerators 
Synthesizer.metaClass.addUnits << {listOsci, listLineOut, listLinearRamps, listControls ->
	assert listOsci != null
	listOsci.each {
		def myOsc
		if (it.type == 'SineOscillator') {
			myOsc = new SineOscillator(name: it.name)
		}
		def freg = it.frequency
		myOsc.frequency.setup(freg.minimum, freg.defaultValue, freg.maximum)
		add(myOsc)
		osc_list.add(myOsc)
		println "Added new $it.type $myOsc.name"
		println "with frequency: $freg.minimum, $freg.defaultValue, $freg.maximum"
		
		if (listLineOut != null) {
			listLineOut.each {
				def myLineOut = new LineOut()
				add(myLineOut)
				myOsc.output.connect(0, myLineOut.input, 0)
				myOsc.output.connect(0, myLineOut.input, 1)
				lineout_list.add(myLineOut)
				println "Added new LineOut"
				println "And connected it with $myOsc.name"
			}
		}

		if (listLinearRamps != null) {
			listLinearRamps.each {
				def myLag = new LinearRamp(name: it.name)
				add(myLag)
				linear_list.add(myLag)
				def lag_input = it.input
				if (lag_input != null) {
					myLag.input.setup(lag_input.minimum, lag_input.actualValue, lag_input.maximum)
					println "Added new $it.type $myLag.name"
					println "With input value: $lag_input.minimum, $lag_input.actualValue, $lag_input.maximum"
				}
				def lag_time = it.time
				if (lag_time != null) {
					myLag.time.set(lag_time.duration)
					println "With duration: $lag_time.duration"
				}

			}
		}
	}
	
	/**
	 * connecting the 'from' side of the connection (the knob)
	 * to the 'to' side of the connection (the oscillator) 
	 * This is independent from Synthesizer, so it should be moved outside Synthesizer.metaClass
	 */
	if (connections) {
		connections.each { conn ->
			def to = osc_list.findUnit(conn.to)
			def linearR = linear_list.findUnit(conn.linear)
			
			def amplitudeModel = PortModelFactory.createExponentialModel(linearR.input)
			
			if (UnitOscillator.isCase(to)){
				linearR.output.connect(to.amplitude)
				
				//TODO only the second slider affects the sound, maybe more lineouts are needed? or other kind or config?
				slider_list.add(PortControllerFactory.createExponentialPortSlider(to.frequency))
				
				def from = controls.findUnit(conn.from)
				
				println 'connecting ' + from.name + ' to ' + to.name
				println ' where ' + from.name + ' has nr. of digits ' + from.digits 
				
				def knob = new RotaryTextController(amplitudeModel, from.digits)
				knob_list.add(knob)
			} else {
				//TODO what if the user mixes up 'from' and 'to'?
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

def buildAndConnectUnits(def listOsci, def listLineOut, def listLinearRamps, def listControls) {
	s.addUnits(listOsci, listLineOut, listLinearRamps, listControls)
}


/*
 * Start main() function
 */
// Just release the block function. In the future, we can use block funtion instead
s = new JSyn().createSynthesizer()
s.start()

s.addUnits(oscillators, lineOuts, linearRamps, controls)

// sound
lineout_list.get(0).start()

// Start UIs
def builder = new groovy.swing.SwingBuilder()
def frame = builder.frame(
		title: 'Synthesizer',
		size: [500, 300],
		defaultCloseOperation: javax.swing.WindowConstants.EXIT_ON_CLOSE,
		show: true

		) {
			gridLayout(cols: 1, rows: 2)
			
			//adding knobs and sliders to the UI
			for (k in knob_list){
				panel(k)
			}
			for (sl in slider_list){
				slider(sl)
			}
		}
