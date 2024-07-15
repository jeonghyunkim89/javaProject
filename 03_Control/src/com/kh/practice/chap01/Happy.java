package com.kh.practice.chap01;

public class Happy {

	public static void main(String[] args) {
		
		String hi = "안녕하세요";
		System.out.printf("%s%n", hi);
		System.out.printf("%s%n", "안녕하세요");
		
		// "5 + 3 = 8" 출력
		System.out.printf("%d + %d = %d%n", 5, 3, 8);
		System.out.println("5+3=8");
		
		for(int i=0; i<3; i++) {
			System.out.println("---------------");
			for(int j=0; j<3; j++) {
				System.out.print("["+i+","+j+"]");
			} System.out.println();}
		
	
		for(int i=2; i<10; i++) {
			for(int j=1; j<10; j++) {
				System.out.println(i+"X"+j+"="+(i*j));
			}System.out.println();
		}


	}
		/*for(int i=2; i<10; i++) {
			System.out.println();
			for(int j=1; j<10; j++)
				System.out.println(i + "X" + j + "=" +(i*j));
		}
		
		for(int i=1; i<6; i++) {
			System.out.println("Happy");
		}*/
}
