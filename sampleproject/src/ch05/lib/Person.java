package ch05.lib;

public class Person {
	private String name;
	private String id;
	
//	이 생성자가 존재하므로 결국 디폴트 생성자는 없다.
	public Person(String name) {
		this.name = name;	// name 만 초기화
	}
	
//	String name만 get method : 꺼낸다
	public String getName() {
		return this.name;
	}
}
