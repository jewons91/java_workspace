package collectionEx.main;

import java.util.HashMap;
import java.util.Scanner;

import collectionEx.lib.LocationEx6;

public class CollectionEx6 {

	public static void main(String[] args) {
		HashMap<String,LocationEx6> cities = new HashMap<>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("도시, 경도, 위도를 입력하세요");
		while(cities.size() < 4) {
			LocationEx6.addCity(cities,scanner);
		}
		System.out.println("\n--------------------\n");
		LocationEx6.printCity(cities);
		System.out.println("\n--------------------\n");
		LocationEx6.searchCity(cities, scanner);
		
	}

}
