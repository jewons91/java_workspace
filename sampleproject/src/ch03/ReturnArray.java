package ch03;

//	일차원 정수 배열 생성(개수 모른다.), 초기화 => 값 출력
public class ReturnArray {

//	일차원 정수 배열 생성 메소드, 내부처리후 int[] 반환
	static int[] makeArray(int leng) {
//		일차원 배열 생성
		int[] temp = new int[leng];	// 크기 변경 가능
		
//		값 초기화 => temp[0]=0, temo[1]=1, ...
		for(int i=0; i<leng; i++) {
			temp[i] = i;
		}
		
		return temp;
	}
	public static void main(String[] args) {
		int[] intArr = makeArray(100);	// 배열의 크기는 여기서 결정한다
//		화면에 출력
		for(int i=0; i<intArr.length; i++) {
			System.out.print(intArr[i] + " ");
		}
	}

}
