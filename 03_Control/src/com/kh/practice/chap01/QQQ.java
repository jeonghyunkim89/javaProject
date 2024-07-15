package com.kh.practice.chap01;

import java.util.Scanner;

public class QQQ {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*System.out.println("월을 입력 : ");
		int month = sc.nextInt();
		
		switch (month) {
		
		case 1 :
		case 3 :
		case 5 :
		case 7 :
		case 8 :
		case 10 :
		case 12 :
				System.out.println("31일");
				break;
		case 4 :
		case 6 :
		case 9 :
		case 11 :
				System.out.println("30일");
				break;
		case 2 :
				System.out.println("28일");
		default :
				System.out.println("잘못 입력했습니다.");
		}
		*/	
		System.out.println("주민번호(-포함) : ");
		String idNum = sc.nextLine();
				
		if(idNum.length() !=14) { //입력받은 값의 길이가 14가 아닌 경우
			System.out.println("잘못 입력되었습니다.");
		} else { //입력받은 값의 길이가 14인 경우
			char genNum = idNum.charAt(7);
			if (genNum == '1' || genNum == '3') {
				System.out.println("남자입니다.");
			} else if (genNum == '2' || genNum == '4') {
				System.out.println("여자입니다.");
			}
		}
				
		}
		
	}

