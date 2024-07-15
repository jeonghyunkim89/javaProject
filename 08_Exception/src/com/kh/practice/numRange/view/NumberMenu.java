package com.kh.practice.numRange.view;

import java.util.Scanner;

import com.kh.practice.numRange.controller.NumberController;
import com.kh.practice.numRange.exception.NumRangeException;

public class NumberMenu {

	public void menu() {
		Scanner sc = new Scanner(System.in);
		NumberController nc = new NumberController();
		// 사용자에게 두 정수를 입력 받아 NumberController의 checkDouble()에
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();

		try {
			boolean n = nc.checkDouble(num1, num2);
			System.out.println(num1 + "은 " + num2 + "의 배수인가? " + n);

		} catch (NumRangeException e) {
			e.printStackTrace();
		}
		// 매개변수로 넘겨주어 반환 값을 출력함
		// 이 때 checkDouble()메소드를 호출하는 부분부터 try~catch를 이용하여 예외 처리
	}
}
