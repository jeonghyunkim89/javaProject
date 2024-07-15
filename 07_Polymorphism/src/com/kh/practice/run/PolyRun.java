package com.kh.practice.run;

import com.kh.practice.chap01_poly.mode.vo.AniBook;
import com.kh.practice.chap01_poly.mode.vo.Book;
import com.kh.practice.chap01_poly.mode.vo.CookBook;

public class PolyRun {

	public static void main(String[] args) {
		Book[] bookList = new Book[10];
		bookList[0] = new AniBook("루피의 원피스", "루피", "japan", 12);
		bookList[1] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
		//....
		String title = "백종원의 집밥";
		
		for(int i=0; i<bookList.length; i++) {
			if(bookList[i].getTitle().equals(title)){
				System.out.println(bookList[i].toString());
				break;
			}
		}
	}

}
