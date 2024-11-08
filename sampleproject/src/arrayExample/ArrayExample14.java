package arrayExample;

import java.util.Random;

public class ArrayExample14 {

	public static void main(String[] args) {
		Random random = new Random();
		int[] lotto = new int[6];
		int temp = 0;
		
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = random.nextInt(45) + 1;
			for(int j=0; j<i; j++) {
				while(lotto[i] == lotto[j]) {
					lotto[i] = random.nextInt(45) + 1;
					j = 0;
				}
			}
			for(int j=0; j<i; j++) {
				while(lotto[i] < lotto[j]) {
					temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
		
		for(int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
		
	}

}
