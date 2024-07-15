package com.kh.practice.run;

import java.util.Scanner;

import com.kh.practice.chap01_poly.mode.vo.AniBook;
import com.kh.practice.chap01_poly.mode.vo.CookBook;

public class Run {

	public static void main(String[] args) {
		//AniBook 5권 초기화
		AniBook[] aniList = {
				new AniBook("루피의 원피스", "루피", "japan", 12),
				new AniBook("애니북1", "작가1", "korea", 15),
				new AniBook("애니북2", "작가2", "korea", 12),
				new AniBook("애니북3", "작가3", "korea", 1),
				new AniBook("애니북4", "작가4", "korea", 1)
		};
		CookBook[] cookList = {
				new CookBook("백종원의 집밥", "백종원", "tvN", true),
				new CookBook("성시경의 집밥", "성시경", "tvN", false),
				new CookBook("이혜성의 집밥", "이혜성", "tvN", false),
				new CookBook("최현석의 집밥", "최현석", "tvN", true),
				new CookBook("기다운의 집밥", "기다운", "tvN", true),
				
		};
		//사용자에게 책 제목을 입력받아 책 정보를 조회해보자
		Scanner sc = new Scanner(System.in);
		System.out.print("조회하고자 하는 책 제목 입력 : ");
		String title = sc.nextLine();
		
		boolean found = false;
		for(int i=0; i<aniList.length; i++) {
			if(aniList[i].getTitle().equals(title)) {
				System.out.println(aniList[i].toString());
				found = true;	// 입력된 제목에 해당하는 책을 찾았을 경우 값을 true로 변경
				break;
			}
		}
		
		if(!found) {//입력된 책을 찾지 못했을 경우
			//요리책 목록에서 찾아보기
			for(int i=0; i<cookList.length; i++) {
				if(cookList[i].getTitle().equals(title)) {
					System.out.println(cookList[i].toString());
					found = true;
					break;
				}
			}
		}
	}

}
