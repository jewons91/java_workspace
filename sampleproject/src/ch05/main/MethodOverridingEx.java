package ch05.main;

import ch05.lib.Circle;
import ch05.lib.Line;
import ch05.lib.Rect;
import ch05.lib.Shape;
import ch05.lib.Star;

public class MethodOverridingEx {

	private static void paint(Shape p) {	// Shape 받겠다
		p.draw();
//			if(p instanceof Shape) {
//				p.draw();
//			}
//			if(p instanceof Line) {
//				Line l = (Line)p;	// downcasting
//				l.draw();
//			}
//			if(p instanceof Rect) {
//				Rect r = (Rect)p;	// downcasting
//				r.draw();
//			}
//			if(p instanceof Circle) {
//				Circle c = (Circle)p;	// downcasting
//				c.draw();
//			}
//			if(p instanceof Star) {
//				Star s = (Star)p;	// downcasting
//				s.draw();
//			}
	}
	
	public static void main(String[] args) {
		Shape shape = new Line();
		paint(shape);
	}

}
