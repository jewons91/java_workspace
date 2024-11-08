package ch08.lib;

public class TimerRunnable implements Runnable{

	private int n = 0;
	
	@Override
	public void run() {
		while(true) {
			System.out.println("TimerRunnable RUN!!!");
			System.out.println(n);
			n++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
				return;
			}
		}
	}
	
}
