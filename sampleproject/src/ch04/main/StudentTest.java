package ch04.main;

import ch04.lib.Student;

public class StudentTest {

	public static void main(String[] args) {
//		첫번째 학생 공간 => object 생성 = new
		Student hong = new Student("홍길동", "202401");
//		두번째 학생 공간 => object 생성 = new
		Student kim = new Student("김수한무", "202402");
		
		hong.setBan(10);
		kim.setBan(2);
		
		hong.printStudent();
		kim.printStudent();
	}

}
