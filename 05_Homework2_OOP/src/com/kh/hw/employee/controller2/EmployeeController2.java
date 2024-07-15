package com.kh.hw.employee.controller2;

import com.kh.hw.employee.model.vo.Employee;

public class EmployeeController2 {

	private Employee[] arr = new Employee[1000];
	private int cnt = 0;

	public void add1(int empNo, String name, char gender, String phone) {
		arr[cnt++] = new Employee(empNo, name, gender, phone);
	}

	public void add2(int empNo, String name, char gender, String phone, String dept, int salary, double bonus) {
		arr[cnt++] = new Employee(empNo, name, gender, phone, dept, salary, bonus);
	}

	public void modify(String phone) {
		arr[cnt-1].setPhone(phone);
	}

	public void modify(int salary) {
		arr[cnt-1].setSalary(salary);
	}

	public void modify(double bonus) {
		 arr[cnt-1].setBonus(bonus);

	}

	public Employee remove() {
		return arr[cnt--] = null;
		// return arr[cnt]

	}

	public String inform() {
		String returnValue = "";

		for (int i = 0; i < cnt; i++) {
			returnValue += arr[i].printEmployee() + "\n";
		}

		return returnValue;
	}

}