package com.kh.practice;

public class Student {
	private int no;		//학번
	private String name;//이름
	private int age;	//나이
	private char gender;//성별
	
	public Student(String name) {
		//이름을 저장할 name 변수에 전달된 값(name)을 대입(초기화)
		this.name = name;
	}
	
	public Student() {}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//정보 조회
	public void inform() {
		System.out.println("["+no+"]"+name+","+age+","+gender);
	}
	
}
