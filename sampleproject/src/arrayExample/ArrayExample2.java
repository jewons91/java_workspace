package arrayExample;

public class ArrayExample2 {

	public static void main(String[] args) {
		int[] intArray = new int[10];
		
		for (int i=0; i<10; i++) {
			intArray[i] = 10 - i;
			System.out.print(intArray[i] + " ");
		}
		
	}

}
