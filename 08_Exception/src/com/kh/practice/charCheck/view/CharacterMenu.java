package com.kh.practice.charCheck.view;

import java.util.Scanner;

import com.kh.practice.charCheck.controller.CharacterController;
import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterMenu {

	public void menu() {
		Scanner sc = new Scanner(System.in);
		CharacterController cc = new CharacterController();

		// 사용자에게 문자열을 입력 받아 CharacterController의 countAlpha()에
		// 매개변수로 넘겨주어 반환 값을 출력함
		try {
			System.out.print("문자열 : ");
			String s = sc.nextLine();

			int count = cc.countAlpha(s);
			System.out.printf("'%s'에 포함된 영문자 개수 : %d\n", s, count);
		} catch (CharCheckException e) {
			e.printStackTrace();
		}
		System.out.println("----------END----------");
		// 이 때 countAlpha()메소드를 호출하는 부분부터 try~catch를 이용하여 예외 처리
	}
}
