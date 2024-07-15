package com.kh.practice;

public class PhoneRun {

	public static void main(String[] args) {

		Phone p1 = new AndroidPhone();
		p1.call("010-1234-5678");
		
		Phone p2 = new ApplePhone();
		p2.call("010-5678-1234");
	}

}
