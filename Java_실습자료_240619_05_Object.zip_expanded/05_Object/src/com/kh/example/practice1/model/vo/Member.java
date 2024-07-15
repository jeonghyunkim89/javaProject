package com.kh.example.practice1.model.vo;

public class Member {

	// 변수 선언 --> 데이터
	// [접근제한자] [예약어] 자료형 변수명 [= 값];
	private String memberId;	// - memberId : String
	private String memberPwd;   // - memberPwd : String
	private String memberName;  // - memberName : String
	private int age;            // - age : int
	private char gender;        // - gender : char
	private String phone;       // - phone : String
	private String email;       // - email : String
	
	// 생성자 --> 인스턴스 생성/초기화가 필요한 경우 초기화작업
	// 접근제한자 생성자명([매개변수정보]) {}
	// + Member()
	public Member() {}		// 기본 생성자
	
	// 메소드 --> 기능
	// [접근제한자] [예약어] 반환타입 메소드명([매개변수정보]) { //기능 수행 코드 }
	// + changeName(name:String):void
	public void changeName(String name) {
		// memberName 변수의 값을 전달된 name 값으로 변경
		memberName = name;
	}
	// + printName():void
	public void printName() {
		// memberName 변수의 값을 출력
		System.out.println(memberName);
	}

}





