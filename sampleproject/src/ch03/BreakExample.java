package ch03;

import java.util.Scanner;

public class BreakExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String text = null;	// 레퍼런스 변수 , object , 지금은 없다(null:참조 주소 없다.)
		
//		exit 입력하기 전까지는 계속 반복하겠다
		System.out.println("exit를 입력하면 종료합니다.");
		
		while(true) {
			System.out.print(">>");
//			text = scan.next();	// 한 단어씩 입력할 때는 next()만 하면 된다.
			text = scan.nextLine();	// 한줄 전체를 입력하겠다.
			if(text.equals("exit")) {
				break;
			}else {
				System.out.println("입력한 문자열 : " + text);
			}
		}
		System.out.println("종료");
		scan.close();
	}

}
