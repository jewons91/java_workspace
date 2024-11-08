package ch05.lib;

public class ColorPoint extends Point{	// Point class 상속 받겠다
	private String color;
	
//	생성자
	public ColorPoint() {
//		super();	// 명시안하면 컴파일러가 디폴트 생성자 추가
		System.out.println("ColorPoint class 생성자 호출");
	}
	
//	x, y, color 초기화하는 생성자 선언
	public ColorPoint(int x, int y, String color) {
		super(x,y);
		this.color = color;
	}
	
//	생성자가 없다 => 컴파일러가 디폴트 생성자 추가해 준다
//	생성자가 없다 => 생성시 초기화하지 않겠다 => set 메소드 필요
	public void setColor(String color) {
		this.color = color;
		return; // 컴파일러가 추가
//		return value; => return; => 값이 없다.
//		return : 반환, 메소드 종료 기능
	}
	
//	화면 출력 : 좌표값(Point -> showPoint()) 출력, 칼라출력
	public void showColorPoint() {
		super.showPoint();	// Point(상위->슈퍼 클래스) method 가져다 쓴다.
		System.out.println(this.color);
	}
}
