package arrayExample;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayExample16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> texts = new ArrayList<String>();
		int leng = 0;
		String yesOrNo = "y";
		int lengAdd = 0;
		
		while(leng <= 0) {
			try {
				System.out.print("배열의 크기를 입력하세요 : ");
				leng = scanner.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("잘못 입력하셨습니다.");
				scanner.nextLine();
				continue;
			}
			if(leng <= 0) {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
		
		while(yesOrNo.equalsIgnoreCase("y")) {
			scanner.nextLine();
			for(int i=texts.size(); i<leng; i++) {
				System.out.print((i + 1) + " 번째 문자열 : ");
				texts.add(scanner.nextLine());
			}
			
			while(true) {
				System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
				yesOrNo = scanner.nextLine();
				if(yesOrNo.equalsIgnoreCase("y") || yesOrNo.equalsIgnoreCase("n")) {
					break;
				}else {
					System.out.println("잘못 입력하셨습니다.");
				}
			}

			if(yesOrNo.equalsIgnoreCase("n")) {
				break;
			}
			
			while(leng <= texts.size()) {
				try {
					System.out.print("더 입력하고 싶은 개수 : ");
					lengAdd = scanner.nextInt();
					leng += lengAdd;
				}catch(InputMismatchException e) {
					System.out.println("잘못 입력하셨습니다.");
					scanner.nextLine();
					continue;
				}
				if(lengAdd <= 0) {
					System.out.println("잘못 입력하셨습니다.");
				}
			}
		}
		
		System.out.println(texts);
		
		scanner.close();
	}

}
