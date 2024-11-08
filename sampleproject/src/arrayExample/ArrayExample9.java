package arrayExample;

import java.util.Scanner;

public class ArrayExample9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] menu = {"후라이드","양념","파닭","불닭","간장"};
		String chicken = null;
		int temp = -1;
		
		System.out.print("치킨 이름을 입력하세요 : ");
		chicken = scanner.next();
		for(int i=0; i<menu.length; i++) {
			if(menu[i].equals(chicken)) {
				temp = i;
			}
		}
		
		if(temp >= 0) {
			System.out.println(chicken + "치킨 배달 가능");
		}else {
			System.out.println(chicken + "치킨은 없는 메뉴입니다.");
		}
		
		scanner.close();
	}

}
