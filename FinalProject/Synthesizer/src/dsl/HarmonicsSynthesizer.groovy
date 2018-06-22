package dsl

import groovy.json.JsonSlurper
import groovy.testHarmonicsSynthesizer.*

import java.awt.GridLayout

import javax.swing.BorderFactory
import javax.swing.BoxLayout
import javax.swing.JPanel

import com.jsyn.JSyn
import com.jsyn.Synthesizer
import com.jsyn.ports.UnitInputPort
import com.jsyn.scope.AudioScope
import com.jsyn.swing.PortControllerFactory
import com.jsyn.swing.PortModelFactory
import com.jsyn.swing.RotaryTextController
import com.jsyn.unitgen.Add
import com.jsyn.unitgen.Divide
import com.jsyn.unitgen.FunctionOscillator
import com.jsyn.unitgen.ImpulseOscillator
import com.jsyn.unitgen.ImpulseOscillatorBL
import com.jsyn.unitgen.LineOut
import com.jsyn.unitgen.LinearRamp
import com.jsyn.unitgen.Multiply
import com.jsyn.unitgen.PulseOscillator
import com.jsyn.unitgen.RedNoise
import com.jsyn.unitgen.SawtoothOscillator
import com.jsyn.unitgen.SawtoothOscillatorBL
import com.jsyn.unitgen.SawtoothOscillatorDPW
import com.jsyn.unitgen.SineOscillator
import com.jsyn.unitgen.SquareOscillator
import com.jsyn.unitgen.Subtract
import com.jsyn.unitgen.TriangleOscillator
import com.jsyn.unitgen.UnitOscillator

/*
 * Database
 */
def filePath = new File(".").absoluteFile.getParent()
def sluper = new JsonSlurper()
def connections = sluper.parse(new FileReader(filePath + '/src/json/connections.json'))
def oscillators = sluper.parse(new FileReader(filePath + '/src/json/oscillators.json'))
def filters = sluper.parse(new FileReader(filePath + '/src/json/filters.json'))
def controls = sluper.parse(new FileReader(filePath + '/src/json/controls.json'))
def waveformOperations = sluper.parse(new FileReader(filePath + '/src/json/waveforms.json'))

