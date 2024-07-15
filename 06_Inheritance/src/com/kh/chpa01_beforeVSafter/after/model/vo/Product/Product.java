package com.kh.chpa01_beforeVSafter.after.model.vo.Product;

public class Product {
	//필드부
	private String brand;
	private String code;
	private String name;
	private int price;
	//생성자부
	//기본생성자
	public Product() {}
	//모든필드를 매개변수로 가지는 생성자
	public Product(String brand, String code, String name, int price) {
		this.brand = brand;
		this.code = code;
		this.name = name;
		this.price = price;
	}
	
	//메소드부
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
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
	
	public String information() {
		return "brand = "+brand+", code = "+code+", name = "
				+name+", price = "+price;}

}
