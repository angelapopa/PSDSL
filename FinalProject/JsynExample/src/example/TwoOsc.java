package example;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

import com.jsyn.JSyn;
import com.jsyn.Synthesizer;
import com.jsyn.ports.UnitInputPort;
import com.jsyn.ports.UnitOutputPort;
import com.jsyn.swing.SoundTweaker;
import com.jsyn.unitgen.*;
import com.softsynth.shared.time.TimeStamp;

public class TwoOsc extends Circuit implements UnitVoice {

    private SineOscillator osc1;
    private SawtoothOscillator osc2;
    private Multiply mult;

    public UnitInputPort frequency1;
    public UnitInputPort frequency2;
    public UnitInputPort amplitude;

    public TwoOsc() {
        add(osc1 = new SineOscillator());
        add(osc2 = new SawtoothOscillator());
        add(mult = new Multiply());

        osc1.output.connect(mult.inputA);
        osc2.output.connect(mult.inputB);

        addPort(frequency1 = osc1.frequency, "frequency");
        addPort(frequency2 = osc2.frequency, "frequency2");
        addPort(amplitude = osc1.amplitude, "amplitude");

        frequency1.setup(20, 100, 1000);
        frequency2.setup(20, 101, 1000);
        amplitude.setup(0, 0.5, 1.0);
    }

    public UnitOutputPort getOutput() {
        return mult.output;
    }

    public void noteOff(TimeStamp ts) {
        amplitude.set(0, ts);

    }

    public void noteOn(double freq, double amp, TimeStamp ts) {
        amplitude.set(amp, ts);
        frequency1.set(freq, ts);

    }

    public static void main(String[] args) {

        final Synthesizer synth = JSyn.createSynthesizer();
        synth.start();

        TwoOsc voice = new TwoOsc();
        synth.add(voice);

        LineOut out = new LineOut();
        synth.add(out);
        out.start();

        voice.getOutput().connect(0, out.input, 0);
        voice.getOutput().connect(0, out.input, 1);

        JFrame jf = new JFrame();
        SoundTweaker tweaker = new SoundTweaker(synth, "Test this sound", voice);
        jf.add(tweaker);
        jf.pack();
        jf.setVisible(true);
        jf.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                synth.stop();
                System.exit(0);
            }
        });

    }

}


