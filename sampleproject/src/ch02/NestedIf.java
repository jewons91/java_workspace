package ch02;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int year = 1;	// 1 ~ 4
		int score = 0;	// 0 ~ 100
		
//		키보드 입력 처리
		System.out.print("학년 입력 : ");
		year = scan.nextInt();
		System.out.print("점수 입력 : ");
		score = scan.nextInt();
		
//		조건 처리
		if(score >= 60) {
//			합격
			if(year != 4) {	// 1~3학년 이라는 뜻
//				학년 : 1~3, 점수 >= 60 상태다
				System.out.println("합격");
			}else if(score >= 70) {
//				학년 : 4학년, 점수 >= 70 상태
				System.out.println("합격");
			}else {
//				학년 : 4학년, 점수 < 70 상태
				System.out.println("불합격");
			}
		}else {
//			불합격
			System.out.println("불합격");
		}
		
		scan.close();
	}

}
