package ch07.main;

import java.util.ArrayList;
import java.util.Iterator;

import ch07.lib.Point;

public class PointVectorEx {

	public static void main(String[] args) {
		ArrayList<Point> v = new ArrayList<>();
		
		v.add(new Point(2,3));
		v.add(new Point(-5,20));
		v.add(new Point(30,-8));
		
		for(int i=0; i<v.size(); i++) {
			Point p = v.get(i);
			System.out.println(p.toString());
		}
		
		Point p = v.remove(1);	// 1 => index value
		System.out.println(p);	// p.toString() 호출
		
		for(int i=0; i<v.size(); i++) {
			System.out.println(v.get(i));
		}
		
		Iterator<Point> it = v.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
