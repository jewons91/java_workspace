package collectionEx.lib;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StudentEx5 {
	private String name;
	private String department;
	private String studentNumber;
	private Double grade;
	
	
	public StudentEx5() {
	}

	public StudentEx5(String name, String department, String studentNumber, Double grade) {
		this.name = name;
		this.department = department;
		this.studentNumber = studentNumber;
		this.grade = grade;
	}
	
	public static void addStudent(ArrayList<StudentEx5> students, Scanner scanner) {
		String information = scanner.nextLine();
		StringTokenizer informationToken = new StringTokenizer(information, ", ");
		if(informationToken.countTokens() == 4) {
			String name = informationToken.nextToken();
			String department = informationToken.nextToken();
			String studentNumber = informationToken.nextToken();
			double grade = TryCatch.NumberFormatDouble(informationToken.nextToken());
			if(grade >= 0) {
				StudentEx5 student = new StudentEx5(name, department, studentNumber, grade);
				students.add(student);
			}else {
				System.out.println("잘못된 정보를 입력하셨습니다. 다시 입력해주세요.");
			}
		}else {
			System.out.println("잘못된 정보를 입력하였습니다. 다시 입력해주세요.");
		}
	}

	@Override
	public String toString() {
		return "학생 정보 [이름=" + name + ", 학과=" + department + ", 학번=" + studentNumber + ", 학점="
				+ grade + "]";
	}

	public Double getGrade() {
		return grade;
	}

	public void setGrade(Double grade) {
		this.grade = grade;
	}
	
	
	
}
