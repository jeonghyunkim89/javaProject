package com.kh.practice.list.library.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//제어(controller)용 클래스 --> 사용자의 요청에 따라 작업을 제어(수행)한 후 결과를 전달하는 역할
public class BookController {

	private ArrayList<Book> bookList = new ArrayList();

	public BookController() {
		bookList.add(new Book("자바의 정석", "남궁성", "기타", 20000));
		bookList.add(new Book("쉽게 배우는 알고리즘", "문병로", "기타", 15000));
		bookList.add(new Book("대화의 기술", "강보람", "인문", 17500));
		bookList.add(new Book("암 정복기", "박신우", "의료", 21000));
	}

	public void insertBook(Book bk) {
		// 전달 받은 bk를 bookList에 추가
		bookList.add(bk);
	}

	public ArrayList<Book> selectList() {
		// 해당 bookList의 주소 값 반환 --> 현재 컨트롤러에서 사용중인 리스트의 참조변수를 반환
		return (ArrayList<Book>) bookList;
	}

	public ArrayList<Book> searchBook(String keyword) {
		// 검색 결과 리스트를 담아줄 리스트(ArrayList searchList) 선언 및 생성
		// 반복문을 통해 list의 책 중 도서명에 전달 받은 keyword가 포함되어있는 경우
		// searchList에 해당 책 추가하고 searchList 반환
		ArrayList<Book> searchList = new ArrayList<>();

		for (int i = 0; i < bookList.size(); i++) {
			Book b = bookList.get(i); // [1]리스트에서 인덱스(i)에 해당하는 Book객체 조회
			String title = b.getTitle();// [2]해당 Book 객체의 데이터 중 책 제목 조회
			if (title.contains(keyword)) {// [3]keyword가 책 제목에 포함되어 있는지 확인
				searchList.add(b);
			}
		}
		return searchList;
	}

	public Book deleteBook(String title, String author) {
		// 삭제된 도서를 담을 Book객체 (Book removeBook) 선언 및 null로 초기화
		// 반복문을 통해 bookList의 책 중 도서명이 전달 받은 title과 동일하고
		// 저자 명이 전달 받은 author와 동일한 경우 해당 인덱스 도서 삭제 후 빠져나감
		// 이 때 해당 인덱스 도서를 removeBook에 대입 후 removeBook 반환
		Book removeBook = null;
		for (int i = 0; i < bookList.size(); i++) {
			Book b = bookList.get(i);
			if ((b.getTitle().equals(title)) && (b.getAuthor().equals(author))) {
				removeBook = bookList.remove(i);
				break;
			}
		}
		return removeBook;
	}

	public int ascBook() {
		// 책 이름으로 오름차순 후 1 반환
		// ArrayList에 담긴 객체인 Book 클래스에 compareTo메소드 재정의하여 정렬
		Collections.sort(bookList);

		return 1;
	}
}
