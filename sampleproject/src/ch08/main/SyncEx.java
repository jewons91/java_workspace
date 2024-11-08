package ch08.main;

import ch08.lib.SharedPrinter;
import ch08.lib.WorkerThread;

public class SyncEx {

	public static void main(String[] args) {
		SharedPrinter p = new SharedPrinter();
		
//		영문
		String[] engText = {
				"Wise men say",
				"Wise men say",
				"Wise men say",
				"Wise men say",
				"Wise men say",
				"Wise men say",
				"Wise men say",
				"Wise men say"
		};
		
//		한글
		String[] korText = {
				"동해물과 백두산이 마르고 닳도록",
				"동해물과 백두산이 마르고 닳도록",
				"동해물과 백두산이 마르고 닳도록",
				"동해물과 백두산이 마르고 닳도록",
				"동해물과 백두산이 마르고 닳도록",
				"동해물과 백두산이 마르고 닳도록",
				"동해물과 백두산이 마르고 닳도록",
				"동해물과 백두산이 마르고 닳도록"
		};
		
//		두개 스레드 생성
		Thread t1 = new WorkerThread(p,engText);
		Thread t2 = new WorkerThread(p,korText);
		
		t1.start();
		t2.start();
	}

}
