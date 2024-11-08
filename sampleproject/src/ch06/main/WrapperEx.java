package ch06.main;

public class WrapperEx {

	public static void main(String[] args) {
//		Character 사용 코드
		System.out.println(Character.toLowerCase('A'));	// 대문자 -> 소문자 변환
		char c1 = '4';
		char c2 = 'F';
		if(Character.isDigit(c1)) {	// true
			System.out.println(c1 + "는 숫자형식 문자다");
		}
		
		if(Character.isAlphabetic(c2)) {
			System.out.println(c2 + "는 영문자다");
		}
		
//		Integer 사용
		try {
			System.out.println(Integer.parseInt("a111"));	// Exception 발생
			System.out.println(Integer.parseInt("28"));		// 정상 처리
		}catch(NumberFormatException e) {
			System.out.println("숫자 형식이 아니다.");
		}
		
		System.out.println(Integer.toString(28));	// 사용 안함
		System.out.println(28);		// 사용함
//		println(Integer.valueOf(28)) => Integer object
//		println(object.toString())
		
		Integer a = Integer.valueOf(28);	// Integer object 생성
		System.out.println(a.doubleValue());	// int => double 변경
		System.out.println((double)28);	// 사용함
		
//		Boolean 사용
		boolean b = 4 > 3;
		System.out.println(Boolean.toString(b));
		System.out.println(b);	// 사용함 , 자동 박싱
		
		System.out.println(Boolean.parseBoolean("false"));
		System.out.println(false);	// boolean literal
		System.out.println("false");
	}

}
