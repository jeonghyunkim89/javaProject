package com.kh.practice.chap01_poly.mode.vo;

public class CookBook extends Book {
	
	//private String title;		//도서명
	//private String author;	//저자명
	//private String publisher;	//출판사명
	private boolean coupon;		//요리학원쿠폰유무
	
	public CookBook() {
		//super();생략되어있다.
	}
	public CookBook(String title, String author, String publisher, boolean coupon) {
		super(title, author, publisher);
		//this.title = title;
		//this.author = author;
		//this.publisher = publisher;
		this.coupon = coupon;
	}
	
	public String toString() {
		return "CookBook ["+super.toString()+", coupon="+coupon+"]";
		//"title="+title+", author="+author+", publisher="+publisher
	}
	/*
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
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}*/
	public boolean isCoupon() {
		return coupon;
	}
	public void setCoupon(boolean coupon) {
		this.coupon = coupon;
	}

}
