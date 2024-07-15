package com.kh.practice.list.library.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.practice.list.library.controller.Book;
import com.kh.practice.list.library.controller.BookController;

// 화면용(view) 클래스 --> 사용자에게 데이터를 표시(출력) 
public class BookMenu {
	
	BookController bc = new BookController();
	Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		// 사용자가 직접 메인 메뉴를 선택할 수 있음
		// 종료전까지 반복실행. 각 메뉴 선택시 해당 메소드 이동(호출)
		
		System.out.println("== Welcome KH Library ==");
		
		while(true) {
			System.out.println("******* 메인 메뉴 *******");
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색 조회");
			System.out.println("4. 도서 삭제");
			System.out.println("5. 도서명 오름차순 정렬");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 입력 : ");
			int menu = sc.nextInt();
			sc.nextLine(); // nextLine메소드 외에는 버퍼에 엔터키(\n)값이 남아 있어 제거하기 위해 사용
			
		switch(menu) {
		
		case 1 :
			insertBook ();
			break;
		
		case 2 :
			selectList ();
			break;
		
		case 3 :
			searchBook ();
			break;
		
		case 4 :
			deleteBook ();
			break;
			
		case 5 :
			ascBook();
			break;
		
		case 9 :
			System.out.println("프로그램 종료");
			return;	//메소드 종료 --> 현재 메소드를 호출한 위치로 돌아감!
		
		default :
			System.out.println("잘못 입력했습니다. 다시 입력해주세요.");
			break;
		}
		}	
	}
	
	public void insertBook() {
		
		System.out.println("===== 새 도서 추가 =====");
		System.out.println("책 정보를 입력해주세요.");
		System.out.print("도서명 : ");
		String title = sc.nextLine();
		System.out.print("저자명 : ");
		String author = sc.nextLine();
		System.out.print("장르(1.인문 / 2.자연과학 / 3.의료 / 4.기타) : ");
		int category = sc.nextInt();
		System.out.print("가격 : ");
		int price = sc.nextInt();
		 
			
			String ctg = "";
			switch(category) {
			case 1 :
				ctg = "인문";
				break;
			case 2 :
				ctg = "자연과학";
				break;
			case 3 :
				ctg ="의료";
				break;
			case 4 :
				ctg ="기타";
				return;
			/* String strCtg = "";
				if(category == 1) {
					strCtg = "인문";
				} else if (category == 2) {
					strCtg = "자연과학";
				} else if (category == 3) {
					strCtg = "의료";
				} else if (category == 4) {
					strCtg = "기타";
				}
				Book b = new Book(title, author, strCtg, price);
				
				배열을 사용한다면.....
				String[] categories = {"인문", "자연과학", "의료", "기타"};
				Book b2 = new Book(title, author, categories[category-1], price);
				
				문자열 split() 사용한다면
				String categories = "인문, 자연과학, 의료, 기타";
				Book b3 = new Book(title, author, categories.split(",")[category-1], price);
				
			}
			*/
			}
			Book bk = new Book(title, author, ctg, price);
			bc.insertBook(bk);
			}
	
	public void selectList() {

		ArrayList<Book> bookList = bc.selectList();

		if(bookList.isEmpty()) {	//isEmpty() => 리스트가 비어있는지 여부를 확인하는 메소드
				System.out.println("존재하는 도서가 없습니다.");
		} else {
				for(int i=0; i<bookList.size(); i++) {	//size():리스트의 저장된 데이터 길이
					System.out.println(bookList.get(i)/*.toString()*/); //get(index) : 해당 index위치의 데이터 조회
				}
			}
	}
	
	public void searchBook() {
		System.out.println("===== 도서 검색 =====");
		System.out.print("검색 키워드 : ");
		String keyword = sc.nextLine();
		ArrayList<Book> searchList = bc.searchBook(keyword);
		 if(searchList.isEmpty()) {
			 System.out.println("검색 결과가 없습니다.");
		 } else {
			 // for (Book b : searchList){
			 //			System.out.println(b);
			 for(int i=0; i<searchList.size(); i++) {
				 System.out.println(searchList.get(i));
			 } 
		} 
	}
	
	public void deleteBook() {
		System.out.println("===== 도서 삭제 =====");
		
		System.out.print("삭제할 도서명 : ");
		String title = sc.nextLine();
		System.out.print("삭제할 저자명 : ");
		String author = sc.nextLine();
		
		Book remove = bc.deleteBook(title, author);
		if(remove == null) {
			System.out.println("삭제할 도서를 찾지 못했습니다.");
		} else {
			System.out.println("성공적으로 삭제되었습니다.");
		}
	}
	
	public void ascBook() {
		//컨트롤러의 ascBook()메소드 결과에 따라
		//	성공 시 "정렬에 성공했습니다." 출력
		//	실패 시 "정렬에 실패했습니다." 출력
		int result = bc.ascBook();
		if(result == 1) {
			System.out.println("정렬에 성공하였습니다.");
		} else {
			System.out.println("정렬에 실패하였습니다.");
		}		
	}
}
