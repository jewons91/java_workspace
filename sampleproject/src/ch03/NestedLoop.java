package ch03;

public class NestedLoop {

	public static void main(String[] args) {
//		구구단 출력
//		단 반복 : 1단~9단
		for (int j=1; j<=9; j++) {
			for(int i=2; i<=9; i++) {
//				2(단:i) + "*" + 1(값:j) + "=" + 2(곱결과:i*j)
				System.out.print(i + "*" + j + "=" + i*j);
				System.out.print('\t');
			}
			System.out.println();
		}
	}

}
