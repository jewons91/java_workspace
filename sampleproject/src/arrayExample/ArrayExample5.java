package arrayExample;

import java.util.Scanner;

public class ArrayExample5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String text = null;
		char[] alphabet = null;
		String search = null;
		int count = 0;
		
		System.out.print("문자열 : ");
		text = scanner.nextLine();
		
		alphabet = text.toCharArray();
		
		do {
			System.out.print("검색할 문자 : ");
			search = scanner.nextLine();
			if(search.length() != 1) {
				System.out.println("검색할 문자 하나(띄어쓰기도 문자 취급)만 입력해주세요.");
			}
		} while (search.length() != 1);
		
		System.out.print(text + "에 " + search + "가 존재하는 위치(인덱스) : ");
		for (int i=0; i<alphabet.length; i++) {
			if(alphabet[i] == search.charAt(0)) {
				System.out.print(i + " ");
				count++;
			}
			
		}
		if (count == 0) {
			System.out.print("없음");
		}
		System.out.println();
		System.out.print(search + " 개수 : " + count);
		scanner.close();
	}

}
