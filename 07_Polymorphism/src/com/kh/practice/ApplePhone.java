package com.kh.practice;

public class ApplePhone implements Phone {

	@Override
	public void call(String number) {
		System.out.println("ApplePhone.....");
		System.out.println("call...."+number);
	}

	
}
