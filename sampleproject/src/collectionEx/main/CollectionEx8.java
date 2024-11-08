package collectionEx.main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

import collectionEx.lib.TryCatch;

public class CollectionEx8 {

	public static void main(String[] args) {
		HashMap<String,Integer> clients = new HashMap<>();
		Scanner scanner = new Scanner(System.in);
		
		String information;
		do {
			System.out.print("이름과 포인트 입력 >> ");
			information = scanner.nextLine();
			StringTokenizer informationToken = new StringTokenizer(information);
			if(informationToken.countTokens() == 2) {
				String name = informationToken.nextToken();
				int point = TryCatch.NumberFormatInt(informationToken.nextToken());
				if(point == -1000000000) {
					System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
					continue;
				}else if(!clients.containsKey(name)){
					clients.put(name, point);
				}else {
					int temp = clients.get(name) + point;
					clients.put(name, temp);
				}
			}else if(!information.equals("그만")){
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				continue;
			}
			Iterator<String> iterator = clients.keySet().iterator();
			while(iterator.hasNext() && !information.equals("그만")) {
				String temp = iterator.next();
				System.out.print("(" + temp + "," + clients.get(temp) + ")");
			}
			System.out.println();
		}while(!information.equals("그만"));
		scanner.close();
	}

}
