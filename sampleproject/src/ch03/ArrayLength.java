package ch03;

import java.util.Scanner;

public class ArrayLength {

	public static void main(String[] args) {
//		변수 선언 : 배열(정수5개), 합, 평균
		Scanner scan = new Scanner(System.in);
		int[] intArr = new int[5];
		
		double sum = 0.0;
		double avg = 0.0;
		
//		키보드 입력 => 배열 저장 처리 : 5번 반복
		for(int i=0; i<intArr.length; i++) {
			intArr[i] = scan.nextInt();
		}
		
//		합 구한다 => 배열에 저장된 5개 값의 합
//		for(int i=0; i<intArr.length; i++) {
//			sum += intArr[i];	// sum += intArr[i] 동일
//		}
		for(int num:intArr) {	// for-each문은 배열에서 꺼낼때만 사용할 수 있다.
			sum += num;
		}
		
//		평균 구하기 : sum / 개수(intArr.length) => avg 대입
		avg = sum / intArr.length;
		
//		출력
		System.out.println("평균 : " + avg);
		scan.close();		
	}

}
