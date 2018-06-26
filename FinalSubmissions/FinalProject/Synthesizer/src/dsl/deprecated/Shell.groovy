package dsl.deprecated
import com.jsyn.JSyn;
import com.jsyn.Synthesizer;
import com.jsyn.swing.*;
import com.jsyn.unitgen.LineOut;
import com.jsyn.unitgen.LinearRamp;
import com.jsyn.unitgen.SawtoothOscillatorBL;
import com.jsyn.unitgen.UnitOscillator;



	def Synthesizer synth
	def UnitOscillator osc
	def LinearRamp lag
	
	/*class CustomBinding extends Binding {
		def getVariable(String word) {
			// return 
			if (word == ) 
			null
		}
		
	}*/
	def binding = new Binding()
	binding.sawToothOschillator {
	    //String name -> new SawtoothOscillatorBL()
	    String name -> println name
	}

	// Create shell with the new binding.
	def shell = new GroovyShell(binding)
	def script = new File('Editor.dsl')
 
// And execute
shell.evaluate script

