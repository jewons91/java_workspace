package ch04.lib;

public class Circle {
//	변수 선언
	private int radius;
	private String name;
	
//	생성자 선언 : 멤버변수 초기화, 2개 선언(2가지 방식으로 new 할 수 있다)
//	default 생성자 : 파라미터가 없는 놈, 대입값이 없다.
	public Circle() {
		this.radius = 1;
		this.name = "";	//String 에서 ""는 null을 의미한다.
	}
	
	public Circle(int radius) {
		this.radius = radius;
	}
//	이름은 동일하고 파라미터가 상이하게 메소드 선언하는 방식 : 메소드 오버로딩
	public Circle(int radius, String name) {
		this.radius = radius;
		this.name = name;
	}
	
//	메소드 선언
	public double getArea() {
		return 3.14 * this.radius * this.radius;
	}
	
//	String name 가져오는(get) 메소드
	public String getName() {
		return this.name;
	}
}
