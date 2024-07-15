package com.kh.chpa01_beforeVSafter.after.model.vo.Product;

public class Desktop extends Product {
	
	private boolean allInOne;
	
	public Desktop() {}
	public Desktop(String brand, String code, String name, int price, boolean allInOne) {
		super(brand, code, name, price); //부모클래스의 매개변수가 4개인 생성자
		this.allInOne = allInOne;
	}
	
	public String information() {
		return super.information() + ", allInOne = "+allInOne;
	}
	public boolean isAllInOne() {
		return allInOne;
	}
	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}

}
