package ch05.main;

import ch05.lib.Calculator;
import ch05.lib.LgCalc;
import ch05.lib.SamsungCalc;

public class CalcTest {

	public static void main(String[] args) {
		Calculator c = new LgCalc();
		System.out.println(c.add(2, 3));
		System.out.println(c.subtract(2, 3));
		System.out.println(c.average(new int[] {2,3,4}));
	}

}
