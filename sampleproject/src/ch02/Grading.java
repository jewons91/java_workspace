package ch02;

import java.util.Scanner;

public class Grading {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	// 요놈으로 키보드 입력 처리
		int score = 0;	// 입력된 점수를 저장하는 정수 변수
		char grade = ' ';
		
		System.out.print("점수 입력 : ");	// 타이틀 출력
		score = scan.nextInt();	// "89" => int 로 변환 => 89
//		등급 구하기
		if(score >= 90) {
			grade = 'A';
		}else if(score >= 80) {
			grade = 'B';
		}else if(score >= 70) {
			grade = 'C';
		}else if(score >= 60) {
			grade = 'D';
		}else {	// score < 60 내포되어 있다.
			grade = 'F';
		}
		
//		화면 출력
//		println 메소드는 한문자열 출력한다
		System.out.println("학점은 " + grade + "입니다");
		scan.close();
	}

}
