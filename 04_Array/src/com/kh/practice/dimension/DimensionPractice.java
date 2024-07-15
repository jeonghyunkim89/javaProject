package com.kh.practice.dimension;

import java.util.Scanner;

public class DimensionPractice {

	private static final int num1 = 0;
	private int num2;

	public void practice1() {
		// 1. 3행 3열짜리 문자열 배열 선언 및 할당

		String[][] arr = new String[3][3];

		// 2. 인덱스 0행 0열부터 2행 2열까지 차례대로 "(0,0)"형식으로 값을 저장
		// arr.length =>2차원배열의 길이. 즉, 행의 길이
		for (int i = 0; i < arr.length; i++) { // i:행의 인덱스로 사용
			// arr[i].length =>1차원 배열의 길이. 즉, 열의 길이
			// String[] strArr; strArr과 arr[i] 의 자료형은 동일함
			// arr[i]는 문자열 데이터를 담고있는 배열이다.
			for (int j = 0; j < arr[i].length; j++) { // j:열의 인덱스로 사용
				// arr[i][j]는 문자열 데이터다
				arr[i][j] = "(" + i + "," + j + ")";
			}
		}
		// 3. 저장된 값들을 출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}

	/*
	 * public void practice2(){ //4행 4열 정수형 배열 선언 및 할당 int[][]numbers = new
	 * int[4][4];
	 *
	 * //값을 저장 int value=1; for(int i=0; i<numbers.length; i++){ //행의 인덱스. for(int
	 * j=0; j<numbers[i].length; j++){ //열의 인덱스. numbers[i][j] = value++; //
	 * 4*i+(j+1) } } //값을 출력 for(int i=0; i<numbers.length; i++){ for(int j=0;
	 * j<numbers.length; j++){ System.out.printf("%3d", numbers[i][j]); }
	 * System.out.println(); } } }
	 */
	public void practice2() {
		int[][] arr = new int[4][4];

		int a = 1;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = a++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i < 1) {
					System.out.printf("%2d ", arr[i][j]);
				} else if (i < 2) {
					System.out.printf("%2d ", arr[i][j]);
				} else if (i < 3) {
					System.out.printf("%2d ", arr[i][j]);
				} else if (i < 4) {
					System.out.printf("%2d ", arr[i][j]);
				}
			}
			System.out.println();
		}
	}

	public void practice3() {
		int[][] arr = new int[4][4];

		int a = 16;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = a--;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
	}

	public void practice4() {
		// 4행 4열 정수형 배열 선언 및 할당
		int[][] arr = new int[4][4];

		// 0행 0열부터 2행 2열까지는 1 ~ 10까지 임의의 정수 값 저장
		// 3행에는 각 열의 합을, 3열에는 각 행의 합, 3행 3열에는 가로 세로 합
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				// 랜덤값을 각 위치에 저장
				int a = arr.length - 1;
				int b = arr[i].length - 1;
				// 랜덤값을 각 위치에 저장 (0,0 ~ 2,2)
				if (i != a && j != b) {
					arr[i][j] = (int) (Math.random() * 10 + 1);
				}
				// 마지막 행
				if (i < a) {
					arr[a][j] += arr[i][j];
				}
				// 마지막 열의 위치에 현재 값을 더하기
				if (j < b) {
					arr[i][b] += arr[i][j];
				}
			}
		}
	}

	public void practice4_1() {
		int[][] arr = new int[4][4];
		// 랜덥값 각 위치에 저장
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = (int) (Math.random() * 10 + 1);
			}
		}
		/*
		 * 3열 : 0행 값들의 합, 1행 값들의 합, 2행들의 값이 나오게 한다.
		 */
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr[3][i] += arr[j][i];
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][3] += arr[i][j];
			}
		}
		arr[3][3] = arr[3][0] + arr[3][1] + arr[3][2] +
					arr[0][3] + arr[1][3] + arr[2][3];
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				System.out.printf("%5d", arr[i][j]);
			} System.out.println();
		}
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		// 1~10사이 숫자가 아니면 실행문 수행
		while(true) {
			System.out.print("행 크기 : ");
			int num1 = sc.nextInt();
			System.out.print("열 크기 : ");
			int num2 = sc.nextInt();
		
		if(num1 < 1 || num1 > 10 || num2 < 1 || num2 > 10) {
			System.out.print("반드시 1~10 사이의 정수를 입력해야 합니다.");
			continue;
		}
		//입력받은 행 크기, 열 크기로 2차원 배열 선언 및 할당
		int[][] chArr = new int[num1][num2];
		
		for (int i=0; i<num1; i++) {
			for (int j=0; j<num2; j++) {
				//65(A)~90(Z) 까지의 랜덤값 => Math.random() *(최대값-최소값+1)+최소값
				chArr[i][j]=(int)(Math.random()*(90-65+1)+65);
			}
		}
		for (int i=0; i<num1; i++) {
			for (int j=0; j<num2; j++) {
				System.out.print((char)chArr[i][j]+" ");
			}
			System.out.println();
		}
		break;
	}
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("행의 크기 : ");
		int row = sc.nextInt();
		
		//열의 크기가 다른 2차원 배열 선언 및 할당
		int[][]arr=new int[row][];
		char value = 'a';
		
		for (int i=0; i<row; i++) {
			System.out.print(i + "행의 열 크기 : ");
			int num = sc.nextInt();
			
			arr[i] = new int[num];
			//각 행의 1차원 배열에 a부터 ~ 값을 대입?
			
			for(int j=0; j<num; j++) {
				arr[i][j] = value++;
			}
		}
		//배열 데이터 값 출력
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print((char)arr[i][j] + " ");
			}
			System.out.println();
		}
		}
	
	public void practice8() {
		String[]student = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배",
				"송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};
		
		String[][]str1=new String[3][2];
		String[][]str2=new String[3][2];
		int row=0;
		int col=0;
		
		System.out.println("== 1분단 ==");
		for(int i=0; i<student.length; i++) {
			if(i<student.length/2) {
				str1[row][col] = student[i];
				
				System.out.print(str1[row][col]+" ");
				col++;
				
				if(col == str1[row].length) {
					row++;
					col=0;
					System.out.println();
				}
			} else {
				str2[row][col] = student[i];
				
				System.out.print(str2[row][col]+" ");
				col++;
				
				if(col == str2[row].length) {
					row++;
					col=0;
					System.out.println();
				}
			}
			if (i==student.length/2-1) {
				row=0;
				col=0;
				System.out.println("== 2분단 ==");
			}
		}	
		}
	}
