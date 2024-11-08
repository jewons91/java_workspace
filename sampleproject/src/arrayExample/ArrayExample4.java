package arrayExample;

public class ArrayExample4 {

	public static void main(String[] args) {
		String[] fruits = {"사과","귤","포도","복숭아","참외"};
		int temp = 0;
		
		for(int i=0; i<fruits.length; i++) {
			if(fruits[i].equals("귤")) {
				temp = i;
			}
		}
		System.out.println(fruits[temp]);		
	}

}
