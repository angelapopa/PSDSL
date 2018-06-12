package dsl

import java.applet.Applet
import java.awt.BorderLayout
import java.nio.file.attribute.AclEntry.Builder;

import javax.swing.GroupLayout;
import javax.swing.JButton
import javax.swing.JPanel;

import org.apache.ivy.core.module.descriptor.ExtendsDescriptor;

import com.jsyn.JSyn;
import com.jsyn.Synthesizer;
import com.jsyn.unitgen.Add;
import com.jsyn.unitgen.Divide;
import com.jsyn.unitgen.FunctionOscillator
import com.jsyn.unitgen.ImpulseOscillator
import com.jsyn.unitgen.LineOut;
import com.jsyn.unitgen.LinearRamp;
import com.jsyn.unitgen.Multiply;
import com.jsyn.unitgen.PulseOscillator
import com.jsyn.unitgen.RedNoise
import com.jsyn.unitgen.SawtoothOscillator
import com.jsyn.unitgen.SawtoothOscillatorBL
import com.jsyn.unitgen.SawtoothOscillatorDPW
import com.jsyn.unitgen.SineOscillator
import com.jsyn.unitgen.SquareOscillator
import com.jsyn.unitgen.Subtract;
import com.jsyn.unitgen.TriangleOscillator
import com.jsyn.unitgen.UnitOscillator
import com.jsyn.scope.AudioScope;
import com.jsyn.swing.DoubleBoundedRangeSlider;
import com.jsyn.swing.ExponentialRangeModel;
import com.jsyn.swing.PortControllerFactory;
import com.jsyn.swing.PortModelFactory;
import com.jsyn.swing.RotaryController;
import com.jsyn.swing.RotaryTextController;

import groovy.json.JsonSlurper
import groovy.swing.factory.LayoutFactory
import groovy.text.SimpleTemplateEngine
import groovy.ui.ConsoleApplet
import groovy.test.*

/*
 * Database
 */
def filePath = new File(".").absoluteFile.getParent()
def sluper = new JsonSlurper()
def connections = sluper.parse(new FileReader(filePath + '/src/json/connections.json'))
def oscillators = sluper.parse(new FileReader(filePath + '/src/json/oscillators.json'))
def filters = sluper.parse(new FileReader(filePath + '/src/json/filters.json'))
def controls = sluper.parse(new FileReader(filePath + '/src/json/controls.json'))

def osc_list = []		//internal list of all jsyn oscillators
def linear_list = []	//internal list of all jsyn linear Ramps
def knob_list = []		//internal list of all jsyn knobs
def slider_list = [] 	//internal list of all jsyn sliders

