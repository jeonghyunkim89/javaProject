package com.kh.practice.book.view;

import java.util.Calendar;
import java.util.Scanner;
import com.kh.practice.book.controller.BookController;
import com.kh.practice.book.model.vo.Book;


public class BookMenu {

	private Scanner sc = new Scanner(System.in);
	private BookController bc = new BookController();
	private Book[] bArr;
	
	public BookMenu() {
		// 파일이 없을 때 만들어주기 위해 BookController(bc)에 makeFile() 호출
		bc.makeFile();
		// 필드에 있는 bArr에 bc의 fileRead() 반환 값 대입
		bArr = bc.fileRead();
	}
	public void mainMenu() {
		
		while(true) {
			System.out.println("1.도서 추가 저장");
			System.out.println("2.저장 도서 출력");
			System.out.println("9.프로그램 끝내기");
			System.out.print("메뉴 번호 : ");
			
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1 :
				fileSave();
				break;
			case 2 :
				fileRead();
				break;
			case 9 :
				System.out.println("프로그램 종료");
				return;
			default :
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}		
	}
	public void fileSave() {
		sc.nextLine();
		
		System.out.print("도서명 : ");
		String title = sc.nextLine();
		
		System.out.print("저자명 : ");
		String author = sc.nextLine();
		
		System.out.print("도서 가격 : ");
		int price = sc.nextInt();
		sc.nextLine();
		
		System.out.print("출판 날짜(yyyy-mm-dd) : ");		
		String date = sc.nextLine();
		
		System.out.print("할인율 : ");
		double discount = sc.nextDouble();
		
		String[] dItem = date.split("-");
		Calendar cal = Calendar.getInstance(); //=>getInstance() 메소드를 통해 객체 생성
		//Calendar cal = new Calendar(); => Calendar는 추상클래스로 객체생성 불가!
		int year = Integer.parseInt(dItem[0]);  	//Integer.parseInt(문자열) : Integer --> int
 		int month = Integer.parseInt(dItem[1])-1; 	//=>문자열의 값을 정수형의 값으로 변환
		int date2 = Integer.parseInt(dItem[2]);		//=>Calender클래스도 월(month) 데이터를 0부터 처리함
		cal.set(year, month, date2);
		
		//Book 객체에 담기 --> 데이터를 사용하여 Book 객체 생성
		Book newBook = new Book(title, author, price, cal, discount);
		for(int i=0; i<bArr.length; i++) {
			//비어있는 배열 객체 --> 해당 index위치의 값이 null인지 확인!
			if(bArr[i] == null) {
				bArr[i] = newBook;
				break;
			}
		}
		
		bc.fileSave(bArr);
		// 입력 받은 출판날짜를 split()를 통해 년, 월, 일로 나누고 Calendar에 담음 
		// =>String 클래스의 split()사용 --> [출판 날짜] 데이터는 문자열 형태로 입력받기!
		// =>Calendar 클래스 객체 생성 후 set(int year, int month, int date)메소드 사용하기!
		
		// 각 요소와 새로 만든 Calendar를 Book 객체에 담고  
		// 비어있는 Book객체 배열(bArr)에 담아 bc에 fileSave()에 매개변수로 전달 
	}
	public void fileRead() {
		// bc에 fileRead()의 반환 값을 가지고 저장된 데이터 출력
		Book[] bList = bc.fileRead();
		for(Book b : bList) {
			if(b != null) {
				System.out.println(b/*.toString()*/);
			}
		}
	}
}
