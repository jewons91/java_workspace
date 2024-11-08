package ch07.main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

import ch07.lib.Student;

public class StudentHM {

//	메뉴 화면에 출력하는 메소드 선언
	private static void printMenu() {
		System.out.println("**** 학생관리 APP ****");
		System.out.println("1 : 학생 추가");
		System.out.println("2 : 학생 목록");
		System.out.println("3 : 종료");
		System.out.print("메뉴 선택 : ");
	}
	
//	학생 추가 메소드
	private static void addStudent(HashMap<String,Student> students, Scanner scan) {
		System.out.println("====================");
		System.out.println("===== 학생 추가 ======");
		System.out.println("====================");
		System.out.print("학번 입력 : ");
		String hakbeon = scan.next();
		System.out.print("이름 입력 : ");
		String name = scan.next();
		System.out.print("학과 입력 : ");
		String hakgwa = scan.next();
		
//		Student objec 생성
		Student student = new Student(hakbeon, name, hakgwa);
		
//		HM 추가
		students.put(hakbeon, student);
		System.out.println("===== 학생 추가 완료 =====");
		System.out.println(student.toString());
	}
	
//	화면 출력 메소드
	private static void printStudents(HashMap<String, Student> students) {
		Iterator<String> it = students.keySet().iterator();
		while(it.hasNext()) {
			System.out.println(students.get(it.next()));
		}
	}
	
	public static void main(String[] args) {
		HashMap<String,Student> students = new HashMap<>();
		Scanner scan = new Scanner(System.in);
		while(true) {
			printMenu();	// 메뉴 출력
			String select = scan.next();
			switch(select) {
			case "1" :
				System.out.println("학생추가 화면");
//				학생추가 메소드 호출
				addStudent(students,scan);
				break;
			case "2" :
				System.out.println("학생목록 화면");
//				학생 목록 화면 출력 메소드 호출
				printStudents(students);
				break;
			case "3" :
				System.out.println("프로그램 종료");
				break;
			default :
				System.out.println("잘못 입력 : 1~3 사이 입력");
			}
			if(select.equals("3")) {
				break;	// while 종료하는 break
			}
		}
		scan.close();
	}

}
