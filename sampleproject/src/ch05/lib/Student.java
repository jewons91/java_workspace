package ch05.lib;

public class Student extends Person{
	
	private String grade;
	private String department;
	
	public Student(String name) {
		super(name);
	}
	
//	set grade
	public void setGrade(String grade) {
		this.grade = grade;
	}
//	set department
	public void setDepartment(String deparString) {
		this.department = deparString;
	}
}
