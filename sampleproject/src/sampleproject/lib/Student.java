package sampleproject.lib;

public class Student {
	private String hakbeon;
	private String name;
	private String hakgwa;
	
	public Student(String hakbeon, String name, String hakgwa) {
		this.hakbeon = hakbeon;
		this.name = name;
		this.hakgwa = hakgwa;
	}
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
	@Override
	public String toString() {
		return "Student [hakbeon=" + hakbeon + ", name=" + name + ", hakgwa=" + hakgwa + "]";
	}
	
	
}
