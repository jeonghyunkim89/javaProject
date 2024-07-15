package com.kh.ch08_polymorphism;

public class Daughter extends Parent {
	// int x;
	// int y;
	
	@Override
	public void print() {
		System.out.println("나는 딸이야!");
	}
	
	public void printDaughter() {
		System.out.println("나는 이쁜 딸이야~");
	}

}
