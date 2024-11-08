package ch07.lib;

public class Student {
//	학번, 이름, 학과 저장하는 멤버변수
	private String hakbeon;
	private String name;
	private String hakgwa;
	
//	생성자
	public Student(String hakbeon, String name, String hakgwa) {
//		super(); 생략하면 컴파일러가 추가
		this.hakbeon = hakbeon;
		this.name = name;
		this.hakgwa = hakgwa;
	}
//	get / set

	public String getHakbeon() {
		return hakbeon;
	}

	public void setHakbeon(String hakbeon) {
		this.hakbeon = hakbeon;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHakgwa() {
		return hakgwa;
	}

	public void setHakgwa(String hakgwa) {
		this.hakgwa = hakgwa;
	}

//	toString
	@Override
	public String toString() {
		return "[hakbeon=" + hakbeon + ", name=" + name + ", hakgwa=" + hakgwa + "]";
	}
	
}
