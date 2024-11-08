package ch05.lib;

public class Point {
//	좌표(x,y 저장) 처리하는 클래스
	private int x;
	private int y;
	
//	디폴트 생성자
	public Point() {	// 파라미터 없다 <= 디폴트 생성자
		System.out.println("Point class 생성자 실행");
	}
//	int x, int y 받아서 초기화하는 생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
//	x, y 값 세팅 메소드
	public void setXY(int x, int y) {	// 변경
		this.x = x;	// 멤버 변수 x에 들어오는 값(x) 을 대입
		this.y = y;
	}
	
//	x, y 좌표값 출력 메소드 => "(" + x + "," + y + ")" => (x,y)
	public void showPoint() {	// showColorPoint(this, super) 추가
		System.out.println("(" + this.x + "," + this.y + ")");	// => (x,y)
	}
}
