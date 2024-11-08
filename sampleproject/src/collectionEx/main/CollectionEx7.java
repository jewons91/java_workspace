package collectionEx.main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

import collectionEx.lib.TryCatch;

public class CollectionEx7 {

	public static void main(String[] args) {
		HashMap<String,Double> students = new HashMap<>();
		Scanner scanner = new Scanner(System.in);
		double line = 0.0;
		
		System.out.println("미래장학금관리시스템입니다.");
		while(students.size() < 5) {
			System.out.print("이름과 학점 >> ");
			String name = scanner.next();
			double grade = TryCatch.InputMismatchDouble(scanner);
			students.put(name,grade);
		}
		System.out.print("장학생 선발 학점 기준 입력 >> ");
		line = TryCatch.InputMismatchDouble(scanner);
		System.out.print("장학생 명단 : ");
		Iterator<String> iterator = students.keySet().iterator();
		while(iterator.hasNext()) {
			String temp = iterator.next();
			if(students.get(temp) >= line) {
				System.out.print(temp + " ");
			}
		}
		scanner.close();
	}

}
