package ch03;

import java.util.Scanner;

// 양수 5개를 배열에 저장 -> 그중에 최대값 찾고 출력
public class ArrayAccess {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] intArr = new int[5];	// int 배열 생성 => 규칙(인덱스) : 0 ~ 크기, 1씩 증가
		int max = 0;
		
//		양수 5개 입력 처리
		System.out.println("양수 5개를 입력하세요.");
		for (int i=0; i<intArr.length; i++) {	// 5번 반복해서 배열에 저장
			intArr[i] = scan.nextInt();
		}
//		intArr[0] = scan.nextInt();
//		intArr[1] = scan.nextInt();
//		intArr[2] = scan.nextInt();
//		intArr[3] = scan.nextInt();
//		intArr[4] = scan.nextInt();
		
//		최대값 구하기
//		if (max < intArr[0]) {
//			max = intArr[0];
//		}
//		if (max < intArr[1]) {
//			max = intArr[1];
//		}
//		if (max < intArr[2]) {
//			max = intArr[2];
//		}
//		if (max < intArr[3]) {
//			max = intArr[3];
//		}
//		if (max < intArr[4]) {
//			max = intArr[4];
//		}
		for (int i=0; i<intArr.length; i++) {	// 5번 반복 => max 값 구하기
			if (max < intArr[i]) {
				max = intArr[i];
			}
		}
		
//		화면 출력
		System.out.println("가장 큰 수는 " + max + "입니다.");
		scan.close();
	}

}
