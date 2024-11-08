package ch08.main;

import ch08.lib.PhoneRunnable;
import ch08.lib.TimerRunnable;

public class TestThread {

	public static void main(String[] args) {
		TimerRunnable tr = new TimerRunnable();	// run 들어있는 부품
		PhoneRunnable pr = new PhoneRunnable();
		
		Thread th1 = new Thread(tr);	// Thread(Runnable target)
		Thread th2 = new Thread(pr);
		
		th1.start();
		th2.start();
		
		th1.interrupt();
		th2.interrupt();
	}

}
