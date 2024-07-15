package com.kh.practice.charCheck.controller;

import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterController {
	
	public CharacterController() {}
	
	public int countAlpha(String s) throws CharCheckException {
		// 매개변수로 들어온 값에 있는 영문자를 세어 반환
		// 문자열에 공백이 있다면 CharCheckException발생, 에러 메시지는 출력 값 참고
		
	
		int count = 0;	
		for(int i=0; i<s.length(); i++) {
		//대소문자 체크
			if(('a'<= s.charAt(i) && s.charAt(i) <='z') ||
			('A'<= s.charAt(i) && s.charAt(i) <='Z')) {
				count++;
			}
			if(s.charAt(i)==' ') {
				//System.out.println(i+"번째 문자는 공백입니다.");
				throw new CharCheckException("체크할 문자열 안에 공백이 포함되어 있습니다.");
			}
			
		}
		//카운트된 영문자 개수 반환
		return count;
				
	}

}
