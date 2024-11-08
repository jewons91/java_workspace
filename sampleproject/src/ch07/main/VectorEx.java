package ch07.main;

import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
//		정수 값만 다루는 제네릭 벡터 생성
		Vector<Integer> v = new Vector<>();	// 초기 용량 10개 시작
//		Vector v = new Vector();
		System.out.println("초기용량 : " + v.capacity());
		System.out.println("저장된 개수 : " + v.size());
		
//		element 추가
//		v.add(5.0);	error
		v.add(5);
//		v.add("A");	error
		v.add(4);
		v.add(-1);
		
		System.out.println("용량 : " + v.capacity());		// 10씩 추가
		System.out.println("저장된 개수 : " + v.size());
		
		
		v.add(2, 100);
		
		for(int i=0; i<v.size(); i++) {
			System.out.println(v.get(i));
		}
		
//		sum
		int sum = 0;
		for(int i=0; i<v.size(); i++) {
//			int n = v.get(i);	// 자동 언박싱 처리된다 : Integer -> int
//			sum = sum + n;
			sum = sum + v.get(i);
		}
		
		System.out.println("합 : " + sum);
	}

}
