package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Circle;

public class CircleController {

	private Circle c = new Circle();

	public String calcArea(int x, int y, int radius) {
		c = new Circle(x, y, radius);
		double area = Math.PI * radius * radius;
		return "면적 : "+c.toString()+" / "+area;
	}

	public String calcCircum(int x, int y, int radius) {
		c = new Circle(x, y, radius);
		double circum = Math.PI * radius * 2;
		return "둘레 : " +c.toString()+" / "+circum;
	}
}
