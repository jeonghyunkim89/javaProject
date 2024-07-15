package com.kh.ch12_IO;

import java.io.Serializable;

// IO에서 사용될 객체 --> 직렬화 작업 (Serializable 인터페이스 구현)
public class Product implements Serializable {
	private String name;
	private int price;
	
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}

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
}
