package com.kh.chpa01_beforeVSafter.before.model.vo;

public class Desktop {
	
	private String brand;
	private String code;
	private String name;
	private int price;
	private boolean allInOne;
	
	public Desktop() {}
	
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
	public boolean isAllInOne() {  //boolean getter는 is로 시작한다.
		return allInOne;
	}
	public String information() {
		return "brand = "+brand+", code = "+code+", name = "
				+name+", price = "+price;}

}
