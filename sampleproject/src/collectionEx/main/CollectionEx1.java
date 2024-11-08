package collectionEx.main;

import java.util.Scanner;
import java.util.Vector;

import collectionEx.lib.TryCatch;

public class CollectionEx1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Vector<Integer> numbers = new Vector<>();
		int max = 0;
		int number = 0;
		
		System.out.print("정수(-1 이 입력될 때까지)>> ");
		do {
			number = TryCatch.InputMismatchInt(scanner);
			if(number > 0) {
				numbers.add(number);
			}
		}while(number != -1);
		for(int i : numbers) {
			if(max < i) {
				max = i;
			}
		}
		System.out.println("가장 큰 수는 " + max);
		scanner.close();
	}

}
