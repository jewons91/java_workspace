package ch06.main;

import ch06.lib.Point;

public class EqualsEx {

	public static void main(String[] args) {
		Point a = new Point(2,3);
		Point b = new Point(2,3);
		Point c = new Point(3,4);
		
		if(a==b) {	// 주소비교 , false
			System.out.println("a==b");
		}
		if(a.equals(b)) {
			System.out.println("a하고 b하고 좌표(x,y)가 동일");
		}
		if(a.equals(c)) {
			System.out.println("a하고 c하고 좌표(x,y)가 동일");
		}
	}

}
 