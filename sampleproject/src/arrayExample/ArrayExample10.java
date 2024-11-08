package arrayExample;

import java.util.Scanner;

public class ArrayExample10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String personalID = null;
		char[] duplicatedID = null;
		
		System.out.print("주민등록번호(-포함) : ");
		personalID = scanner.next();
		duplicatedID = personalID.toCharArray();
		
		for(int i=8; i<duplicatedID.length; i++) {
			duplicatedID[i] = '*';
		}
		
		System.out.println(duplicatedID);	
		
		scanner.close();
	}

}
