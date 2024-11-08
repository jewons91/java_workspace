package arrayExample;

import java.util.Random;

public class ArrayExample11 {

	public static void main(String[] args) {
		int[] intArr = new int[10];
		Random random = new Random();
		
		for(int i=0; i<intArr.length; i++) {
			intArr[i] = random.nextInt(10) + 1;
			System.out.print(intArr[i] + " ");
		}
		
	}

}
