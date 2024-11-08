package arrayExample;

import java.util.Random;

public class ArrayExample12 {

	public static void main(String[] args) {
		int[] intArr = new int[10];
		Random random = new Random();
		int max = 1;
		int min = 10;
		
		for(int i=0; i<intArr.length; i++) {
			intArr[i] = random.nextInt(10) + 1;
			System.out.print(intArr[i] + " ");
		}
		
		for(int i=0; i<intArr.length; i++) {
			if(intArr[i] > max) {
				max = intArr[i];
			}
			
			if(intArr[i] < min) {
				min = intArr[i];
			}
		}
		System.out.println();
		System.out.print("최대값 : " + max);
		System.out.println();
		System.out.print("최소값 : " + min);
	}

}
