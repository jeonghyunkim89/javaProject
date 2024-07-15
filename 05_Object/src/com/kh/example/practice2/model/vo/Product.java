package com.kh.example.practice2.model.vo;

public class Product {
	
	// 변수부/필드부
	/* -pName : String
	 * -price : int
	 * -brand : String
	 */
	private String name; //제품명 (-Name : String )
	private int price;	  //가격 (-price : int)
	private String brand; //회사명/제조사 (-brand : String)	
	
	//생성자부
	//+Product()
	public Product() {}
	
	//메소드부
	// pName 변수의 getter/setter
	
	// getter메소드 : 해당 변수의 값을 조회하는 기능을 제공하는 메소드
	public String getName() { //get변수명()
		return name;
	}
	//setter메소드 : 해당 변수에 값을 저장하는 기능을 수행하는 메소드
	public void setName(String name) { //set변수명(해당변수의 자료형 변수명)
		this.name=name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	//+information() : void
	public void information() {
		// 현재 클래스의 데이터를 출력
		System.out.println("Name=" + name + ", price=" + price + ", brand=" + brand);
	}
	
}
