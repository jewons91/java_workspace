package collectionEx.lib;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class LocationEx6 {
	String name;
	int latitude;
	int longitude;
	
	public LocationEx6(String name, int latitude, int longitude) {
		this.name = name;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public static void addCity(HashMap<String,LocationEx6> cities, Scanner scanner) {
		String information = scanner.nextLine();
		StringTokenizer informationToken = new StringTokenizer(information, ", ");
		if(informationToken.countTokens() == 3) {
			String name = informationToken.nextToken();
			int latitude = TryCatch.NumberFormatInt(informationToken.nextToken());
			int longitude = TryCatch.NumberFormatInt(informationToken.nextToken());
			if(latitude != -1000000000 && longitude != -1000000000) {
				LocationEx6 city = new LocationEx6(name, latitude, longitude);
				cities.put(name, city);
			}else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public static void printCity(HashMap<String,LocationEx6> cities) {
		Iterator<String> iterator = cities.keySet().iterator();
		while(iterator.hasNext()) {
			System.out.println(cities.get(iterator.next()));
		}
	}
	
	public static void searchCity(HashMap<String,LocationEx6> cities, Scanner scanner) {
		String information;
		do {
			System.out.print("도시 이름 >> ");
			information = scanner.nextLine().trim();
			if(cities.containsKey(information)) {
				System.out.println(cities.get(information));
			}else if(!information.equals("그만")) {
				System.out.println(information + "는 없습니다.");
			}
			
		}while(!information.equals("그만"));
	}
	
	

	@Override
	public String toString() {
		return this.name + " " + this.latitude + " " + this.longitude;
	}
	
}
