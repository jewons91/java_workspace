package ch04.main;
import ch04.lib.Circle;	// 위치 지정

public class CircleTest {

	public static void main(String[] args) {
//		pizza 처리
		Circle pizza = new Circle(10, "피자");
//		면적 구하고 출력
		System.out.println(pizza.getName()
						 + "의 면적은 "
						 + pizza.getArea());
//		donut 처리
		Circle donut = new Circle();
//		면적 출력
		System.out.println(donut.getName()
						 + "의 면적은 "
						 + donut.getArea());
	}

}
