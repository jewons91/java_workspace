package ch02;

// 한개의 소스파일에는 여러개의 클래스를 명시할 수 있다.
// 명시할 수 있지만 한개의 소스파일에는 한개의 클래스만 존재하게 하세요. => 코드 유지보수
// public 한 클래스의 이름이 소스파일명이 되어야 한다.

// 원의 면적을 구하고 화면에 출력 Application 개발, 실행
public class CircleArea {
	public static void main(String[] args){
		
//		1. 필요한 변수 선언
//		원면적 공식 : pi * r^2 => result 결과 출력
//		변수(저장공간생성) 선언
		final double PI = 3.141592; // 상수
		int radius = 10;
		
		
//		2. 처리하는 코딩
//		결과저장 변수
		double result = PI * radius * radius;
		
//		3. 최종 결과 출력
//		반지름값과 면적 화면에 출력
		System.out.println("반지름 : " + radius);
		System.out.println("면적 : " + result);
	}
}