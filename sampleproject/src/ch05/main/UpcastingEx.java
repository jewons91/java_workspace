package ch05.main;

import ch05.lib.Person;
import ch05.lib.Student;

public class UpcastingEx {

	public static void main(String[] args) {
		Person p;
		Student s = new Student("이재문");
		
		p = s;	// p = (Person)s; 자동 형변환
//		p는 Person object만 참조할 수 있다. Student object는 참조 못한다.
		
//		p.setGrade("A");	// error
//		p.setDepartment("com");	// error
		
		System.out.println(p.getName());	// error X
		
		s.setGrade("A");
		s.setDepartment("com");
	}

}
