package arrayExample;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayExample6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String week = "월화수목금토일";
		char[] day = null;
		int number = 0;
		
		day = week.toCharArray();	
		
		while(true) {
			System.out.print("0 ~ 6 사이 숫자 입력 : ");
			try {
				number = scanner.nextInt();
				if(number >= 0 && number <= 6) {
					System.out.println(day[number] + "요일");
					break;
				}else {
					System.out.println("잘못 입력하셨습니다.");
				}
			}catch (InputMismatchException e) {
				System.out.println("잘못 입력하셨습니다.");
				scanner.next();
			}
			
		}
		scanner.close();
	}

}
