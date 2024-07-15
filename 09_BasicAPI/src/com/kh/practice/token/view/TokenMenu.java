package com.kh.practice.token.view;

import java.util.Scanner;

import com.kh.practice.token.controller.TokenController;

public class TokenMenu {
	private Scanner sc = new Scanner(System.in);
	private TokenController tc = new TokenController();
	
	//메인 메뉴 출력
	public void mainMenu() {
		//1. 지정 문자열 ➔ tokenMenu()
		//2. 입력 문자열 ➔ inputMenu()
		//3. 프로그램 끝내기 ➔ “프로그램을 종료합니다” 출력 후 종료
		// 잘못 입력했을 시 “잘못 입력하셨습니다. 다시 입력해주세요.” 출력 후 반복
		
		while(true) {
			System.out.println("1. 지정 문자열");
			System.out.println("2. 입력 문자열");
			System.out.println("3. 프로그램 끝내기");
			System.out.print("메뉴 번호 : ");
			
			int menu = sc.nextInt();	
		
		switch(menu) {
		case 1 : 
			tokenMenu();
			break;
		case 2 :
			inputMenu();
			break;
		case 3 :
			System.out.println("프로그램을 종료합니다.");
			return;
		default : 
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
		}
		}
	}
	//토큰 처리 전, 토큰 처리 후 출력
	public void tokenMenu() {
		//String str = “J a v a P r o g r a m “; 
		String str = "J a v a P r o g r a m ";
		// 토큰 처리 전 글자, 토큰 처리 전 개수를 출력
		System.out.println("토큰 처리 전 글자 : "+str);
		System.out.println("토큰 처리 전 개수 : "+str.length());
		// TokenController(tc)의 afterToken()의 반환 값을 가지고
		// 토큰 처리 후 글자, 토큰 처리 후 개수, 모두 대문자로 변환 한 것을 출력
		String after = tc.afterToken(str);
		System.out.println("토큰 처리 후 글자 : "+after);
		System.out.println("토큰 처리 후 개수 : "+after.length());
		System.out.println("모두 대문자로 변환 : "+after.toUpperCase());
	}
	//첫 글자 대문자와 찾을 문자 몇 개 있는지 출력
	public void inputMenu() {
		// tc에 firstCap()로 입력 받은 문자열을 넘기고 반환 값 출력
		System.out.print("문자열을 입력하세요 : ");
		String input =sc.next();
		String result = tc.firstCap(input);
		System.out.println("첫 글자 대문자 : "+result);

		System.out.print("찾을 문자를 하나 입력하세요 : ");
		char findCh = sc.next().charAt(0);
		int count = tc.findChar(result, findCh);
		// tc에 findChar()로 위에 입력 받은 문자열과 방금 받은 문자를 인자로 넘겨
		// 반환 값 출력
		System.out.println(findCh + "문자가 들어간 개수 : "+count);
	}

}