def osc_list = []		//internal list of all jsyn oscillators
def linear_list = []	//internal list of all jsyn linear Ramps
Synthesizer s
LineOut lineOut = new LineOut()
// Visualization
AudioScope scope

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

	//Loading OscillatorTypes
	final GroovyClassLoader classLoader = new GroovyClassLoader();
	def oscillatorTypesEnum = classLoader.parseClass(new File("src/dsl/enums/OscillatorTypesEnum.groovy"));

	println "Adding new LineOut"
	add(lineOutUnit)

	listOsci.each {
		def myOsc

		switch(it.type) {
			case  ((GroovyObject) oscillatorTypesEnum.FUNCTION).name:
				myOsc = new FunctionOscillator(name: it.name)
				break

			case ((GroovyObject) oscillatorTypesEnum.IMPULSE).name:
				myOsc = new ImpulseOscillator(name: it.name)
				break

			case ((GroovyObject) oscillatorTypesEnum.IMPULSEBL).name:
				myOsc = new ImpulseOscillatorBL(name: it.name)
				break

			case ((GroovyObject) oscillatorTypesEnum.PULSE).name:
				myOsc = new PulseOscillator(name: it.name)
				break

			case ((GroovyObject) oscillatorTypesEnum.REDNOISE).name:
				myOsc = new RedNoise(name: it.name)
				break

			case ((GroovyObject) oscillatorTypesEnum.SAWTOOTH).name:
				myOsc = new SawtoothOscillator(name: it.name)
				break

			case ((GroovyObject) oscillatorTypesEnum.SAWTOOTHBL).name:
				myOsc = new SawtoothOscillatorBL(name: it.name)
				break

			case ((GroovyObject) oscillatorTypesEnum.SINE).name:
				myOsc = new SineOscillator(name: it.name)
				break

			case ((GroovyObject) oscillatorTypesEnum.SQUARE).name:
				myOsc = new SquareOscillator(name: it.name)
				break

			case ((GroovyObject) oscillatorTypesEnum.TRIANGLE).name:
				myOsc = new TriangleOscillator(name: it.name)
				break
		}
		if (it.type == ((GroovyObject) oscillatorTypesEnum.SAWTOOTHDPW).name) {
			myOsc = new SawtoothOscillatorDPW(name: it.name)
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

/*
 * Define block functions
 */

/**
 * Connecting the 'from' side of the connection (the knob, the slider)
 * to the 'to' side of the connection (the oscillator).
 * This is independent from the Synthesizer.
 */
def addConnections(def listConnections, def listOscillators, def listFilters, jsonFilterList, def listControls){
	def map = [:]	// Mapping UnitInputPort (osc.frequency or amplitude) to appropriate UI elements (knob, slider...)
	//Loading enums
	final GroovyClassLoader classLoader = new GroovyClassLoader();
	def controlTypesEnumGroovy = classLoader.parseClass(new File("src/dsl/enums/ControlTypesEnum.groovy"));
	def rampConnectionEnumGroovy = classLoader.parseClass(new File("src/dsl/enums/RampConnectionTypesEnum.groovy"));

	if (listConnections) {
		listConnections.each { conn ->
			def toOscillator = listOscillators.findUnit(conn.toOscillator)
			def synthFilter = listFilters.findUnit(conn.filter)
			def userDefinedFilter = jsonFilterList.findUnit(conn.filter)

			def fromController = listControls.findUnit(conn.fromController)
			print 'connecting ' + fromController.name + ' to ' + toOscillator.name + ' using filter ' + conn.filter +' '

			if (fromController.type == ((GroovyObject) controlTypesEnumGroovy.KNOB).name){
				if (userDefinedFilter.connectsTo == ((GroovyObject) rampConnectionEnumGroovy.FREQUENCY).name){
					println 'as a frequency knob'
					synthFilter.output.connect(toOscillator.frequency)	
					map.put(toOscillator.frequency, portKnob(synthFilter.input, fromController.digits, "Frequency"))
				}
				else {
					println 'as a amplitude knob'
					synthFilter.output.connect(toOscillator.amplitude)
					map.put(toOscillator.amplitude, portKnob(synthFilter.input, fromController.digits, "Amplitude"))
				}
			}

			if (fromController.type == ((GroovyObject) controlTypesEnumGroovy.SLIDER).name){
				if (userDefinedFilter.connectsTo == ((GroovyObject) rampConnectionEnumGroovy.FREQUENCY).name){
					println 'as a frequency slider'
					map.put(toOscillator.frequency, portSlider(toOscillator.frequency))
				} else {
					println 'as a amplitude slider'
					map.put(toOscillator.amplitude, portSlider(toOscillator.amplitude))
				}
			}
		}
	}
	map
}

def startSynthesisEngine() {
	s = new JSyn().createSynthesizer()
	s.start()
}

def buildAndConnectUnits(def listOsci, def lineOutUnit, def listLinearRamps, def listControls) {
	s.addUnits(listOsci, lineOutUnit, listLinearRamps, listControls)
}

def combineWaveform(def listOsci, def waveformOp, def controlTypesEnum) {

	def list = []	// List of Jsyn arithmetic functions necessary
	int i
	switch(waveformOp) {
		case ((GroovyObject) controlTypesEnum.ADD).name:
			for (i = 0; i < listOsci.size() - 1; i++) {
				list << new Add()
			}
			break
		case ((GroovyObject) controlTypesEnum.SUB).name:
			for (i = 0; i < listOsci.size() - 1; i++) {
				list << new Subtract()
			}
			break
		case ((GroovyObject) controlTypesEnum.MUL).name:
			for (i = 0; i < listOsci.size() - 1; i++) {
				list << new Multiply()
			}
			break
		case ((GroovyObject) controlTypesEnum.DIV).name:
			for (i = 0; i < listOsci.size() - 1; i++) {
				list << new Divide()
			}
			break
	}
	listOsci[0].output.connect(list[0].inputA)
	listOsci[1].output.connect(list[0].inputB)

	for (i = 2; i < listOsci.size(); i++) {
		list[i-2].output.connect(list[i-1].inputA)
		listOsci[i].output.connect(list[i-1].inputB)
	}
	println "Combining all waveforms with function ${waveformOp}"
	return list.last()
}

//Loading waveform operations enum
final GroovyClassLoader classLoader = new GroovyClassLoader();
def controlTypesEnumGroovy = classLoader.parseClass(new File("src/dsl/enums/ArithFunctionTypesEnum.groovy"));

def buildWaveformScope(def newScope, def oscillator_list, def selectedItem, def controlTypes){

	def comb_w = combineWaveform(oscillator_list, selectedItem, controlTypes)
	newScope.addProbe(comb_w.output)
	newScope.setTriggerMode(AudioScope.TriggerMode.AUTO);
	newScope.getView().setControlsVisible(false);
}

def portKnob(UnitInputPort port, int digits, String label) {
	def model = PortModelFactory.createExponentialModel(port)
	def knob = new RotaryTextController(model, digits)
	knob.setBorder(BorderFactory.createTitledBorder(label))
	knob.setTitle(label)
	knob
}
def portSlider(UnitInputPort port) {
	def slider = PortControllerFactory.createExponentialPortSlider(port)
	slider
}

/*
 * Start main() function
 */
// Just release the block function. In the future, we can use block function instead
s = new JSyn().createSynthesizer()
s.start()

// Build and connect Unit Generators
s.addUnits(oscillators, lineOut, filters, controls)
def Osc_GUI_mapping = addConnections(connections, osc_list, linear_list, filters, controls)

/*
 * Start UIs
 */
def builder = new groovy.swing.SwingBuilder()
JPanel northPanel,portPanel, buttonPanel, southPanel

def frame = builder.frame(
		title: 'Synthesizer',
		size: [800, 600],
		defaultCloseOperation: javax.swing.WindowConstants.EXIT_ON_CLOSE,
		show: true
		) {
			boxLayout(axis: BoxLayout.Y_AXIS)
			/* -- FIRST PART: Title -- */
			northPanel = panel()
			northPanel.add(label("Oscillator Harmonics Generation"))
			
			/* -- SECOND PART: Audio scope -- */
			scope = new AudioScope(s)
			buildWaveformScope(scope, osc_list, waveformOperations[0].name, controlTypesEnumGroovy)
			southPanel = panel()
			southPanel.add(scope.getView())
			
			/* -- THIRD PART: oscillator ports -- */
			portPanel = panel()
			portPanel.setLayout(new BoxLayout(portPanel, BoxLayout.X_AXIS))
			def oscPanel
			
			Set oscNameSet = []
			connections.each {
				oscNameSet.add(it.toOscillator)
			}
			
			oscNameSet.each {
				oscPanel = new JPanel()
				oscPanel.setLayout(new GridLayout(3, 1))
				oscPanel.add(label(it))
				
				def current_oscillator = osc_list.findUnit(it)
				for (key in Osc_GUI_mapping.keySet()) {
					if (key == current_oscillator.frequency || key == current_oscillator.amplitude) {
						oscPanel.add(Osc_GUI_mapping.get(key))
					}
				}
				portPanel.add(oscPanel)
			}
			
			/* -- FORTH PART: buttons -- */
			buttonPanel = panel()
			
			// Dropdown Waveform Operations
			buttonPanel.add(comboBox(
				id:'comboWaveform',
				toolTipText:'Waveform Operation',
				items: controlTypesEnumGroovy.getEnumNames(),
				selectedIndex: controlTypesEnumGroovy.getEnumNames().indexOf(waveformOperations[0].name),
				actionPerformed:{ event ->
					lineOut.stop()
					scope.stop()
					scope = new AudioScope(s)
					scope.addProbe(combineWaveform(osc_list, event.source.selectedItem, controlTypesEnumGroovy).output)
					//repaint visualization inside the panel
					southPanel.removeAll()
					southPanel.add(scope.getView())
					southPanel.revalidate()
					southPanel.repaint()
					}
			))
			
			buttonPanel.add(button(
					text: 'Start',
					actionPerformed: {
						lineOut.start() // Pull out data so the sound can be released
						scope.start()
					}
			))
			
			buttonPanel.add(button(
					text: 'Stop',
					actionPerformed: {
						lineOut.stop()		// Stop release all the sound
						scope.stop()
					}
			))
			
			
		}
