package com.kh.practice.book.model.vo;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;

//직렬화 적용(Serializable 구현) : 객체 내의 데이터를 바이트단위로 쪼개기 위한 명시적인 선언
public class Book implements Serializable {
	
	private String title; //도서명
	private String author; //저자
	private int price; //가격
	private Calendar date; //출판날짜
	private double discount; //할인율
	
	public Book() {
		super();
	}
	public Book(String title, String author, int price, Calendar date, double discount) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.date = date;
		this.discount = discount;
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Calendar getDate() {
		return date;
	}
	public void setDate(Calendar date) {
		this.date = date;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	@Override
	public String toString() {
		//출판날짜 형식지정(yyyy년 mm월 dd일)
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		String formatDate = sdf.format(date.getTime()); // getTime() ==> Calendar --> Date변환
		
		return String.format("%s\t%s\t%d\t%s\t%.1f", title,author, price, formatDate, discount);
	}

}
