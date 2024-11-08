package ch03;

//	요건 : 두 정수를 입력받아 합을 출력 <= 여러번 반복
//	메소드 코딩 절차 : 선언 => 호출(실행)
public class MethodExam {

//	메소드 선언 : 두 정수(int)를 입력 => 합(int) 반환(return)
	static int add(int a, int b) {
		int sum = 0;
		sum = a + b;
		return sum;
	}
	public static void main(String[] args) {
//		정수 4개 => 두번의 합 구하기
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;
		int result = 0;
		
		result = add(a,b);
		System.out.println("a + b = " + result);
		
		result = add(c,d);
		System.out.println("c + d = " + result);
	}

}
