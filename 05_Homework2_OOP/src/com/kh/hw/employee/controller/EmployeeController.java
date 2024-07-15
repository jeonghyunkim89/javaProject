package com.kh.hw.employee.controller;

import com.kh.hw.employee.model.vo.Employee;

public class EmployeeController {

	private Employee e = new Employee();

	public void add(int empNo, String name, char gender, String phone) {
		// 받아온 매개변수만큼 매개변수 있는 생성자를 통해 값 저장
		// => 매개변수 생성자로 객체 생성 후 e라는 변수에 할당
		e = new Employee(empNo, name, gender, phone);
	}

	public void add(int empNo, String name, char gender, String phone, String dept, int salary, double bonus) {
		e = new Employee(empNo, name, gender, phone, dept, salary, bonus);
	}

	// 각 데이터에 전달된 값을 적용(저장) - setter 메소드를 사용
	public void modify(String phone) {
		// 받아온 매개변수를 이용하여 해당 정보 수정
		e.setPhone(phone);
	}

	public void modify(int salary) {
		e.setSalary(salary);
	}

	public void modify(double bonus) {
		e.setBonus(bonus);
	}

	public Employee remove() {
		e = null;
		return e;
	}

	public String inform() {
		// 객체 e가 null이라면 null 반환, 아니라면 사원 정보 반환
		if (e == null) {
			return null;
		} else {
			//printEmployee()메소드를 사용하여 사원 정보 반환
			return e.printEmployee();
		}
	}
}
