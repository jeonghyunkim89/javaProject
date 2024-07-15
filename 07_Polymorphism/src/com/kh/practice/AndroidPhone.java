package com.kh.practice;

//인터페이스 구현(상속)시 " implements " 사용
public class AndroidPhone implements Phone {
	//public abstract void call(String number);
	public void call(String number) {
		System.out.println("AndroidPhone....");
		System.out.println("call...."+number);
	}
	

}
