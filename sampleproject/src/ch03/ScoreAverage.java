package ch03;

//	한명 학생의 1학년부터 4학년까지 1학기, 2학기 평점의 평균 출력
public class ScoreAverage {

	public static void main(String[] args) {
//		변수 선언 : 배열(4X2), 합, 평균
		double[][] scores = {
				  {3.3,3.4}	// 1학년 1학기,2학기 평점
				, {3.5,3.6}	
				, {3.7,4.0}
				, {4.1,4.2}
		};
		double sum = 0.0;
		double avg = 0.0;
		
//		합 구하기
//		학년 반복 => 행(4) 반복
		for(int year=0; year<4; year++) {
//			학기 => 열(2) 반복
			for(int term=0; term<2; term++) {
//				평점 합
				sum = sum + scores[year][term];
			}
		}
		avg = sum / (scores.length * scores[0].length);
		
		System.out.println("4년 전체 평점 평균 : " + avg);
	}

}
