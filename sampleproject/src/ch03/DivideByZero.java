package ch03;

import java.util.Scanner;

//	키보드로 입력한 정수를 0으로 나누어 에러 발생 : 분자/분모(0)
public class DivideByZero {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int dividend = 0;	// 분자
		int divisor = 0;	// 분모
		int result = 0;	// 결과
		
		System.out.print("분자 입력 : ");
		dividend = scan.nextInt();
		
		System.out.print("분모 입력 : ");
		divisor = scan.nextInt();
		
		try {
			result = dividend / divisor;			
			System.out.println("결과 : " + result);
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌수 없다.");
		}
		
		System.out.println("프로그램 종료");
		scan.close();
		
	}

}
