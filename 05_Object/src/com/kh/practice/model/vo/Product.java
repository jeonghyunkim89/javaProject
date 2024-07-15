package com.kh.practice.model.vo;

public class Product {
	
	//필드부(변수부) - 데이터를 담을 공간
	private String name;	//제품명(이름)
	private int price;		//가격
	private String brand;	//브랜드명
	
	// 생성자부
	// 기본생성자
	public Product() {}
	//모든필드(변수)를 매개변수로 갖는 생성자(매개변수 3개인 생성자)
	public Product(String name, int price, String brand) {
		this.name = name;
		this.price = price;
		this.brand = brand;
	}
	//메소드부
	// getter/setter : private 으로 선언된 변수에 접근할 수 있도록 하는 메소드
	// name변수의 getter : name변수에 저장된 값을 반환(리턴)
	public String getName() {
		return name;
	}
	// name변수의 setter : 전달된 값을 name변수에 저장
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void information() {
		//필드(변수)들의 정보를 출력
		System.out.println("제품명:"+name+", 가격:"+price+", 브랜드:"+brand);
	}
}
