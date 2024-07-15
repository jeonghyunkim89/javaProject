package com.kh.example.practice7.run;

import com.kh.example.practice7.model.vo.Employee;

public class Run {

	public static void main(String[] args) {

		Employee e1 = new Employee ();
		e1.setEmpName("홍길동");
		
		Employee e2 = new Employee ();
		e2.setEmpNo(100);
		e2.setEmpName("홍길동");
		
		Employee e3 = new Employee ();
		e3.setEmpNo(100);
		e3.setEmpName("홍길동");
		e3.setDept("영업부");
		e3.setJob("과장");
		e3.setAge(25);
		e3.setGender('남');
		e3.setSalary(2500000);
		e3.setBonusPoint(0.05);
		e3.setPhone("010-1234-5678");
		
		System.out.println("직원정보) " + e3.getEmpName() + " | " + e3.getEmpNo());
	}

}
