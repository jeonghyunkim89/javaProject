package com.kh.Controller;

import java.util.Scanner;

import com.kh.model.vo.User;

public class PlayController {

	private Scanner sc = new Scanner(System.in);
	private User user = new User(); // 본인이름

	public void game01() {
		// 1~50 사이의 랜덤값을 추출해서 저장하고 사용자로부터 정수를 입력받은 뒤
		// 랜덤값보다 크면 "Down"출력, 작으면 "Up"출력
		// 같은 값이면 "Catch"출력 후 User에 점수 10점 추가(단, 5번 기회안에 성공해야 점수 획득)
		
		int score=user.getScore(); // 점수저장

		int	num = (int)(Math.random() * 51 + 1);
		

		for (int j = 0; j < 6; j++) {
			System.out.print("정수를 입력해주세요 : ");
			int userNum = sc.nextInt();
			
			if (userNum > num) {
				System.out.println("Down");
			} else if (userNum < num) {
				System.out.println("Up");
			} else if (userNum == num) {
				System.out.println("Catch");
				score = user.getScore() + 10;
				user.setScore(score);
				break;
			}			
		}
	}

	public void game02() {
		/*
		랜덤값 (1, 2, 3) 을 뽑아서 [1인 경우 가위, 2인 경우 바위, 3인 경우 보] 라고 규칙을 정하자.
		사용자로부터 가위 / 바위 / 보 를 입력받아 랜덤값과 비교하여 
		  이긴 경우 + 10점
		  진 경우 - 10점
	*/
	System.out.print("가위/바위/보를 입력하세요 : ");
	String userinput = sc.nextLine();	
	
	int userNum = 0;
	int score = user.getScore();
	
	if(userinput.equals("가위")) {
		userNum = 1;
	} else if(userinput.equals("바위")) {
		userNum = 2;
	} else if(userinput.equals("보")) {
		userNum = 3;
	}
	
	int num = (int)(Math.random()*4+1);
	
	if(userNum > num) {
		System.out.println("이겼습니다.");
		System.out.println("점수 10점 추가");
		score = user.getScore() + 10;
		
	} else if (userNum < num) {
		System.out.println("졌습니다.");
		System.out.println("점수 10점 차감");
		score = user.getScore() - 10;	
	}
	
	user.setScore(score);
	}

	public void game03() {
		/*
		자리수 (xx) --> 10 ~ 98 : 자릿수의 숫자들은 중복 없이
		랜덤값을 뽑고, 사용자로부터 입력을 받아서 아래 기준에 해당하는 경우 점수 추가
		기회 5번_ (1) 숫자와 자릿수가 모두 같으면 스트라이크(이김) --> + 10점
		          (2) 숫자만 같으면 볼 
		          (3) 틀리면 아웃 (패배) --> -5
	*/
		int nums[] = new int [88];
		int index
		
		public static boolean checkNum(int nums[], int index) {
			for(int i=0; i<nums.length; i++) {
				if(nums[i]==index)
					return true;
				}
			return false;
			
							
		for(int i=0; i<nums.length; i++) {
			do {
				index = (int)(Math.random()*89+1);
			} while (checkNum(arr[],index)); {
				arr[i] = index;
			}
		}
		System.out.print("정수를 입력해주세요 : ");
		int mm = sc.nextInt();
		
		if(mm == index) {
			
		}
		
		}


	public String getUserInfo() {
		return user.toString();
	}
}
