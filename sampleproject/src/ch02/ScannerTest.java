package ch02;

import java.util.Scanner;

// 요건 : 키보드로 이름(문자열) 도시(문자열) 나이(정수:int) 입력 => 화면 출력
public class ScannerTest {

	public static void main(String[] args) {
//		1. 변수선언 => 키보드 처리 : Scanner object 생성, 이름, 도시, 나이
//		1.1 키보드 처리
		Scanner scanner = new Scanner(System.in); // new 뒤의 Scanner : 생성자 - 생성하는 방법
//		1.2 이름 저장 변수 선언만 한 것이다.
		String name = null;
//		1.3 도시 저장 변수 선언만 한 것이다.
		String city = null;
//		1.4 나이 저장 변수 선언만 한 것이다.
		int age = 0;		
		
//		2. 키보드입력 처리 => 변수저장 처리
		name = scanner.next(); // kim , next() => 문자열로 반환해서 받음
		city = scanner.next(); // seoul
		age = scanner.nextInt(); // "20" => 20 정수로 변환 필요
		
//		3. 변수 => 화면출력
		System.out.println("입력한 이름 : " + name);
		System.out.println("입력한 도시 : " + city);
		System.out.println("입력한 나이 : " + age);
		
		scanner.close();
	} // main end

} // class end
