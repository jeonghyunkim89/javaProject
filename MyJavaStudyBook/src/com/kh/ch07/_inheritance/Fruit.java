package com.kh.ch07._inheritance;

public class Fruit {
	
	private String name;	 // 이름
	private int price;	// 가격
	
	// 기본생성자 / 모든 필드를 매개변수로 가지는 생성자
	public Fruit() {}
	public Fruit(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	// private 필드의 getter/setter 메소드
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	// toString() 메소드 : Object 클래스의 정의된 메소드
	@Override
	   public String toString() {
	      return "이름 : " + name + ", 가격 : " + price;
	   }
}
