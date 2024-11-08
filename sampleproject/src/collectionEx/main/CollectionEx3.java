package collectionEx.main;

import java.util.HashMap;
import java.util.Scanner;

public class CollectionEx3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String,String> country = new HashMap<>();
		String information = null;
		
		System.out.println("나라 이름과 인구를 입력하세요.(예: Korea 5000)");
		
		while(true) {
			System.out.print("나라 이름, 인구 >> ");
			information = scanner.next();
			if(information.equals("그만")) {
				break;
			}
			String name = information;
			information = scanner.next();
			String population = information;
			country.put(name, population);
		}
		while(true) {
			System.out.print("인구 검색 >> ");
			information = scanner.next();
			if(information.equals("그만")){
				break;
			}else if(country.containsKey(information)) {
				System.out.println(information + "의 인구는 " + country.get(information));
			}else {
				System.out.println(information + " 나라는 없습니다.");
			}
		}
		scanner.close();
	}
}


