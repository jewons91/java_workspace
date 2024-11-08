package contact.lib;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {

	public static int InputMismatch(int number, Scanner scanner) {
		while (true) {
			try {
				number = scanner.nextInt();
				scanner.nextLine();
				return number;
			} catch (InputMismatchException e) {
				System.out.print("잘못 입력하셨습니다. 다시 입력해주세요. >> ");
				scanner.nextLine();
			}
		}
	}

}
