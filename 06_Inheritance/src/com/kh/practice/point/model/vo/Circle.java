package com.kh.practice.point.model.vo;

public class Circle extends Point {
	
	private int radius;
	
	public Circle() {}
	
	public Circle(int x, int y, int radius) {
		super(x, y); //point(부모클래스)의 매개변수가 2개인 생성자 호출(사용)
		//setX(x);
		//setY(y);
		this.radius = radius;		
	}
	
	public String toString() {
		//"{x변수에담긴값}, {y변수에담긴값}, {radius변수에 저장된값}"
		//return getX()+", "+getY()+", "+radius;
		return super.toString()+", "+radius;}

}
