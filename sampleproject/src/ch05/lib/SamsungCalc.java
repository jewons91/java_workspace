package ch05.lib;

public class SamsungCalc extends Calculator{

	@Override
	public int add(int a, int b) {
		System.out.println("Samsung Calc Add");
		return a + b;
	}

	@Override
	public int subtract(int a, int b) {
		System.out.println("Samsung Calc Sub");
		return a - b;
	}

	@Override
	public double average(int[] a) {
		System.out.println("Samsung Calc Avg");
		double sum = 0.0;
		for(int k : a) {
			sum = sum + k;
		}
		return sum / a.length;
	}
	
}
