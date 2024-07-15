package com.kh.hw.shape.model.vo;

public class Shape {
	//필드부(변수)
	private int type;
	private double height;
	private double width;
	private String color = "white";
	//생성부
	public Shape() {}	//기본생성자
	public Shape(int type, double height, double width) {
		//매개변수가 3개인 생성자
		this.type = type;
		this.height = height;
		this.width = width;
	}
	//메소드부
	//높이, 너비, 색깔 정보를 문자열 형태로 반환해주는 메소드
	public String information() {
		return "높이 "+height+"너비 "+width+"색깔 "+color;
	}
	//type 변수의 getter메소드
	public int getType() {
		return type;
	}
	//type 변수의 setter메소드
	public void setType(int type) {
		this.type = type;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}