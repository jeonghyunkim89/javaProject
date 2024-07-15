package com.kh.hw.employee.model.vo;

public class Employee {
	
	private int empNo;
	private String name;
	private char gender;
	private String phone;
	private String dept;
	private int salary;
	private double bonus;
	
	public Employee() {}
	public Employee(int empNo, String name, char gender, String phone) {}
	public Employee(int empNo, String name, char gender, String phone, String dept, int salary, double bonus) {}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String printEmployee() {
		System.out.println(+empNo+"직원번호"+name+", 이름"+gender+", 성"+phone+", 전화번호"+dept+", 부서"+salary+", 급여"+bonus+", 보너스");
		return null;
	}
	

}
