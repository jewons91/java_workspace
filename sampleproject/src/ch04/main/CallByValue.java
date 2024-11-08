package ch04.main;

public class CallByValue {

	private static void increase(int m) {	// 내부에서만 사용시 private
		m = m + 1;
	}
	public static void main(String[] args) {
		int n = 10;
		increase(n);
		System.out.println(n);
	}

}
