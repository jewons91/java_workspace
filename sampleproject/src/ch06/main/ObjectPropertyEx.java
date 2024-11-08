package ch06.main;

import ch06.lib.Point;

public class ObjectPropertyEx {

	public static void main(String[] args) {
		Point p = new Point(2,3);
		System.out.println(p.getClass());
		System.out.println(p.getClass().getName());	// class Name
		System.out.println(p.hashCode());
//		Object class toString 호출 
//		=> Object object 값을 출력, Point object 값을 출력한게 아니다.
		System.out.println(p.toString());
		System.out.println(p);
//		println(Object obj){ ==> Object obj = p;
//			print(obj.toString());
//	    }
	}

}
