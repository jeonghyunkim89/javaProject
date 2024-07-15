package com.kh.practice.list.library.controller;

//데이터(Model)용 클래스 --> 데이터를 담기 위한 그릇 역할

//정렬 기능 추가를 위한 Comparable 인터페이스 구현(상속)
public class Book implements Comparable<Book>{
	
	private String title;
	private String author;
	private String category;
	private int price;
	
	public Book() {}
	public Book(String title, String author, String category, int price) {
		this.title = title;
		this.author = author;
		this.category = category;
		this.price = price;
	}
	public String getTitle() {
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
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String toString() {
		return "\t("+title+"/"+author+"/"+category+"/"+price+")";
		//String.format("\t(%s%s%s%d)", title, author, category, price);
	}
	
	public int hashCode() {
		return super.hashCode();
	}
	
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
	// => Comparable 인터페이스 메소드
	public int compareTo(Book o) {
		/*정렬 기준에 대하여 작성
		 * --> 도서명(String)오름차순
		 * 
		 * *String 의 경우 compareTo 메소드가 재정의 되어 있음
		 * => 반환 값에 따라 정렬 순서가 정해짐
		 * 	- 0 : 동일한 문자열
		 * 	- 음수 : A.compareTo(B) --> A B 순서로 정렬
		 * 	- 양수 : A.compareTo(B) --> B A 순서로 정렬
		*/
		
		return this.title.compareTo(o.title);
	}
}
