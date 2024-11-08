package ch04.main;

import java.util.Scanner;

import ch04.lib.Rectangle;

public class RectApp {

	public static void main(String[] args) {
//		Rectangle object(저장공간) 생성
		Rectangle rect = new Rectangle();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("너비와 높이 입력 : ");
		rect.width = scan.nextInt();
		rect.height = scan.nextInt();	// try 해야 한다.
		
		System.out.println("사각형의 면적 : " + rect.getArea());
		scan.close();
	}

}
