package ch03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputException {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		int num = 0;
		
		System.out.println("정수 3개 입력하세요");
		
		for(int i=0; i<3; i++) {
			System.out.print(i + " >> ");
			
			try {
				num = scan.nextInt();
				sum = sum + num;	// 정상 상태
			}catch(InputMismatchException e) {
//				비정상 상태
				System.out.println("정수가 아니다. 다시 입력");
				scan.next();	// 비정상 입력된 값을 추출 버린다
				i--;
//				continue;
			}
		}	// for end
		scan.close();
	}

}
