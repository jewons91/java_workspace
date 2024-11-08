package collectionEx.lib;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
	public static int InputMismatchInt(Scanner scanner) {
		int number;
		while(true){
			try {
				number = scanner.nextInt();
				break;
			}catch(InputMismatchException e) {
				System.out.print("정수를 입력해주세요 >> ");
				scanner.nextLine();
			}
		}
		scanner.nextLine();
		return number;
	}
	
	public static double InputMismatchDouble(Scanner scanner) {
		double number;
		while(true){
			try {
				number = scanner.nextDouble();
				break;
			}catch(InputMismatchException e) {
				System.out.print("정수를 입력해주세요 >> ");
				scanner.nextLine();
			}
		}
		scanner.nextLine();
		return number;
	}
	
	public static double NumberFormatDouble(String string) {
		try {
			double doubleString = Double.parseDouble(string);
			return doubleString;
		}catch(NumberFormatException e) {
			return -1;
		}
	}
	
	public static int NumberFormatInt(String string) {
		try {
			int intString = Integer.parseInt(string);
			return intString;
		}catch(NumberFormatException e) {
			return -1000000000;
		}
	}
}
