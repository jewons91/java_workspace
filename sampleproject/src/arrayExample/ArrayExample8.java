package arrayExample;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayExample8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] intArr = null;
		int number = 0;
		int value = 0;
		
		while(number < 3 || number % 2 == 0) {
			try {
				System.out.print("정수 : ");
				number = scanner.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("다시 입력하세요.");
				scanner.nextLine();
				continue;
			}
			if(number < 3 || number % 2 == 0) {
				System.out.println("다시 입력하세요.");
			}
			
		}
		
		intArr = new int[number];
		
		for(int i=0; i<intArr.length; i++) {
			if(i <= number / 2) {
				value += 1;
				intArr[i] = value;
			}else {
				value -= 1;
				intArr[i] = value;
			}
			System.out.print(intArr[i] + " ");
		}
		
		scanner.close();
		
	}

}
