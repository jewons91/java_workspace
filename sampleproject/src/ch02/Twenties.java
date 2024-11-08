package ch02;

import java.util.Scanner;

public class Twenties {

	public static void main(String[] args) {
//		1. 필요 변수 선언
//		1.1 키보드
		Scanner scan = new Scanner(System.in);
//		나이 저장 변수
		int age = 0;
		
//		2. 나이 입력
		System.out.print("나이 입력 : ");
		age = scan.nextInt();	// 키보드에서 나이 입력
		
//		20대 인 경우 20대가 아닌 경우
		if((age >= 20) && (age < 30)) {
//			true : 20대다
			System.out.println("20대입니다");
			System.out.println("행복하다");
		} else {
//			false : 20대가 아니다
			System.out.println("20대가 아니다");
			System.out.println("그래도 행복하다");
		}
		
		scan.close();
	}

}
