package ch03;

import java.util.Scanner;

public class WhileSample {

	public static void main(String[] args) {
//		변수 : 키보드 입력, 정수, 합, 갯수, 평균
		Scanner scan = new Scanner(System.in);
		int num = 0;
		double hap = 0.0;
		int count = 0;	// 반복 횟수
		double avg = 0.0;
		
//		키보드 입력 (반복 : 입력한 정수의 값이 0이 아닐때)
		System.out.println("정수를 입력하고 끝낼려면 0을 입력");
		while ((num = scan.nextInt()) != 0) {
			hap += num;	// 합 구하기
			count++;	// 이 반복이 반복될 때마다 1씩 증가
		}
		
//		평균 구하고 출력
		avg = hap / count;
		System.out.println("평균 : " + avg);
		
		scan.close();
	}

}
