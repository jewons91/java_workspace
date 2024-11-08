package arrayExample;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayExample3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] intArray = null;
		int number = 0;
		
		while(number <= 0) {
			try {
				System.out.print("양의 정수 : ");
				number = scanner.nextInt();

			}catch(InputMismatchException e) {
				System.out.println("양의 정수를 입력해주세요.");
				scanner.nextLine();
				continue;
			}
			if (number <= 0) {
				System.out.println("양의 정수를 입력해주세요.");
			}else {
				break;
			}			
		}
		intArray = new int[number];
		
		for(int i=0; i<number; i++) {
			intArray[i] = i + 1;
			System.out.print(intArray[i] + " ");
		}
		scanner.close();
	}

}
