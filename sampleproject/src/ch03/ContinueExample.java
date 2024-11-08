package ch03;

import java.util.Scanner;

public class ContinueExample {

	public static void main(String[] args) {
//		양수 합 저장, 키보드 입력
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		
//		처리
		System.out.println("정수 5개 입력하세요");
		for (int i=0; i<5; i++) {	// 5번 반복 : 키보드입력, 합
			int num = scan.nextInt();	// 정수 입력
			if (num <= 0) {	// 음수, 0 인 경우다
				continue;	// skip, 아래 코드가 실행되지 않습니다
			}
			sum = sum + num;	// 양수이면 합 구한다.
		}
		System.out.println("양수 합 : " + sum);
		scan.close();
	}

}
