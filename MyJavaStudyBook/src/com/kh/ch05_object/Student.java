package com.kh.ch05_object;

public class Student /*extends Object*/ {
	/*
	 * 접근제한자 : 접근할 수 있는 범위를 제한하는 것
	 * public(+) > protected(#) > [default](~) > private(-)
	 * 
	 */
		
	//필드부 : [접근제한자] [예약어] 자료형 필드명;
	String name;
	int age;
	double height;
	String phone;
	String address;
	
	//생성자부 : 접근제한자 클래스명([매개변수]){}
	public Student() {}
	public Student(String name, int age, double height, String phone, String address) {
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.height = height;
		this.address = address;
	}
	
	//메소드부 : [접근제한자][예약어]반환타입 메소드명([매개변수]){}
	public String toString() {
		//반환타입 "void"가 아닐때는 반드시 return값; 부분이 있어야함.
		//		=> void : 반환값이 없음을 의미
		return "이름 : "+name+", 나이 : "+age+", 키 : "+height+", 전화번호 : "+phone+", 주소 : "
				+address;
	}
	/*
	 * [1]학생객체
	 * [2]학생정보(속성):이름/나이/키/학번/성적/전공/출결점수/연락처/주소/... 
	 *		기능(동작):말하기/등교하기/손들기/엎드리기/시험보기/청소하기/벌서기/...
	 * [3]"인적사항"프로그램을 만든다면...
	 *	-정보 : 이름/ 나이/ 키/ 연락처/ 주소
	 *	-기능 : 정보조회
	 * [4]어떤 자료형? 어떤변수명?
	 * 		String name; //이름
	 *		int age;	//나이
	 *		double height; // 키
	 *		String phone;	//연락처
	 *		String address;	//주소
	 * toString() : String //학생정보조회
	 */
			

}