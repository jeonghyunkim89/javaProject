package com.kh.chpa01_beforeVSafter.after.model.vo.Product;

public class Tv extends Product {
	
	private int inch;
	
	public Tv() {}
		
	public Tv(String brand, String code, String name, int price, int inch) {
		super(brand, code, name, price);
		this.inch = inch;
	}


	public String information() {
		return super.information()+", inch = "+inch;
	}

	public int getInch() {
		return inch;
	}

	public void setInch(int inch) {
		this.inch = inch;
	}
	
	

}
