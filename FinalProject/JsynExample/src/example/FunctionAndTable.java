package example;

import com.jsyn.JSyn;
import com.jsyn.Synthesizer;
import com.jsyn.data.DoubleTable;
import com.jsyn.unitgen.FunctionEvaluator;

public class FunctionAndTable {

	final static int WAVE_LENGTH = 1024;
	final static int TABLE_LENGTH = WAVE_LENGTH + 1;
	Synthesizer synth;

	private void startSynthesisEngine() {
		synth = JSyn.createSynthesizer();
		synth.start();	// using the default outputs at 44100 Hz. 
	}

	// Create a Lookup Table for Function
	private void createLookupTable() {
		double[] data = new double[TABLE_LENGTH];
		for (int i = 0; i < data.length; i++) {
			data[i] = (0.5 * Math.sin(i * 2.0 * Math.PI/WAVE_LENGTH))
					+ (0.5 * Math.sin(3.0 * i * 2.0 * Math.PI/WAVE_LENGTH));
			System.out.println(data[i]);
		}

		DoubleTable cubeTable = new DoubleTable(data);
		FunctionEvaluator fastCuber = new FunctionEvaluator();
		fastCuber.function.set(cubeTable);

		synth.add(fastCuber);
		fastCuber.start();
	}

	public static void main(String[] args) {
		FunctionAndTable test = new FunctionAndTable();
		test.startSynthesisEngine();

		test.createLookupTable();



	}

}
