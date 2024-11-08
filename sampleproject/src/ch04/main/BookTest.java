package ch04.main;

import ch04.lib.Book;

public class BookTest {

	public static void main(String[] args) {
//		어린왕자 object 생성
		Book littlePrince = new Book("어린왕자", "페리");
		littlePrince.setCnt(100);
		System.out.println(littlePrince.getTitle() + " "
						 + littlePrince.getAuthor() + " "
						 + littlePrince.getCnt() + "권");
//		저자 변경
		littlePrince.setAuthor("파리");
		System.out.println(littlePrince.getTitle() + " "
				+ littlePrince.getAuthor());
		
//		춘향전 object 생성 => 저자 모른다.
		Book loveStory = new Book("춘항전");
		System.out.println(loveStory.getTitle() + " "
						 + loveStory.getAuthor());
	}

}
