package ch05.main;

import ch05.lib.ColorPoint;
import ch05.lib.Point;

public class ColorPointEx {

	public static void main(String[] args) {
//		1. 좌표(Point class) 처리 코드
		Point point = new Point();	// object 생성
//		좌표값 세팅
		point.setXY(1, 2);	// (1,2)
		
//		출력
		point.showPoint();
		
//		2. 좌표, 색(ColorPoint class) 처리 코드
		ColorPoint colorPoint = new ColorPoint();
		
//		좌표값(Point -> setXY()), 색(ColorPoint -> setColor()) 세팅
//		2.1 좌표값 세팅
		colorPoint.setXY(3, 4);
//		2.2 색 세팅
		colorPoint.setColor("Red");
		
//		출력
		colorPoint.showColorPoint();
	}

}
