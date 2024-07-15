package com.kh.phone.model.view;

import java.util.Scanner;

import com.kh.phone.controller.PhoneController;
import com.kh.phone.model.vo.PhoneBook;

public class PhoneMenu {
	
	Scanner sc = new Scanner(System.in);
	PhoneController pc = new PhoneController();
	PhoneBook[] pArr;
	
	public PhoneMenu() {}
	public void mainMenu() {
		while(true) {
			System.out.println("1.연락처 추가");
			System.out.println("2.연락처 조회");
			System.out.println("3.연락처 수정");
			System.out.println("4.연락처 삭제");
			System.out.print("메뉴 번호 : ");
			
			int menu = sc.nextInt();
			
		switch(menu) {
		case 1 :
			createPhone();
			break;
		case 2 :
			readPhone();
			break;
		case 3 :
			updatePhone();
			break;
		case 4 :
			deletePhone();
			return;
		default :
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
		}
		}
	}
	
	public void createPhone() {
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("연락처(-포함) : ");
		String phone = sc.nextLine();
		
		System.out.print("추가사항을 입력하시겠습니까? (y/n) : ");
		char yn = sc.next().charAt(0);
		
		if(yn == 'y' || yn == 'Y') {
			System.out.println("소속 : ");
			String group = sc.nextLine();
		 
			System.out.print("이메일 : ");
			String email = sc.nextLine();
		
			System.out.print("메모 : ");
			String memo = sc.nextLine();
			
			PhoneBook pb = new PhoneBook(name, phone, group, email, memo);
			pc.createPhone(pb);
		} 
	}
	
	public void readPhone(String) {
		PhoneBook = pc.readPhone();
		
		for(PhoneBook phone : pArr) {
			System.out.println(phone);
		}
		
		System.out.print("이름 : ");
		String fileName = sc.nextLine();
		
		if(pc.getName)) {
			//파일이 존재하는 경우 (true) => fileOpen메소드의 매개변수로 넘겨 반환값 출력
			System.out.println(fc.fileOpen(fileName));
		} else {
			System.out.println("없는 파일입니다.");
			return;	//생략가능
		}
	}
	}
	
	public void updatePhone() {}
	
	public void deletePhone() {}


}
