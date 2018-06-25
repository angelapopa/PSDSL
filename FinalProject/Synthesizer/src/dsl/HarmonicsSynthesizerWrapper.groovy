package dsl

import com.jsyn.*
import com.jsyn.ports.UnitInputPort
import com.jsyn.ports.UnitOutputPort
import com.jsyn.scope.AudioScope
import com.jsyn.swing.RotaryTextController
import com.jsyn.unitgen.Add
import com.jsyn.unitgen.Divide
import com.jsyn.unitgen.FilterHighPass
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
import com.jsyn.unitgen.UnitGenerator
import com.jsyn.unitgen.UnitOscillator
import com.jsyn.swing.PortControllerFactory
import com.jsyn.swing.PortModelFactory
import com.jsyn.swing.RotaryTextController

import groovy.json.JsonSlurper
import groovy.swing.SwingBuilder

import java.awt.GridLayout

import javax.swing.BoxLayout
import javax.swing.JFrame
import javax.swing.BorderFactory
import javax.swing.JPanel

class HarmonicsSynthesizerWrapper {
	def osc_list		//internal list of all jsyn oscillators
	def filter_list		//internal list of all jsyn filter (Linear Ramps, FilterHighPass...)
	Synthesizer s
	LineOut lineOut
	// Visualization
	AudioScope scope
	// Enum
	final GroovyClassLoader classLoader
	def functionTypesEnum, oscillatorTypesEnum, filterTypesEnum
	// Connection
	def Osc_GUI_mapping
	// GUI
	SwingBuilder builder
	JFrame frame
	JPanel titlePanel, scopePanel, portPanel, buttonPanel

	public HarmonicsSynthesizerWrapper() {
		super();
		osc_list = []
		filter_list = []
		lineOut = new LineOut()
		classLoader = new GroovyClassLoader()
		// Loading enum types
		functionTypesEnum = classLoader.parseClass(new File("src/dsl/enums/ArithFunctionTypesEnum.groovy"))
		oscillatorTypesEnum = classLoader.parseClass(new File("src/dsl/enums/OscillatorTypesEnum.groovy"))
		filterTypesEnum = classLoader.parseClass(new File("src/dsl/enums/FilterTypesEnum.groovy"))
	}

