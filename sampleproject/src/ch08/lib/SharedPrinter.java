package ch08.lib;

public class SharedPrinter {
	public synchronized void print(String text) {	// 한줄 출력
//		Thread.yield();
		
		for(int i=0; i<text.length(); i++) {
			System.out.print(text.charAt(i));
		}
		System.out.println();
	}
}
