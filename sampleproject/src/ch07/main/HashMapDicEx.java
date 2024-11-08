package ch07.main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashMapDicEx {

	public static void main(String[] args) {
//		저장소 => HashMap
		HashMap<String, String> dic = new HashMap<>();
		Scanner scan = new Scanner(System.in);
		
		dic.put("baby", "아기");
		dic.put("love", "사랑");
		dic.put("apple", "사과");
		
//		전체 출력
		Set<String> keys = dic.keySet();
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			String value = dic.get(key);
			System.out.println("( " + key + "," + value + " )");	// (key,value)
		}
		
//		영어 단어 => 한글 단어 출력 3번만 반복
		for(int i=0; i<3; i++) {
			System.out.print("검색 단어 입력 : ");
			String eng = scan.next();
			String kor = dic.get(eng);	// 입력단어 dic에서 찾는다
//			있으면 kor에 한글단어가 들어갈 것이고, 없으면 null 들어간다.
			if(kor == null) {	// 검색한 단어 없다
				System.out.println(eng + " : 저장된 단어가 없다");
			}else {	// 있다 => 한글단어 출력
				System.out.println(kor);
			}
		}
		scan.close();
	}

}
