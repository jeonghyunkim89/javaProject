package com.kh.practice.point.view;

import java.util.Scanner;

import com.kh.practice.point.controller.CircleController;
import com.kh.practice.point.controller.RectangleController;

public class PointMenu {

	private Scanner sc = new Scanner(System.in);
	private CircleController cc = new CircleController();
	private RectangleController rc = new RectangleController();

	public void mainMenu() {

		while (true) {
			System.out.println("===== 메뉴 =====");
			System.out.println("1. 원");
			System.out.println("2. 사각형");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");

			int menu = sc.nextInt();

			switch (menu) {
			case 1:
				circleMenu();
				break;
			case 2:
				rectangleMenu();
				break;
			case 9:
				System.out.println("종료합니다.");
				return;
			default:
				System.out.print("다시 입력해주세요.");
			}
		}
	}

	public void circleMenu() {

		System.out.println("===== 원 메뉴 =====");
		System.out.println("1. 원 둘레");
		System.out.println("2. 원 넓이");
		System.out.println("9. 메인으로");
		System.out.print("메뉴 번호");

		int menu = sc.nextInt();

		if (menu != 1 && menu != 2) {
			System.out.println("메인으로 돌아갑니다.");
			return;
		}

		if (menu == 1) {
			// 1. 원 둘레 -> calcCircum()호출
			calcCircum();
		} else if (menu == 2) {
			// 2. 원 넓이 -> calcCircleArea()호출
			calcCircleArea();
		} else if (menu == 9) {
			System.out.println("메인으로 돌아갑니다.");
			// return; //현재 메소드에서는 반복문이 실행되지 않으므로 굳이 사용하지 않아도 됩니다.
		} // else {
			// System.out.println("잘못 입력하셨습니다.");
			// return;
	}

	/*
	 * switch (menu) { case 1:
	 * 
	 * cc.calcCircum(0, 0, 0); break; case 2:
	 * 
	 * cc.calcArea(0, 0, 0); break; case 9:
	 * 
	 * return; default:
	 * 
	 * }
	 */
	// }

	public void rectangleMenu() {

		System.out.println("===== 메뉴 =====");
		System.out.println("1. 사각형 둘레");
		System.out.println("2. 사각형 넓이");
		System.out.println("3. 메인으로");
		System.out.print("메뉴 번호 : ");

		int menu = sc.nextInt();

		switch (menu) {
		case 1:
			calcPerimeter();
			break;
		case 2:
			calcRectArea();
			break;
		case 3:
			System.out.println("메인으로 돌아갑니다.");
			return;
		default:
			System.out.println("잘못 입력했습니다. 메인으로 돌아갑니다.");
			return;
		}
	}

	public void calcCircum() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		System.out.print("반지름 : ");
		int r = sc.nextInt();

		System.out.println(cc.calcCircum(x, y, r));
		// 데이터를 CircleController(cc)의 calcCircum()의 매개변수로
		// 보내 반환 값 출력
	}

	public void calcCircleArea() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		System.out.print("반지름 : ");
		int r = sc.nextInt();

		System.out.println(cc.calcArea(x, y, r));
		// 데이터를 CircleController(cc)의 calcArea()의 매개변수로
		// 보내 반환 값 출력
	}

	public void calcPerimeter() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		System.out.print("높이 : ");
		int h = sc.nextInt();
		System.out.print("둘레 : ");
		int w = sc.nextInt();

		System.out.println(rc.calcPerimeter(x, y, h, w));
		// 데이터를 RectangleController(rc) calcPerimeter()의 매개변수로
		// 보내 반환값 출력
	}

	public void calcRectArea() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		System.out.print("높이 : ");
		int h = sc.nextInt();
		System.out.print("너비 : ");
		int w = sc.nextInt();

		System.out.println(rc.calcArea(x, y, h, w));
		// 데이터를 RectangleController(rc) calcArea()의 매개변수로
		// 보내 반환값 출력
	}
}
