package ch08.lib;

// 1초마다 1씩 증가된 값을 출력
public class TimerThread extends Thread{
	
	private int n = 0;
	
	public TimerThread(String name) {
		super(name);	// Thread(String name);
	}
	
	@Override
	public void run() {
		while(true) {	// 무한 반복 => 종료되지 않는다. => 스레드 종료되지 않는다.
			System.out.println(super.getName()
					         + " : " + n);
			n++;
			try {
				sleep(1000);
//				super.sleep(1000);
//				Thread.sleep(1000);	// sleep static
			} catch (InterruptedException e) {
				e.printStackTrace();
				return;
			}	// 1초동안 자라
		}
	}
}
