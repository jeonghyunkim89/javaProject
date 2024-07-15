package com.kh.phone.model.vo;

public class PhoneBook {
	//필드 (변수/데이터)
	private String name;	//	-이름
	private String phone;	//	-연락처
	private String group;	//	-소속
	private String email;	//	-이메일
	private String memo;	//	-메모
	
	//생성자 : 객체 생성을 위한 특별한 메소드. 보통 초기화 작업을 수행.
	public PhoneBook() {}	//아무정보없이 생성만
		
	//이름, 연락처 등등의 정보를 가지고 생성
	public PhoneBook(String name, String phone, String group, String email, String memo) {
		this.name = name;
		this.phone = phone;
		this.group = group;
		this.email = email;
		this.memo = memo;
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

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMemo() {
		return memo;
	}

	//setter메소드 : 해당 필드에 전달된 값을 저장하는 작업을 수행하는 메소드
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String toString() {
			return "이름 : "+name+", 전화번호 : "+phone+", 소속 : "+group+", 이메일주소 : "+email+"메모 : "+memo;
	}
}
