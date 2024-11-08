package collectionEx.main;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionEx2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> grades = new ArrayList<>();
		String grade = null;
		int count = 0;
		double sum = 0;
		
		System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F) >> ");
		while(true) {
			grade = scanner.next();
			switch(grade) {
			case "A" :
			case "B" :
			case "C" :
			case "D" :
			case "F" :
				grades.add(grade);
			default :
				count++;
			}
			if(count == 6 && grades.size() == 6) {
				break;
			}else if(count == 6 && grades.size() != 6) {
				count = grades.size();
				System.out.print((6 - count) + "개의 학점을 잘못 입력하셨습니다.추가로 다시 입력해주세요. >> ");
			}
		}
		for(int i=0; i<grades.size(); i++) {
			switch(grades.get(i)) {
			case "A" :
				sum += 4.0;
				break;
			case "B" :
				sum += 3.0;
				break;
			case "C" :
				sum += 2.0;
				break;
			case "D" :
				sum += 1.0;
				break;
			case "F" :
				sum += 0;
			}
		}
		System.out.println(sum / count);
		scanner.close();
	}

}
