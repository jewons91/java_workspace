package collectionEx.main;

import java.util.Scanner;
import java.util.Vector;

import collectionEx.lib.NationEx9;
import collectionEx.lib.TryCatch;

public class CollectionEx9 {

	public static void main(String[] args) {
		Vector<NationEx9> nations = new Vector<>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("** 수도 맞추기 게임을 시작합니다. **");
		while(true) {
			System.out.print("입력:1, 퀴즈:2, 종료:3>> ");
			int menu = TryCatch.InputMismatchInt(scanner);
			switch (menu){
			case 1 :
				System.out.println("현재 " + nations.size() + "개 나라와 수도가 입력되어 있습니다.");
				NationEx9.nationInput(nations, scanner);
				break;
			case 2 :
				NationEx9.nationQuiz(nations, scanner);
				break;
			case 3 :
				System.out.println("게임을 종료합니다.");
			}
			if(menu == 3) {
				break;
			}
		}
	}

}
