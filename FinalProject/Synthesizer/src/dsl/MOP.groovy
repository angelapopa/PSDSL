package tryout

import java.applet.Applet
import java.nio.file.attribute.AclEntry.Builder;

import org.apache.ivy.core.module.descriptor.ExtendsDescriptor;

import com.jsyn.JSyn;
import com.jsyn.Synthesizer;
import com.jsyn.unitgen.LineOut;
import com.jsyn.unitgen.SineOscillator

import groovy.json.JsonSlurper
import groovy.text.SimpleTemplateEngine
import groovy.ui.ConsoleApplet

def filePath = new File(".").absoluteFile.getParent()
def sluper = new JsonSlurper()
def lineOuts = sluper.parse(new FileReader(filePath + '/src/json/lineOuts.json'))
def oscillators = sluper.parse(new FileReader(filePath + '/src/json/oscillators.json'))

Synthesizer.metaClass.addOsci << {list ->
	int count = 0
	list.each {
		// handle Unit name
		/*
		String script = '''<% print "$name"%>'''
		def binding = [
			name: it.name
		]
		def engine = new SimpleTemplateEngine()
		def template = engine.createTemplate(script).make(binding)
		String name = template.toString()
		*/
		if (it.type == 'SineOscillator') {
			SineOscillator myOsc
			add(myOsc = new SineOscillator())
		}
		count++
		println "Added new $it.type "//$name"
	}
}

Synthesizer.metaClass.addLineOut << {list ->
	list.each {
		LineOut myLineOut
		add(myLineOut = new LineOut())
		println "Added new LineOut"
	}
}

Synthesizer s
def startSynthesisEngine() {
	s = new JSyn().createSynthesizer()
	s.start()
}

def buildUnitGenerators(def listOsci, def listLineOut) {
	s.addOsci(listOsci)
	s.addLineOut(listLineOut)
}

def connectUnitGenerators() {
	
}

def startUnitGenerators() {
	
}

startSynthesisEngine()
buildUnitGenerators(oscillators, lineOuts)

def builder = new groovy.swing.SwingBuilder()
def frame = builder.frame(
	title: 'Swing',
	size: [500, 300],
//	layout: new java.awt.FlowLayout(),
	defaultCloseOperation: javax.swing.WindowConstants.EXIT_ON_CLOSE,
	show: true
	
	) {
	
	}
/*
public class AppletFrame extends Applet {
	public void start() {
		
		
	}
}*/