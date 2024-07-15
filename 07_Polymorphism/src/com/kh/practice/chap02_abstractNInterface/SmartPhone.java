package com.kh.practice.chap02_abstractNInterface;


//CellPhone, TouchDisplay 인터페이스를 구현(상속)
public abstract class SmartPhone implements CellPhone, TouchDisplay{
	
	private String maker; //제조사 정보
	
	public SmartPhone() {}
	
	//추상메소드: 6개 (CellPhone - 4개, TouchDisplay - 1개, SmartPhone(본인거) - 1개
	public abstract String printInformation();
	public void setMaker(String maker) {
		this.maker = maker;
	}
	public String getMaker() {
		return maker;}

}
