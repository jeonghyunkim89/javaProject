package com.kh.practice.snack.model.vo;

public class Snack {
	
	//필드부(변수)
	private String kind;	//종류
	private String name;	//이름
	private String flavor;	//맛
	private int numOf;		//개수
	private int price;		//가격

	//생성자부(2개)
	public Snack() {}	//기본생성자
	public Snack(String kind, String name, String flavor, int numOf, int price) {
		this.kind = kind;
		this.name = name;
		this.flavor = flavor;
		this.numOf = numOf;
		this.price = price;
	} //생성자(매개변수)
	
	//메소드부
	public String information() {
		//빵(케이크 - 블루베리) 1개 15000원
		//{종류}({이름}-{맛}){개수}개 {가격}원" 형식으로 저장된 정보를 반환
		return kind+ "(" +name+ " - " +flavor+ ") " +numOf+ "개 " +price+ "원";
		//[참고] String.format("출력할형식", 변수/값들,....) : String
		//return String.format("%s(%s - %s) %d개 %d원",  kind, name, flavor, numOf, price);
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public int getNumOf() {
		return numOf;
	}

	public void setNumOf(int numOf) {
		this.numOf = numOf;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	

}
