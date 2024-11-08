package ch03;

public class ForSample {

	public static void main(String[] args) {
//		변수 선언 => 합 저장 변수
		int hap = 0;
		
//		반복문을 이용해서 합을 구하기
		for(int i=1;i<=10;i++) {
//			1~10까지 합 구한다.
			hap = hap + i;	// hap += i;
		}
		
//		합출력
		System.out.println("1부터 10까지 합 : " + hap);
	}

}
