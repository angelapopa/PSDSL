package example;
import com.jsyn.JSyn;
import com.jsyn.Synthesizer;

/**
 * Timer.java
 * Lesson 2
 * Play with Time and Sleeping
 * 
 * @author Nga Pham
 * References: http://www.softsynth.com/jsyn/docs/usersguide.php#TimeSleeping
 * 
 * Library: JSyn (C) 1997 Phil Burk, visit www.softsynth.com
 */

public class Timer {
	Synthesizer synth;
	
	private void startSynthesisEngine() {
		synth = JSyn.createSynthesizer();
		synth.start();	// using the default outputs at 44100 Hz. 
	}
	
	private void getTime() throws InterruptedException {
		double time = synth.getCurrentTime();
		System.out.println(time);
		for (int i = 0; i < 200; i++) {
			doSomething(time);
			time += 2.0;
			synth.sleepUntil(time);
			// To sleep for a certain number of ticks, use synth.sleepFor(duration), i.e: 2.01, 2.02...
		}
	}
	
	private void doSomething(double time) {
		System.out.println("Do something in " + time);
	}

	public static void main(String[] args) {
		Timer t = new Timer();
		t.startSynthesisEngine();
		try {
			t.getTime();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
