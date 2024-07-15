package com.kh.practice1;

import java.util.Scanner;

public class VariablePractice2 {
	
	public static void main(String[] args) {
		
		// "문자열을 입력하세요 : " 출력
		System.out.print("문자열을 입력하세요 : ");
		// 사용자로부터 문자열로 입력을 받는다. => Scanner
		Scanner sc = new Scanner(System.in);
		
		// 문자열을 입력받아주는 메서드 : next()띄어쓰기 전까지 문자열을 가져옴, nextLine()띄어쓰기 후까지 문자열을 가져옴
		String str = sc.nextLine(); // apple
		// String 기능 중 문자 하나씩 꺼내오는 메서드 : charAt(위치값)
		System.out.println("첫 번째 문자 : " + str.charAt(0));
		System.out.println("두 번째 문자 : " + str.charAt(1));
		System.out.println("세 번째 문자 : " + str.charAt(2));
		
	}

}
