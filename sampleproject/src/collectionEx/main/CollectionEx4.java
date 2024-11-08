package collectionEx.main;

import java.util.Scanner;
import java.util.Vector;

import collectionEx.lib.TryCatch;

public class CollectionEx4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Vector<Integer> precipitations = new Vector<>();
		int precipitation = 0;
		int sum = 0;
		while(true) {
			System.out.print("강수량 입력 (0 입력시 종료) >> ");
			precipitation = TryCatch.InputMismatchInt(scanner);
			if(precipitation == 0) {
				System.out.println("종료");
				break;
			}
			sum += precipitation;
			precipitations.add(precipitation);
			for(int i : precipitations) {
				System.out.print(i + " ");
			}
			System.out.println();
			System.out.println("현재 평균 " + sum / precipitations.size());
		}
		scanner.close();
		
	}

}
