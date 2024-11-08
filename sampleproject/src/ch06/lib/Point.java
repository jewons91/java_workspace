package ch06.lib;

public class Point {
	private int x;
	private int y;
	
	public Point(int x,int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {	// (2,3)
		return "(" + this.x + "," + this.y + ")";
	}
	
	@Override
	public boolean equals(Object obj) {
//		obj => Point object 를 접근하지 못한다. => x,y 접근 못한다.
		Point p = (Point)obj;	// Point p = Object obj error => DownCasting 한다.
//		값 비교 : x , y 비교
		if ((this.x == p.x) && (this.y == p.y)) {
			return true;
		}else {
			return false;
		}
	}
}
