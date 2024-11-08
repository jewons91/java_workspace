package ch04.main;

import ch04.lib.Circle;

//	5개 Circle object 저장하는 배열 생성, 값 대입(0~4), 값 출력
public class ObjectArraytest {

	public static void main(String[] args) {
		// 배열생성하는 거지 Circle 생성하는 것이 아니다.
		Circle[] c = new Circle[5];	// 배열 인덱스 0~4
		
//		값 대입 (0~4)
//		c[0] = new Circle(0);
//		c[1] = new Circle(1);
//		c[2] = new Circle(2);
//		c[3] = new Circle(3);
//		c[4] = new Circle(4);
		for(int i=0; i<c.length; i++) {
			c[i] = new Circle(i);
		}
		
//		System.out.println(c[0].getArea());
//		System.out.println(c[1].getArea());
//		System.out.println(c[2].getArea());
//		System.out.println(c[3].getArea());
//		System.out.println(c[4].getArea());
		for(int i=0; i<c.length; i++) {
			System.out.println(c[i].getArea());
		}
	}

}
