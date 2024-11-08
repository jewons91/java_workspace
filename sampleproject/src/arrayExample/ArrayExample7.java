package arrayExample;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayExample7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int leng = 0;
		int[] intArr = null;
		int sum = 0;
		int value = 0;
		
		while(leng <= 0) {
			try {
				System.out.print("정수 : ");
				leng = scanner.nextInt();
			}catch (InputMismatchException e) {
				System.out.println("정수를 입력하세요.");
				scanner.next();
			}
			if(leng <= 0) {
				System.out.println("양의 정수를 입력하세요.");
			}
		}
		
		intArr = new int[leng];
		
		for(int i=0; i<intArr.length; i++) {
			while(true) {
				try {
					System.out.print("배열 " + i + " 번째 인덱스에 넣을 값 : ");
					value = scanner.nextInt();
					break;
				}catch (InputMismatchException e) {
					System.out.println("정수를 입력하세요.");
					scanner.next();
				}
			}
			intArr[i] = value;
			sum += value;
		}
		
		for(int i : intArr) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.print("총 합 : " + sum);
		
		scanner.close();
	}

}
