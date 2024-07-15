package com.kh.example.practice4.model.vo;

public class Student {

	//변수부(필드부)
	private int grade;		//학년
	private int classroom;	//반
	private String name;	//학생이름
	private double height;	//키
	private char gender;	//성
	
	//필드 초기화
	{
		grade = 1;
		classroom = 3;
		name = "정현";
		height = 165.2;
		gender = '여';
	}
	
	//생성자부
	public Student() {}
	public Student(String name) {
		this.name = name;
		System.out.println(name);
	}
	
	//메소드부
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getClassroom() {
		return classroom;
	}
	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void information() {
		System.out.println(grade + "학년 " + classroom + "반 " + name + "입니다. " + height + "cm 이고 " + gender + "성 입니다.");
	}
}
