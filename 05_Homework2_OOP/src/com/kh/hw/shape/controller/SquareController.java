package com.kh.hw.shape.controller;

import com.kh.hw.shape.model.vo.Shape;

public class SquareController {
	//필드부(변수)
	private Shape s = new Shape();
	
	//생성부 생략
	
	//메소드부
	public double calcPerimeter(double height, double width) {
		// 매개변수로 넘어온 값을 Shape의 매개변수 있는 생성자에 넣어 
		// Shape의 필드들 초기화 
		// 둘레 계산법을 통해 계산된 값 반환
		// 둘레: 너비*2 + 높이*2
		s = new Shape(4, height, width);
		return (s.getHeight()*2)+(s.getWidth()*2);
	}
	public double calcArea(double height, double width) {
		// 매개변수로 넘어온 값을 Shape의 매개변수 있는 생성자에 넣어 
		// Shape의 필드들 초기화 
		s= new Shape(4, height, width);
		// 면적 계산법을 통해 계산된 값 반환
		// 면적 계산법 (넓이) : 너비 * 높이 / 2
		return s.getHeight()*s.getWidth()/2;
	}
	public void paintColor(String color) {
		// setter를 통해 매개변수로 넘어온 값으로 변경
		s.setColor(color);
	}
	public String print() {
		// “사각형” + s.information()으로 삼각형의 정보 리턴
		return "사각형 " + s.information();
	}
}
