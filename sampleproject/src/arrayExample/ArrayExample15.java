package arrayExample;

import java.util.Scanner;

public class ArrayExample15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String text = null;
		char[] textChar = null;
		int count = 0;
		
		System.out.print("문자열 : ");
		text = scanner.nextLine();
		textChar = text.toCharArray();
		
		System.out.print("문자열에 있는 문자 : ");
		for(int i=0; i<textChar.length; i++) {
			for(int j=0; j<=i; j++) {
				if(j == i) {
					System.out.print(textChar[i] + " ");
					count++;					
				}else if(textChar[i] == textChar[j]) {
					break;
				}
			}
		}
		System.out.println();
		System.out.print("문자 개수 : " + count);
		
		scanner.close();
	}

}
