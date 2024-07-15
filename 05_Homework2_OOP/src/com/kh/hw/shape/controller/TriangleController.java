package com.kh.hw.shape.controller;

import com.kh.hw.shape.model.vo.*;

public class TriangleController {

	// 필드부(변수)
	private Shape s = new Shape();

	// 생성자부 : 생략! (기본생성자 있을것임)

	// 메소드부
	public double calcArea(double height, double width) {
		// 매개변수로 넘어온 값을 Shape의 매개변수 있는 생성자에 넣어
		s = new Shape(3, height, width);
		// Shape의 필드들 초기화하고 둘레 계산법을 통해 계산된 값 반환
		// 면적 계산법 (넓이) : 너비 * 높이 / 2
		return s.getWidth() * s.getHeight() / 2;

	}

	public void paintColor(String color) {
		// setter를 통해 매개변수로 넘어온 값으로 변경
		// 전달된 값(color)을 shape타입의 객체에 setter메소드를 사용하여 적용
		s.setColor(color);
	}

	public String print() {
		return "삼각형 " + s.information();
		// “삼각형” + s.information()으로 삼각형의 정보 리턴
	}

}
