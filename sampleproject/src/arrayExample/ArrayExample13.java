package arrayExample;

import java.util.Random;

public class ArrayExample13 {

	public static void main(String[] args) {
		Random random = new Random();
		int[] intArr = new int[10];
		
		for(int i=0; i<intArr.length; i++) {
			intArr[i] = random.nextInt(10) + 1;
			for(int j=0; j<i; j++) {
				while(intArr[i] == intArr[j]) {
					intArr[i] = random.nextInt(10) + 1;
					j = 0;
				}
			}
		}
		for(int i=0; i<intArr.length; i++) {
			System.out.print(intArr[i] + " ");
		}
		
	}
	
}
