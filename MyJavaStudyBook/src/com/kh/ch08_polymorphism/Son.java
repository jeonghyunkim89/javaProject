package com.kh.ch08_polymorphism;

public class Son extends Parent{
	//int x;
	//int y;
	
	@Override
	public void print() {
		System.out.println("나는 아들이야!");
	}
	
	public void printSon() {
		System.out.println("나는 자랑스러운 아들이야!!");
	}

}
