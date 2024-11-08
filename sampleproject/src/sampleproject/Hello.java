package sampleproject;

public class Hello {
// 한줄주석 단축키 : ctrl + /
//	1. 실행 : java hello.class
//		1.1 : jvm 실행된다.
//		1.2 : jvm 클래스파일을 로딩한다.
//		1.3 : jvm 한줄씩 번역해(기계어) 실행 진행
//			1.3.1 : public class Hello { 코드실행
//				1.3.1.1 : 메모리상 클래스 영역 생성
//				1.3.1.2 : jvm => main 메소드 호출, 그 안에 코드를 한줄씩(;) 실행한다.
//					1.3.1.2.1 : { (여는 중괄호) => 영역 생성
//				1.3.1.3 : main()에도 } (닫는 중괄호) => 영역 삭제
//			1.3.2 : } 코드 실행
//				1.3.1.2 : 닫는 중괄호 => 생성된 영역 삭제
//		1.4 : 더이상 실행할 수 있는 코드, 영역 없다
//			1.4.1 : 프로그램 실행이 종료된다.
	public static void main(String[] args){ // void 리턴값이 없다. // static : 실행가능하게 만든다
		int i = 20; // 정수 저장 공간(i이름) 생성, 20이라는 정수값을 대입했다
		System.out.println(i); // i라는 공간에 있는 값을 화면에 출력
//		문자 저장(문자데이터 타입 : char)
		char ch_a = '?';
		System.out.println(ch_a);
	} // main end => 프로그램 종료된다.
}
