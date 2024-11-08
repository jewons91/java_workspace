package ch08.lib;

public class PhoneRunnable implements Runnable{

	private int n = 0;
	
	@Override
	public void run() {
		while(true) {
			System.out.println("PhoneRunnable RUN!!!!");
			System.out.println(n);
			n++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				return;
			}
		}
	}

}
