package com.kh.example.practice3.model.vo;

public class Circle {

	//변수부
	private static final double PI = 3.14; // 원주율 - PI : double = 3.14
	private static int radius = 1;		   // 반지름 - radius : int = 1
	/* 예를들어 초기화 블록을 넣을 시
	 * {
	 * 
	 *  }
	 *  
	 *  or
	 *  
	 *  static{
	 *  
	 *  }
	 */
	
	
	//생성자부
	//+Circle()
	public Circle() {}
	
	//메소드부
	//radius 변수의 getter/setter (연습용)
	/*public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	*/
	
	
	//+incrementRadius() : void
	//+getAreaOfCircle() : void
	//+getSizeOfCircle() : void
	public void incrementRadius() {
		//반지름의 값을 1증가
		radius++;
	}
	public void getAreaOfCircle() {
		//원의 넓이 계산 후 출력
		//원주율 * 반지름 * 반지름
		System.out.println(PI*radius*radius);
	} 
	public void getSizeOfCircle() {
		//원의 둘레 계산 후 출력
		//2*원주율*반지름
		System.out.println("원의 둘레 : " + (2*PI*radius));
	}
}
