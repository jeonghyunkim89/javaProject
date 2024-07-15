package com.kh.practice.chap01_poly.mode.vo;

public class AniBook extends Book {

	//private String title;		//도서명
	//private String author;		//저자명
	//private String publisher;	//출판사명
	private int accessAge;		//제한나이
	
	public AniBook() {}
	public AniBook(String title, String author, String publisher, int accessAge) {
		super(title, author, publisher);
		//this.title = title;
		//this.author = author;
		//this.publisher = publisher;
		this.accessAge = accessAge;
	}
	
	public String toString() {
		return "AniBook ["+super.toString()+", accessAge="+accessAge+"]";
				//"title="+title+", author="+author+", publisher="+publisher;
	}
	/*public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	*/
	public int getAccessAge() {
		return accessAge;
	}
	public void setAccessAge(int accessAge) {
		this.accessAge = accessAge;
	}
	
}
