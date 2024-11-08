package ch03;

public class ForEachEx {

	public static void main(String[] args) {
//		변수 선언 : 배열, 합
//		int[] numbers = new int[5];
//		numbers[0] = 1;
//		numbers[1] = 2;
//		numbers[2] = 3;
//		numbers[3] = 4;
//		numbers[4] = 5;
		int[] numbers = {1,2,3,4,5};
		int sum = 0;
		
//		배열에서 하나씩 꺼내서 합 구하기
		for(int number:numbers) {
			System.out.print(number + " ");	// 1공백2공백3공백4공백5공백
			sum += number;	// 누적
		}
		
		System.out.println("합은 " + sum);
	}

}
