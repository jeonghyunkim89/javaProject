package com.kh.review;

import java.util.Scanner;

public class Operation {
	
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=30;
		
		System.out.println(a++);
		System.out.println((++a)+(b++)); //12+
		System.out.println((a++)+(--b)+(--c)); //12+20+29=61
		
		System.out.printf("a : %d, b : %d, c : %d\n", a, b, c);
		
	}

	public static void triple() {
		/* *삼항연산자 : 조건문(if)과 유사한 성격의 연산자
		 * [표현식]
		 * 		조건식 : 조건식의 결과가 참인 경우 사용될 값 : 조건식의 결과가 거짓인 경우 사용될 값
		 * 입력받은 문자가 대문자인지 확인
		 */
		Scanner sc = new Scanner(System.in);
		
		char ch = sc.nextLine().charAt(0);
		
		//ch라는 변수에 값이 대문자인지 확인 'A' ~ 'Z' 사이의 값이면 "대문자", 그렇지않으면 "대문자 아님" 출력

		//String result = ch >=65 && ch <=90? "대문자":"대문자아님";
		String result = ch >='A' && ch <='Z'? "대문자":"대문자아님";
		System.out.println(result);
		
		
	}
}
