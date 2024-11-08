package ch03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExam {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int age = 0;
		System.out.print("나이 입력 : ");
		try {
			age = scan.nextInt();			
		}catch(InputMismatchException e) {
//			처리 코드
			System.out.println("잘못입력 정수형태로 하세요");
		}
		System.out.println("입력 나이 : " + age);
		scan.close();
	}

}
