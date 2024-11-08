package ch02;

import java.util.Scanner;

public class ArithmeticOperator {

	public static void main(String[] args) {
//		정수를 키보드로 입력받아 시,분,초 구하기
//		1. 변수 선언
//		1.1 키보드처리 변수
		Scanner scan = new Scanner(System.in);
//		1.2 키보드로 입력되는 전체 초단위 시간 정수값 저장 변수
		int time = 0;
//		1.3 시간을 저장하는 변수
		int hour = 0; // 초기값에 0은 없다 의미
//		1.4 분을 저장하는 변수
		int minute = 0;
//		1.5 초를 저장하는 변수
		int second = 0;
		
//		2. 처리 : 입력 -> 시간 구하기 -> 분 구하기 -> 초 구하기
//		2.1 키보드 입력 처리 => 정수 입력 한개 => 대입
		System.out.print("초단위 정수 입력 : ");
		time = scan.nextInt(); // "4000" -> 4000 정수 변환
//		2.2 시간 구하기 => time / (60 * 60)
		hour = time / 60 / 60;
//		2.3 나머지 분 구하기 => time / 60 : 전체 분, % 60 : 나머지 분
		minute = (time / 60) % 60;
//		2.4 나머지 초 구하기
		second = time % 60;
		
//		3. 화면 출력
		System.out.println("입력한 초 : " + time);
		System.out.println("시간 : " + hour);
		System.out.println("분 : " + minute);
		System.out.println("초 : " + second);
		
//		scanner close
		scan.close();
	}

}
