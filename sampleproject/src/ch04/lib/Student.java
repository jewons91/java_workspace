package ch04.lib;

public class Student {
//	반, 이름, 학점 멤버(this로 접근)변수(object에 생성되는 변수)
	private static int ban = 1;
	private String name = null;
	private String hakbun = null;
	
//	이름과 학번 초기화하는 생성자 선언
	public Student(String name, String hakbun) {
//		object에 있는 name에 파라미터에서 들어오는 name 값을 대입
		this.name = name;
		this.hakbun = hakbun;
	}
	
	public void printBan() {
		System.out.println("반 : " + Student.ban);
	}
	
	public void printName() {
		System.out.println("학생 이름 : " + this.name);
	}
	
	public void printHakbun() {
		System.out.println("학번 : " + this.hakbun);
	}
	
	public void printStudent() {
		printBan();
		printName();
		printHakbun();
	}
	
	public void setBan(int ban) {
		Student.ban = ban;
	}
}
