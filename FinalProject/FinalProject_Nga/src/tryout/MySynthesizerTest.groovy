package tryout;

import groovy.json.JsonSlurper

import javax.swing.JApplet;

import com.jsyn.JSyn
import com.jsyn.Synthesizer;
import com.jsyn.swing.JAppletFrame;

class MySynthesizerTest extends JApplet {
	def filePath = new File(".").absoluteFile.getParentFile().getParent()//.replace('.', '')
	def sluper = new JsonSlurper()
	def lineOuts = sluper.parse(new FileReader(filePath + '/src/json/lineOuts.json'))
	def oscillators = sluper.parse(new FileReader(filePath + '/src/json/oscillators.json'))
	
	Synthesizer synth;
	
	public void start() {
		synth = JSyn.createSynthesizer();
		synth.start();
		synth.addUnit(oscillators)
	}
	
	public void stop() {
		if (synth != null) {
			synth.stop();
			synth = null;
		}
	}
	
	static main(args) {
		/*
		Synthesizer.metaClass.addUnit << {oscillators -> oscillators.each {
			//	String name = it.name
			//	add(name = new SineOscillator())
				println it.name
			}}
			
		*/
		def filePath = new File(".").absoluteFile.getParentFile().getParent()
		new GroovyShell().evaluate(new File(filePath + '/src/tryout/MOP.groovy'))
	}
}


