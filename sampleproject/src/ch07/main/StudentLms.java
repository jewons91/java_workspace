package ch07.main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import ch07.lib.Student;

public class StudentLms {

	public static void main(String[] args) {		
//		학생정보를 저장하는 HM 생성, 키보드입력
		HashMap<String, Student> students = new HashMap<>();
		Scanner scan = new Scanner(System.in);
		
//		1. 학생정보 키보드 입력 => Student object => HM 저장
//		1.1 키보드 입력
		System.out.print("학번 입력 : ");
		String hakbeon = scan.next();	// 학번 저장
		System.out.print("이름 입력 : ");
		String name = scan.next();	// 이름 저장
		System.out.print("학과 입력 : ");
		String hakgwa = scan.next();	// 학과 저장
		
//		1.2 Student object new
		Student student = new Student(hakbeon, name, hakgwa);
		
//		1.3 HM put
		students.put(hakbeon, student);
		
//		2. 학생정보 출력 => 반복(Method)
//		HM 반복 X => Set<key> => Iterator 변환 => 순차적 반복
//		2.1 key 를 Set 추출
//		Set<String> keys = students.keySet();
////		2.2 Set => Iterator 추출
//		Iterator<String> it = keys.iterator();
		
		Iterator<String> it = students.keySet().iterator();
		while(it.hasNext()) {
//			it.next() => key => get(key) => Student object(value) => toString()
//			System.out.println(students.get(it.next()));	// it.next() => 
			String key = it.next();
			Student stu = students.get(key);
			System.out.println(stu.toString());
		}
		scan.close();
	}

}
