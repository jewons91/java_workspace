package ch04.main;

import java.util.Scanner;

import ch04.lib.Book;

public class BookArray {

	public static void main(String[] args) {
//		배열 선언
		Book[] books = new Book[2];
		Scanner scan = new Scanner(System.in);
		
//		두번 반복 키보드 입력 처리
		for(int i=0; i<books.length; i++) {
			System.out.print("제목 입력 : ");
			String title = scan.nextLine();	// title 변수 저장
			System.out.print("저자 입력 : ");
			String author = scan.nextLine();
			
			books[i] = new Book(title, author);
			System.out.println();
		}	// 중단점 : break point
		
//		출력
		for(int i=0; i<books.length; i++) {
			System.out.println(books[i].getTitle()
							 + " : "
							 + books[i].getAuthor());
		}
		
		scan.close();
	}

}
