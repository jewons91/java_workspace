package ch04.lib;

public class Book {
	private String title;
	private String author;
	private int cnt;	// 100권 출판
	
	public Book(String title) {
		this.title = title;
		this.author = "작자미상";
	}
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	
//	cnt => get, set method
	public int getCnt() {
		return this.cnt;
	}
	
	public void setCnt(int cnt) {
//		100까지만 된다.
		if (cnt >= 0 && cnt <= 100) {
			this.cnt = cnt;
		}else {
			System.out.println("0~100 사이 값 입력 필요");
		}
	}
}
