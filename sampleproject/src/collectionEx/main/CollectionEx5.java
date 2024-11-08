package collectionEx.main;

import java.util.ArrayList;
import java.util.Scanner;

import collectionEx.lib.StudentEx5;

public class CollectionEx5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<StudentEx5> students = new ArrayList<>();
		double sum = 0;
		System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요.");
		
		while(students.size() < 4) {
			StudentEx5.addStudent(students,scanner);
		}
		for(StudentEx5 i : students) {
			System.out.println(i);
			sum += i.getGrade();
		}
		System.out.print("학점 평균 : " + (sum / students.size()));
	}

}
