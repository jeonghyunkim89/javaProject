package com.kh.practice.set.model.vo;

import com.kh.practice.set.Person;

public class Lottery {

	private String name;
	private String phone;
	
	public Lottery() {}
	public Lottery(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "SortedLottery [name=" + name + ", phone=" + phone + "]";
	}
	
	@Override
	public int hashCode() {
		String info = name + phone;
		return info.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Lottery) {
			Lottery l = (Lottery)obj;
			if(this.name.equals(l.name)&&
					this.phone.equals(l.phone)) {
				return true;
			} else {
				return false;
			} 
		}
		return false;
	}
}

