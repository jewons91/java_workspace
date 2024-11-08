package ch07.main;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList<String> arrList = new ArrayList<>();	// 이름 저장
		Scanner scan = new Scanner(System.in);	// 키보드 처리
		
		for(int i=0; i<4; i++) {
			System.out.print("이름 입력 : ");
			String name = scan.next();
			arrList.add(name);
		}
		
		for(int i=0; i<arrList.size(); i++) {
			String name = arrList.get(i);
			System.out.println(name);
		}
		
//		긴 이름을 가진 인덱스(int) 찾기
		int longestIndex = 0;
		
		for(int i=1; i<arrList.size(); i++) {
			if(arrList.get(longestIndex).length()
					< arrList.get(i).length()) {
				longestIndex = i;
			}
		}
		System.out.println("가장 긴 이름 : "
						 + arrList.get(longestIndex));
		scan.close();
	}

}
