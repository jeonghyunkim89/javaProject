package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {
	
	//기본 생성자
	public TokenController() {}
	
	//공백을 토큰으로 처리한 문자열 반환
	public String afterToken(String str) {
		// 매개변수로 받아온 str을 StringTokenizer를 이용하여
		// 띄어쓰기를 없애고 없앤 문자열 반환
		
		StringTokenizer st = new StringTokenizer(str, " ");
		StringBuilder sb = new StringBuilder();
		
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			sb.append(token);
			
		}
		return sb.toString();
		
	}
	//첫 글자만 대문자로 바꾼 문자열 반환
	public String firstCap(String input) {
		String subStr=input.substring(0, 1); // 첫글자만...
		
		return subStr.toUpperCase() + input.substring(1);
		// 매개변수로 받아온 input의 첫 번째 글자만 대문자로 바꾼 문자열 반환
		
	}
	//문자열 안에 찾을 문자 개수가 몇 개 들어가있는지 반환
	// 매개변수의 문자가 문자열 안에 몇 개가 들어가 있는지 반환
	public int findChar(String input, char one) {
		int count = 0;
		for(int i=0; i<input.length(); i++) {
			if(input.charAt(i) == one) {
				count++;
			}
		}
		return count;
		
		
	}

}
