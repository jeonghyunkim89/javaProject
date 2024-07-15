package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
	
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		
		System.out.print("메뉴 번호를 입력하세요 : ");
		int menu = sc.nextInt();
		
		// 메뉴 1을 선택했을 때,
		if (menu == 1) {
			System.out.println("입력메뉴입니다.");
		} else if (menu == 2) {
			System.out.println("수정메뉴입니다."); // 메뉴2를 선택했을 때, => menu 변수의 값이 2와 같다면
		} else if (menu == 3) {
			System.out.println("조회메뉴입니다."); // 메뉴3를 선택했을 때, => menu 변수의 값이 3과 같다면
		} else if (menu == 4) {
			System.out.println("삭제메뉴입니다."); // 메뉴4를 선택했을 때, => menu 변수의 값이 4와 같다면
		} else if (menu == 7) {
			System.out.println("프로그램이 종료됩니다."); // 메뉴7을 선택했을 때, => menu 변수의 값이 7과 같다면
		}

	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		
		// 입력 받은 값 (num 변수)이 양수인지
		if (num > 0) {
			// 입력 받은 값이 짝수인지
			if (num % 2 == 0) {
				System.out.println("짝수다");
			} else {	// 홀수인 경우 
					System.out.println("홀수다");
			}
		}
		else { //그렇지 않으면 (0, 음수)
			System.out.println("양수만 입력해주세요");
		}
	}
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어 점수 : ");
		int korea = sc.nextInt();
		System.out.println("영어 점수 : ");
		int english = sc.nextInt();
		System.out.println("수학 점수 : ");
		int math = sc.nextInt();
		
		// 합격 조건 : 세 과목의 점수가 각각 40점 이상이고, 평균이 60점 이상일 경우
		int sum = korea + english + math;
		int average = sum/3;
		
		if (korea>=40 && english>=40 && math>=40) {
			if (average >= 60) {
				System.out.println("국어 점수 : " + korea);
				System.out.println("영어 점수 : " + english);
				System.out.println("수학 점수 : " + math);
				System.out.println("합계 점수 : " + sum);
				System.out.println("평균 점수 : " + average);
				System.out.println("축하합니다, 합격입니다.");
			} else {
			// 세 과목 중 한 과목이라도 40점 이상이 아닌 경우
			System.out.println("불합격입니다.");
			}
		} else {
			System.out.println("불합격입니다.");
		}
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1 ~ 12 사이의 정수 입력 : ");
		int month = sc.nextInt();
		
		// 1 ~ 12사이의 값인지 체크
		/*if (month >= 1 && month <= 12) {
		 * String season = "";
		 * switch(month) {
		 * case1:
		 * case2:
		 * case12:
		 * 		season = "겨울";
		 * 		break;
		 * case3:
		 * case4:
		 * case5:
		 * 		season = "봄";
		 * 		break;
		 * case6:
		 * case7:
		 * case8:
		 * 		season = "여름";
		 * 		break;
		 * case9:
		 * case10:
		 * case11:
		 * 		season = "가을";
		 * 		break;
		 * default :
		 * 		season = "해당하는 계절이 없습니다";
		*/
		switch (month) {
		case 12 :
			System.out.println("12월은 겨울입니다.");
			break;
		case 1 :
			System.out.println("1월은 겨울입니다.");
			break;
		case 2 :
			System.out.println("2월은 겨울입니다.");
			break;
		case 3 :
			System.out.println("3월은 봄입니다.");
			break;
		case 4 :
			System.out.println("4월은 봄입니다.");
			break;
		case 5 :
			System.out.println("5월은 봄입니다.");
			break;
		case 6 :
			System.out.println("6월은 여름입니다.");
			break;
		case 7 :
			System.out.println("7월은 여름입니다.");
			break;
		case 8 :
			System.out.println("8월은 여름입니다.");
			break;
		case 9 :
			System.out.println("9월은 가을입니다.");
		case 10 :
			System.out.println("10월은 가을입니다.");
		case 11 :
			System.out.println("11월은 가을입니다.");
		default :
			System.out.println("잘못 입력된 달입니다.");
		}
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("아이디 : ");
		String id = sc.nextLine();
		System.out.println("비밀번호 : ");
		String pw = sc.nextLine();
		
		// 선생님
		/* if (id.equals("myId") && pw.equals("myPassword12")){
		 * 		System.out.println("로그인 성공");
		 * } else if (!id.equals("myId")){ // 입력된 아이디 값이 "myId"가 아닌 경우
		 *		System.out.println("아이디가 틀렸습니다");
		 * } else {
		 * 		System.out.println("비밀번호가 틀렸습니다");
		 * 또는
		 * if (!id.equals("myId"){
		 * 		System.out.println("아이디가 틀렸습니다");
		 * } else if (!pw.equals("myPassworld12")){
		 * 		System.out.println("비밀번호가 틀렸습니다");
		 * } else {
		 * 		System.out.println("로그인 성공");
		 * } 
		*/ 
		if (id.equals("myId")) {
			if (pw.equals("myPassword12")) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		} else {
			System.out.println("아이디가 틀렸습니다.");
		}
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("권한을 확인하고자 하는 등급 : ");
		String grade = sc.nextLine();
		
		if (grade.equals("관리자")) {
			 System.out.println("회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성");
		} else if (grade.equals("회원")) {
			System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
		} else if (grade.equals("비회원")) {
			System.out.println("게시글 조회");
		} else {
			System.out.println("회원이 아닙니다.");
		}
	
	 switch(grade){
	   case "관리자" :
	   			System.out.println("회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성");
	   			break;
	   case "회원" :
	   			System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
	   			break;
	   case "비회원" :
	   			System.out.println("게시글 조회");
	   			break;
	   default :
	   			System.out.println("회원이 아닙니다.");
	 }
	
	
	}
	
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키(m)를 입력해 주세요 : ");
		double h = sc.nextDouble();
		System.out.println("몸무게(kg)을 입력해 주세요 : ");
		double k = sc.nextDouble();
		
		double bmi = k / (h * h);
		
		if (bmi < 18.5) {
			System.out.println("BMI 지수" +bmi);
			System.out.println("저체중");
		} else if (bmi>=18.5 && bmi<23) {
			System.out.println("BMI 지수" +bmi);
			System.out.println("정상체중");
		} else if (bmi>=23 && bmi<25) {
			System.out.println("BMI 지수" +bmi);
			System.out.println("과체중");
		} else if (bmi>=25 && bmi<30) {
			System.out.println("BMI 지수" +bmi);
			System.out.println("비만");
		} else if (bmi>=30) {
			System.out.println("BMI 지수" +bmi);
			System.out.println("고도 비만");
		}
		}
			
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("피연산자1 입력 : ");
		int num1 = sc.nextInt();
		System.out.println("피연산자2 입력 : ");
		int num2 = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("연산자를 입력(+,-,*,/,%) : ");
		String op = sc.nextLine();
		
		//if(num1 > 0 && num2 > 0) { //두 정수가 모두 양수일 때

			switch(op) {
			case "+" : //op.equals("+") => true
				System.out.printf("%d %s %d = %d", num1, op, num2, (num1 + num2));
				break;
			case "-" : //op.equals("-") => true
				System.out.printf("%d %s %d = %d", num1, op, num2, (num1 - num2));
				break;
			case "*" : //op.equals("*") => true
				System.out.printf("%d %s %d = %d", num1, op, num2, (num1 * num2));
				break;
			case "/" : //op.equals("/") => true
				System.out.printf("%d %s %d = %f", num1, op, num2, ((double)num1 / num2));
				break;
			case "%" : //op.equals("%") => true
				System.out.printf("%d %s %d = %f", num1, op, num2, ((double)num1 % num2));
				break;
			default :
				System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
			}
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간 고사 점수 : ");
		int mid = sc.nextInt();
		System.out.print("기말 고사 점수 : ");
		int fin = sc.nextInt();
		System.out.print("과제 점수 : ");
		int hw = sc.nextInt();
		System.out.print("출석 횟수 : ");
		int at = sc.nextInt();
		
		double midP = mid * 0.2;
		double finP = fin * 0.3;
		double hwP = hw * 0.3;
		double atP = at * 5 * 0.2;
		double total = midP + finP + hwP + atP;
		
		System.out.println("==========결과==========");
		
		if(atP > 20 * 0.7) {
			System.out.println("중간고사 점수(20) : " + midP);
			System.out.println("기말고사 점수(30) : " + finP);
			System.out.println("과제 점수	  (30) : " + hwP);
			System.out.println("출석 점수   (20) : " + atP);
			System.out.println("총점	   : " + total);
			if(total >= 70 ) {
				System.out.println("Pass");
			}
			if(total < 70) {
				System.out.println("Fail [점수미달]");
			}
		}
		else if (atP < 20* 0.7) {
				System.out.println("Fail [출석 횟수 부족 (" + at + "/20)]");
			}
		}		
	}