	def metaFunction() {
		// -----------------------------------
		// Meta programming
		// -----------------------------------
		/**
		 * Using user-defined name for unit identification
		 */
		UnitGenerator.metaClass.name = 'myUnitGen'	// This is default name
//		UnitFilter.metaClass.name = 'myFilter'		// This is default name

		/**
		 * Special list method to find elements by name
		 */
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
		
		List.metaClass.findUnitByType << {searchTerm ->
			def result
			each {
				for (int i=0; i < it.size(); i++){
					if (searchTerm == it[i].type){
						result = it[i]
					}
				}
			}
			result
		}

		/**
		 * Adding all necessary UnitGenerators
		 */
		Synthesizer.metaClass.addUnits << {listOsci, listFilters, listControls ->
			assert listOsci != null

			println "Adding new LineOut"
			add(lineOut)

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

				def freq = it.frequency
				assert freq != null
				myOsc.frequency.setup(freq.minimum, freq.defaultValue, freq.maximum)
				def ampl = it.amplitude
				assert ampl != null
				myOsc.amplitude.setup(ampl.minimum, ampl.defaultValue, ampl.maximum)

				add(myOsc)
				osc_list.add(myOsc)
				println "Added new $it.type $myOsc.name"
				println "with frequency: $freq.minimum, $freq.defaultValue, $freq.maximum"
			}

			if (listFilters != null) {
				listFilters.each {
					def myFilter
					switch(it.type) {
						case ((GroovyObject)filterTypesEnum.LINEAR_RAMP).name:
						myFilter = new LinearRamp(name: it.name)
						def lag_input = it.input
						if (lag_input != null) {
							myFilter.input.setup(lag_input.minimum, lag_input.actualValue, lag_input.maximum)
							println "Added new $it.type $myFilter.name"
							println "With input value: $lag_input.minimum, $lag_input.actualValue, $lag_input.maximum"
						}
						def lag_time = it.time
						if (lag_time != null) {
							myFilter.time.set(lag_time.duration)
							println "With duration: $lag_time.duration"
						}
						break
						
						case ((GroovyObject)filterTypesEnum.HIGH_PASS).name:
						myFilter = new FilterHighPass(name: it.name)
//						add(myHighPass)
//						filter_list.add(myHighPass)
						
						break
						
						case ((GroovyObject)filterTypesEnum.LOW_PASS).name:
						myFilter = new FilterHighPass(name: it.name)
						
						break
					}
					add(myFilter)
					filter_list.add(myFilter)
					/*osc_list.each {
					 it.output.connect(myFilter.input)
				 	}*/
					def filterFreq = it.frequency
					if (filterFreq != null) {
						myFilter.frequency.setup(filterFreq.minimum, filterFreq.defaultValue, filterFreq.maximum)
					}
					def filterAmpl = it.amplitude
					if (filterAmpl != null) {
						myFilter.amplitude.setup(filterAmpl.minimum, filterAmpl.defaultValue, filterAmpl.maximum)
					}
				}
			}
		}
	}

	// -----------------------------------
	// Block functions
	// -----------------------------------

	/**
	 * Connecting the 'from' side of the connection (the knob, the slider)
	 * to the 'to' side of the connection (the oscillator).
	 * This is independent from the Synthesizer.
	 */
	def addConnections(def listConnections, jsonFilterList, def listControls){
		def map = [:]	// Mapping UnitInputPort (osc.frequency or amplitude) to appropriate UI elements (knob, slider...)
		//Loading enums
		// TODO: remove local var "controlTypesEnumGroovy" to use global var
		final GroovyClassLoader classLoader = new GroovyClassLoader()
		def controlTypesEnumGroovy = classLoader.parseClass(new File("src/dsl/enums/ControlTypesEnum.groovy"))
		def rampConnectionEnumGroovy = classLoader.parseClass(new File("src/dsl/enums/RampConnectionTypesEnum.groovy"))

		if (listConnections) {
			listConnections.each { conn ->
				def toOscillator = osc_list.findUnit(conn.toOscillator)
				def synthFilter = filter_list.findUnit(conn.filter)
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

	/**
	 * Create knob for oscillator frequency or amplitude
	 * @param port
	 * @param digits
	 * @param label: Name of port displaying in portPanel
	 * @return
	 */
	def portKnob(UnitInputPort port, int digits, String label) {
		def model = PortModelFactory.createExponentialModel(port)
		def knob = new RotaryTextController(model, digits)
		knob.setBorder(BorderFactory.createTitledBorder(label))
		knob.setTitle(label)
		knob
	}

	/**
	 * Create slider for oscillator frequency or amplitude
	 * @param port
	 * @return
	 */
	def portSlider(UnitInputPort port) {
		def slider = PortControllerFactory.createExponentialPortSlider(port)
		slider
	}

	/**
	 * Return the Harmonics of all oscillator waveform based on an Jsyn Arithmetic Function
	 * @param listOsci
	 * @param waveformOp: Jsyn Arithmetic Function. http://www.softsynth.com/jsyn/docs/unitlist.php
	 * @param functionTypesEnum: Mapping between Jsyn Arithmetic Function with function name displaying in combobox
	 * @return
	 */
	def combineWaveform(def listOsci, def waveformOp, def functionTypesEnum) {

		def list = []	// List of Jsyn arithmetic functions necessary
		int i
		switch(waveformOp) {
			case ((GroovyObject) functionTypesEnum.ADD).name:
			for (i = 0; i < listOsci.size() - 1; i++) {
				list << new Add()
			}
			break
			case ((GroovyObject) functionTypesEnum.SUB).name:
			for (i = 0; i < listOsci.size() - 1; i++) {
				list << new Subtract()
			}
			break
			case ((GroovyObject) functionTypesEnum.MUL).name:
			for (i = 0; i < listOsci.size() - 1; i++) {
				list << new Multiply()
			}
			break
			case ((GroovyObject) functionTypesEnum.DIV).name:
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
	
	def connectToLineOut(def lineOut, def port) {
		port.output.connect(0, lineOut.input, 0)
		port.output.connect(0, lineOut.input, 1)
		println "Connecting $port to lineout"

	}
	
	/**
	 * Create scope for the combined Harmonics
	 * @param newScope
	 * @param oscillator_list
	 * @param waveformOp
	 * @param functionTypesEnumGroovy
	 * @return
	 */
	def buildWaveformScope(def newScope, def oscillator_list, def waveformOp, def functionTypesEnumGroovy, def lineOut){
		def comb_w = combineWaveform(oscillator_list, waveformOp, functionTypesEnumGroovy)
		connectToLineOut(lineOut, comb_w)
		newScope.addProbe(comb_w.output)
		newScope.setTriggerMode(AudioScope.TriggerMode.AUTO);
		newScope.getView().setControlsVisible(false);
	}

	def startSynthesisEngine() {
		s = new JSyn().createSynthesizer()
		s.start()
	}

	def buildAndConnectUnits(def jsonConnections, def jsonOsci, def jsonFilters, def jsonControls) {
		s.addUnits(jsonOsci, jsonFilters, jsonControls)
		Osc_GUI_mapping = addConnections(jsonConnections, jsonFilters, jsonControls)
	}

	// -----------------------------------
	// GUI
	// -----------------------------------
	def setupGUI(def connections, def waveformOperations, List filters) {
		builder = new groovy.swing.SwingBuilder()
		frame = builder.frame(
		title: 'Synthesizer',
		size: [800, 600],
		defaultCloseOperation: javax.swing.WindowConstants.EXIT_ON_CLOSE,
		show: true
		) {
			boxLayout(axis: BoxLayout.Y_AXIS)
			/* -- FIRST PART: Title -- */
			titlePanel = panel()
			titlePanel.add(label("Harmonic Oscillator Simulation"))

			/* -- SECOND PART: Audio scope -- */
			// At first time, default filter is LinearRamp
			// So the combined waveform will connect directly to LineOut
			scope = new AudioScope(s)
			//					buildWaveformScope(scope, osc_list, waveformOperations[0].name, functionTypesEnum, lineOut)
			def comb_w = combineWaveform(osc_list, waveformOperations[0].name, functionTypesEnum)
			connectToLineOut(lineOut, comb_w)
			scope.addProbe(comb_w.output)
			scope.setTriggerMode(AudioScope.TriggerMode.AUTO);
			scope.getView().setControlsVisible(false);
			scopePanel = panel()
			scopePanel.add(scope.getView())

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
			// Find all Filter types and assign values for dropdownFilter
			List currentFilterTypesEnum = filters.type.unique()
			buttonPanel.add(comboBox(
				id: 'dropdownFilter',
				toolTipText: 'Filter',
				items: currentFilterTypesEnum,
				selectedIndex: 0,
				actionPerformed: { event ->
					lineOut.input.disconnectAll()
					scope.stop()
					scope = new AudioScope(s)
					def current_filterName = filters.findUnitByType(event.source.selectedItem).name
					def current_filter = filter_list.findUnit(current_filterName)
					switch (event.source.selectedItem) {	// Check type of filters for further processing
						case ((GroovyObject) filterTypesEnum.HIGH_PASS).name:
						case ((GroovyObject) filterTypesEnum.LOW_PASS).name:
						comb_w.output.connect(current_filter.input)
						connectToLineOut(lineOut, current_filter)
						scope.addProbe(current_filter.output)
						break
						
						case ((GroovyObject) filterTypesEnum.LINEAR_RAMP).name:
						connectToLineOut(lineOut, comb_w)
						scope.addProbe(comb_w.output)
						break
					}
					
					//repaint visualization inside the panel
					scopePanel.removeAll()
					scopePanel.add(scope.getView())
					scopePanel.revalidate()
					scopePanel.repaint()
					scope.start()
				}
				))

			// Dropdown Waveform Operations
			buttonPanel.add(comboBox(
			id:'dropdownWaveform',
			toolTipText:'Waveform Operation',
			items: functionTypesEnum.getEnumNames(),
			selectedIndex: functionTypesEnum.getEnumNames().indexOf(waveformOperations[0].name),
			actionPerformed:{ event ->
				lineOut.input.disconnectAll()
//				scope.stop()
				scope = new AudioScope(s)
				//								buildWaveformScope(scope, osc_list, event.source.selectedItem, functionTypesEnum, lineOut)
				comb_w = combineWaveform(osc_list, event.source.selectedItem, functionTypesEnum)
				connectToLineOut(lineOut, comb_w)
				scope.addProbe(comb_w.output)
				//repaint visualization inside the panel
				scopePanel.removeAll()
				scopePanel.add(scope.getView())
				scopePanel.revalidate()
				scopePanel.repaint()
				scope.start()
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
				s.stop()
			}
			))
		}
	}

	static main(args) {
		def filePath = new File(".").absoluteFile.getParent()
		def sluper = new JsonSlurper()
		def connections = sluper.parse(new FileReader(filePath + '/src/json/connections.json'))
		def oscillators = sluper.parse(new FileReader(filePath + '/src/json/oscillators.json'))
		def filters = sluper.parse(new FileReader(filePath + '/src/json/filters.json'))
		def controls = sluper.parse(new FileReader(filePath + '/src/json/controls.json'))
		def waveformOperations = sluper.parse(new FileReader(filePath + '/src/json/waveforms.json'))

		def test = new HarmonicsSynthesizerWrapper()
		test.metaFunction()
		test.startSynthesisEngine()
		test.buildAndConnectUnits(connections, oscillators, filters, controls)
		test.setupGUI(connections, waveformOperations, filters)
	}
}
