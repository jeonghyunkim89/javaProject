package com.kh.practice.score.view;

import java.util.Scanner;

import com.kh.practice.score.controller.ScoreController;

public class ScoreMenu {
	
	private Scanner sc = new Scanner(System.in);
	private ScoreController scr = new ScoreController();
	
	public void mainMenu() {
		//메인메뉴 출력
		while(true) {
			System.out.println("1. 성적 저장");
			System.out.println("2. 성적 출력");
			System.out.println("9. 끝내기");
			int menu = sc.nextInt();
			
		switch(menu) {
		case 1 :
			saveScore();
			break;
		case 2 :
			readScore();
			break;
		case 9 :
			System.out.println("프로그램을 종료합니다.");
			return;
		default :
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
		}
		}
	}
	public void saveScore() {
		//사용자에게 점수를 입력받음
		int num = 0; 	//학생 숫자를 나타낼 변수
		num++;
		while(true) {
			System.out.println(num+"째 학생 정보 기록"); 
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("국어 점수 : ");
			int kor = sc.nextInt();
			System.out.print("영어 점수 : ");
			int eng = sc.nextInt();
			System.out.print("수학 점수 : ");
			int math = sc.nextInt();
			
			int sum = kor + eng + math;
			double avg = sum / 3;
			return scr.saveScore(name, kor, eng, math, sum, avg);
			
			
			System.out.print("그만 입력하시려면 N 또는 n 입력, 계속 하시려면 아무 키나 입력하세요 : ");
			char ch = sc.next().charAt(0);
			if(ch == 'n'&& ch == 'N') {
				return;				
			}else {
			mainMenu();
			}
		}
		
		// ScoreController(scr)의 saveScore() 매개변수로 모두 넘겨 주고 
		// 그 학생 점수의 합계와 평균도 함께 매개변수로 넣어줌
		
		// N이나 n을 입력하지 않으면 이름 및 점수를 받는 것을 반복함 
		// N이나 n을 입력하면 사용자에게 받는 반복문을 나감
	}
	public void readScore() {
		//저장된 점수 출력
		
	}

}
