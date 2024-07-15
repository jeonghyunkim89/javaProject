package com.kh.example.practice6.model.vo;

public class Book {
	
	//필드부(변수)
	private String title;
	private String publisher;
	private String author;
	private int price;
	private double discountRate;
	
	//생성자부(3)
	public Book() {} //기본생성자 : 초기화할 데이터 없이 객체 생성
	
	//매개변수가 3개인 생성자 : 전달된 데이터를 변수에 초기화하여 객체 생성
	public Book(String title, String publisher, String author) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
	}
	
	//매개 변수가 5개인 생성자
	public Book(String title, String publisher, String author, int price, double discountRate) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
		this.price = price;
		this.discountRate = discountRate;
	};
	
	//메소드부
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author =  author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	public void information() {
		// 정보를 출력 : 현재 클래스의 필드(변수)의 값을 출력
		System.out.println("title = " + title + ", publisher = " + publisher +
							", author = " + author + ", price = " + price +
							", discountRate = " + discountRate );
		System.out.printf("title=%s, publisher=%s, author=%s, price=%d, discountRate=%.1f\n", title, publisher, author, price, discountRate);
	}
}