Synthesizer s
DoubleBoundedRangeSlider synthSlider
LineOut lineOut = new LineOut()

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
Synthesizer.metaClass.addUnits << {listOsci, lineOutUnit, listFilters, listControls ->
	assert listOsci != null
	
	println "Adding new LineOut"
	add(lineOutUnit)
	
	listOsci.each {
		def myOsc
		if (it.type == 'FunctionOscillator') {
			myOsc = new FunctionOscillator(name: it.name)
		}
		if (it.type == 'ImpulseOscillator') {
			myOsc = new ImpulseOscillator(name: it.name)
		}
		if (it.type == 'PulseOscillator') {
			myOsc = new PulseOscillator(name: it.name)
		}
		if (it.type == 'RedNoise') {
			myOsc = new RedNoise(name: it.name)
		}
		if (it.type == 'SawtoothOscillator') {
			myOsc = new SawtoothOscillator(name: it.name)
		}
		if (it.type == 'SawtoothOscillatorBL') {
			myOsc = new SawtoothOscillatorBL(name: it.name)
		}
		if (it.type == 'SawtoothOscillatorDPW') {
			myOsc = new SawtoothOscillatorDPW(name: it.name)
		}
		if (it.type == 'SineOscillator') {
			myOsc = new SineOscillator(name: it.name)
		}
		if (it.type == 'SquareOscillator') {
			myOsc = new SquareOscillator(name: it.name)
		}
		if (it.type == 'TriangleOscillator') {
			myOsc = new TriangleOscillator(name: it.name)
		}
		
		def freg = it.frequency
		myOsc.frequency.setup(freg.minimum, freg.defaultValue, freg.maximum)
		def ampl = it.amplitude
		myOsc.amplitude.setup(ampl.minimum, ampl.defaultValue, ampl.maximum)
		
		add(myOsc)
		osc_list.add(myOsc)
		println "Added new $it.type $myOsc.name"
		println "with frequency: $freg.minimum, $freg.defaultValue, $freg.maximum"
		
		myOsc.output.connect(0, lineOutUnit.input, 0)
		myOsc.output.connect(0, lineOutUnit.input, 1)
		println "Connecting $myOsc.name to lineout"
	}
	
	if (listFilters != null) {
		listFilters.each {
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
 * Connecting the 'from' side of the connection (the knob, the slider)
 * to the 'to' side of the connection (the oscillator).
 * This is independent from the Synthesizer.
 */
def addConnections(def listConnections, def listOscillators, def listFilters, jsonFilterList, def synthSliders, def listControls, def synthKnobs){
	if (listConnections) {
		listConnections.each { conn ->
			def to = listOscillators.findUnit(conn.to)
			def synthFilter = listFilters.findUnit(conn.filter)
			def userDefinedFilter = jsonFilterList.findUnit(conn.filter)
			def amplitudeModel
			
		
			def from = listControls.findUnit(conn.from)
			print 'connecting ' + from.name + ' to ' + to.name + ' using filter ' + conn.filter +' ' 
			// TODO: replace it with ControlTypes enum when it has been fixed
			if (from.type == 'knob'){//ControlTypes.KNOB.name){
				if (userDefinedFilter.connectsTo == RampConnectionTypes.FREQUENCY.name){
					println 'as a frequency knob'
					synthFilter.output.connect(to.frequency)
				}
				else {
					println 'as a amplitude knob'
					synthFilter.output.connect(to.amplitude)
				}
				amplitudeModel = PortModelFactory.createExponentialModel(synthFilter.input)
				synthKnobs.add(new RotaryTextController(amplitudeModel, from.digits))
			}
				
			if (from.type == 'slider'){//ControlTypes.SLIDER.name){
				if (userDefinedFilter.connectsTo == RampConnectionTypes.FREQUENCY.name){
					println 'as a frequency slider'
					synthSliders.add(PortControllerFactory.createExponentialPortSlider(to.frequency))
				} else {
					println 'as a amplitude slider'
					synthSliders.add(PortControllerFactory.createExponentialPortSlider(to.amplitude))
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

def buildAndConnectUnits(def listOsci, def lineOutUnit, def listLinearRamps, def listControls) {
	s.addUnits(listOsci, lineOutUnit, listLinearRamps, listControls)
}
/*
 * Start main() function
 */
// Just release the block function. In the future, we can use block function instead
s = new JSyn().createSynthesizer()
s.start()

s.addUnits(oscillators, lineOut, filters, controls)
addConnections(connections, osc_list, linear_list, filters, slider_list, controls, knob_list)

// Multiply frequency of two oscillator
Multiply mul = new Multiply()
osc_list[0].output.connect(mul.inputA)
osc_list[1].output.connect(mul.inputB)

// Visualization
AudioScope scope = new AudioScope(s)

// Start UIs
def builder = new groovy.swing.SwingBuilder()
JPanel mPanel
//builder.registerFactory( "groupLayout", new LayoutFactory(GroupLayout) )
def frame = builder.frame(
		title: 'Synthesizer',
		size: [800, 600],
		defaultCloseOperation: javax.swing.WindowConstants.EXIT_ON_CLOSE,
		show: true

		) {
			/*
			JButton a = new JButton('start 2')
			
			mPanel = new JPanel()
			GroupLayout layout = new GroupLayout(mPanel);
			mPanel.setLayout(layout)
			GroupLayout.SequentialGroup rowTop = layout.createSequentialGroup()
			rowTop.addComponent(a)
			GroupLayout.SequentialGroup columnLeft = layout.createSequentialGroup()
			columnLeft.addComponent(a)
			layout.setVerticalGroup(
				layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(rowTop)
				);
			layout.setHorizontalGroup(columnLeft)*/
			
			gridLayout(rows: 2, cols: 3)
			//adding knobs and sliders to the UI
			for (k in knob_list){
				panel(k)
//				rowTop.addComponent(k)
			}
			for (sl in slider_list){
				slider(sl)
			}
			// For visualization
			mPanel = new JPanel()
			scope.addProbe(mul.output)
			
			// Replace by new Arithmetic function
			// TODO should be moved inside dropdown function
			scope = new AudioScope(s)
			Divide sub = new Divide()
			// TODO should be replaced by a function combining all oscillators
			osc_list[0].output.connect(sub.inputA)
			osc_list[1].output.connect(sub.inputB)

			scope.addProbe(sub.output)
			scope.setTriggerMode(AudioScope.TriggerMode.AUTO);
			scope.getView().setControlsVisible(false);
			mPanel.add(scope.getView())
			mPanel.getToolkit().sync()
			
			// Buttons
			
			button(
				text: 'Start',
				actionPerformed: {
					for (line_out in lineout_list){
						line_out.start()	// Pull out data so the sound can be released
						scope.start()
					}
				}
				)
			button(
				text: 'Stop',
				actionPerformed: {
					for (line_out in lineout_list){
						line_out.stop()		// Stop release all the sound
						scope.stop()
					}
				}
				)
			
		}
frame.add(mPanel)