package com.kh.practice.snack.view;

import java.util.Scanner; //ctrl + shift + o : import 자동생성
import com.kh.practice.snack.controller.SnackController;

public class SnackMenu {
	//필드부(변수)
	private Scanner sc = new Scanner(System.in);
	private SnackController scr = new SnackController();
	
	//생성자부 : 생략(정의하지 않았으나 자동으로 기본생성자가 생성될 것임)

	//메소드부
	public void menu() {
		System.out.println("스낵류를 입력하세요.");

		System.out.print("종류 : ");
		String kind = sc.nextLine();

		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("맛 : ");
		String flavor = sc.nextLine();
		
		System.out.print("개수 : ");
		int numOf = sc.nextInt();
		
		System.out.print("가격 : ");
		int price = sc.nextInt();
		
		// SnackController를 사용하여 데이터 저장(saveData() : String)
		String result = scr.saveData(kind, name, flavor, numOf, price);
		System.out.println(result);
		
		System.out.print("저장한 정보를 확인하시겠습니까?(y/n) : ");
		char yn = sc.next().charAt(0);
		
		//입력된 값이 y인 경우 저장된 정보를 출력
		if(yn == 'y' || yn == 'Y') {
			//SnackController를 사용하여 저장된 데이터 출력(confirmData() : String)
			String data = scr.confirmData();
			System.out.println(data);
		}
		//그렇지 않은 경우 종료
	}
	
}
