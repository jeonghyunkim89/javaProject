package com.kh.hw.shape.view;

import java.util.Scanner;
import com.kh.hw.shape.controller.*;

public class ShapeMenu {
	//필드부(변수)
	private Scanner sc = new Scanner(System.in);
	private SquareController scr = new SquareController();
	private TriangleController tc = new TriangleController();
	
	//생성자부 : 생략!
	
	//메소드부
	public void inputMenu() {
		//// ===== 도형 프로그램 ===== 
		// 3. 삼각형 ==> triangleMenu()
		// 4. 사각형 ==> squareMenu()
		// 9. 프로그램 종료 => “프로그램 종료” 출력 후 프로그램 종료 
		// 메뉴 번호 : 
		// 잘못 입력했을 시 “잘못된 번호입니다. 다시 입력해주세요.” 출력 후 반복
		while(true) {
		System.out.println("===== 도형 프로그램 =====");
		System.out.println("3. 삼각형");
		System.out.println("4. 사각형");
		System.out.println("9. 프로그램 종료");
		System.out.print("메뉴 번호 :");
		
		int menu = sc.nextInt();
		
		switch(menu) {
		case 3 : triangleMenu();  //[3. 삼각형] 메뉴 선택 시
				break;
		case 4 : squareMenu(); //[4. 사각형] 메뉴 선택 시
				break;
		case 9 : System.out.println("프로그램 종료"); //"프로그램 종료"출력 후 프로그램 종료
				return;
					
		default: //"잘못된 번호입니다. 다시 입력해주세요." 출력 후 반복
			System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
		}	
		}
	}
	public void triangleMenu() {
		// ===== 삼각형 ===== 
		// 1. 삼각형 면적 ==> inputSize() 
		// 2. 삼각형 색칠 ==> inputSize() 
		// 3. 삼각형 정보 ==> printInformation() 
		// 9. 메인으로 ==> “메인으로 돌아갑니다.” 출력 후 inputMenu()로 
		// 메뉴 번호 : 
		// 잘못 입력했을 시 “잘못된 번호입니다. 다시 입력해주세요.” 출력 후 반복
		
		while(true) {
		System.out.println("===== 삼각형 =====");
		System.out.println("1. 삼각형 면적");
		System.out.println("2. 삼각형 색칠");
		System.out.println("3. 삼각형 정보");
		System.out.println("9. 메인으로");
		System.out.print("메뉴 번호 : ");
		
		int menu = sc.nextInt();
		
		switch(menu) {
		case 1: //[1. 삼각형 면적]메뉴 선택 시
			inputSize(3, 1);	//inputSize(type, menuNum)
								//type:삼각형(3) 또는 사각형(4)
								//menuNum : 해당 메뉴번호 (1,2)
			break;
		case 2://[2. 삼각형 색칠]메뉴 선택 시
			inputSize(3, 2);
			break;
		case 3://[3. 삼각형 정보]메뉴 선택 시
			printInformation(3);	//type : 삼각형(3) 또는 사각형(4)
			break;
		case 9://[9. 메인으로]메뉴 선택 시
			System.out.println("메인으로 돌아갑니다.");
			return;
		default://"잘못된 번호입니다. 다시 입력해주세요."
			System.out.println("잘못된 번호입니다. 다시 입력해주세요");
		}
		}	
	}
	public void squareMenu() {
		// ===== 사각형 ===== 
		// 1. 사각형 둘레 ==> inputSize() 
		// 2. 사각형 면적 ==> inputSize() 
		// 3. 사각형 색칠 ==> inputSize() 
		// 4. 사각형 정보 ==> printInformation() 
		// 9. 메인으로 ==> “메인으로 돌아갑니다.” 출력 후 inputMenu()로 
		// 메뉴 번호 : 
		// 잘못 입력했을 시 “잘못된 번호입니다. 다시 입력해주세요.” 출력 후 반복
		
		while(true) {
		System.out.println("===== 사각형 =====");
		System.out.println("1. 사각형 둘레");
		System.out.println("2. 사각형 면적");
		System.out.println("3. 사각형 색칠");
		System.out.println("4. 사각형 정보");
		System.out.println("9. 메인으로");
		System.out.println("메뉴 번호 : ");
		
		int menu = sc.nextInt();
		
		switch(menu){
		case 1 : inputSize (4, 1); //4:사각형타입, 1:사각형메뉴 중 1번메뉴
				break;
		case 2 : inputSize (4, 2); //4:사각형타입, 2:사각형메뉴 중 2번메뉴
				break;
		case 3 : inputSize (4, 3); //4:사각형타입, 3:사각형메뉴 중 3번메뉴
				break;
		case 4 : printInformation(4); //4:사각형타입
				break;
		case 9 : System.out.println("9. 메인으로 돌아갑니다.");
				return; //메소드를 종료하고 호출된 위치로 돌아간다.(inputMenu()메소드에서 호출됨!)
		default : System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
		}
		}
	}
	// 삼각형 메뉴, 사각형 메뉴의 세부 메뉴에서 모두 같은 메소드로 이동하기 때문에 
	// 삼각형인지 사각형인지, 몇 번 메뉴인지 구분하기 위해 매개변수로 넘겨줌
	public void inputSize(int type, int menuNum) {
		// 매개변수로 들어온 type과 menuNum의 숫자에 따라 출력이 달라짐 
		 
		  // int type이 ‘삼각형’이면서 menuNum이 1번일 경우 
		if(type == 3 && menuNum == 1) {
		  // 높이 : 
			System.out.print("높이 : ");
			int h = sc.nextInt();
		  // 너비 :  
			System.out.print("너비 : ");
			int w = sc.nextInt();
		  // 삼각형 면적 : ==> tc(TriangleController)의 calcArea() 출력
			System.out.print("삼각형 면적 : ");
			double area = tc.calcArea(h, w); //==> h*w/2
		  System.out.println(tc.calcArea(h, w));
		} else if (type == 3 && menuNum == 2){
			// int type이 ‘삼각형’이면서 menuNum이 2번일 경우
			// 색깔을 입력하세요 : 
		    // tc의 paintColor() 호출 후 “색이 수정되었습니다” 출력 
			System.out.println("색깔을 입력하세요 : ");
			String color = sc.next();
			tc.paintColor(color);
			System.out.println("색이 수정되었습니다.");
		} else if (type == 4 && (menuNum == 1 || menuNum == 2)) {
		  // int type이 ‘사각형’이면서 menuNum이 1번이나 2번일 경우 
		  // 높이 : 
		  // 너비 :
			System.out.print("높이 : ");
			int h = sc.nextInt();
			System.out.print("너비 : ");
			int w = sc.nextInt();
			
			if(menuNum == 1) {
		  // menuNum이 1번일 경우 
		  // 사각형 둘레 : ==> scr(SquareController)의 calcPerimeter() 출력
				double perimeter = scr.calcPerimeter(h, w);
				System.out.println("사각형 둘레 : "+perimeter);
			} else if (menuNum == 2){// menuNum이 2번일 경우 
		  // 사각형 면적 : ==> scr의 calcArea() 출력
				System.out.println("사각형 면적 : "+scr.calcArea(h, w));
				
			}
		} else if (type == 4 && menuNum == 3) {
			// int type이 ‘사각형’이면서 menuNum이 3번일 경우 
			// 색깔을 입력하세요 :
			System.out.print("색깔을 입력하세요 : ");
			String color = sc.next();
			scr.paintColor(color);
			System.out.println("색이 수정되었습니다.");
		}
		   
		  // scr의 paintColor() 호출 후 “색이 수정되었습니다” 출력
		
		}
	
	public void printInformation(int type) {
		if(type == 3) {
			System.out.println(tc.print());
		} else if (type == 4) {
			System.out.println(scr.print());
		}
	}

}
