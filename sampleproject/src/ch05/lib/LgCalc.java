package ch05.lib;

public class LgCalc extends Calculator{

	@Override
	public int add(int a, int b) {
		System.out.println("Lg Calc Add");
		return a + b;
	}

	@Override
	public int subtract(int a, int b) {
		System.out.println("Lg Calc Sub");
		return a - b;
	}

	@Override
	public double average(int[] a) {
		System.out.println("Lg Calc Avg");
		double sum = 0.0;
		for(int k : a) {
			sum = sum + k;
		}
		return sum / a.length;
	}
	
}
