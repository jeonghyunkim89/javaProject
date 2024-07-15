package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {

	public void practice1() {
		Scanner sc = new Scanner(System.in);

		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();

		// 입력된 값이 1보다 작을 때 "1이상의 숫자를 입력해주세요." 출력

	}

	public void practice2() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();

			if (num < 1) {
				System.out.println("1이상의 숫자를 입력하세요 : ");
			} else {
				for (int i = 1; i <= num; i++) {
					System.out.print(i);
					if (i != num) {
						System.out.print(" ");
					}
				}
				break;
			}
		}
	}

	public void practice5() {
		Scanner sc = new Scanner(System.in);

		System.out.println("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();

		int sum = 0;

		for (int i = 1; i <= num; i++) {
			System.out.print(i);
			// 총합을계산
			sum += i; // sum = sum + i;

			// 화면에출력
			if (i != num) {
				System.out.print(" + ");
			}
		}
		System.out.println(" = " + sum);

	}

	public void practice6() {
		Scanner sc = new Scanner(System.in);

		System.out.println("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.println("두 번째 숫자 : ");
		int num2 = sc.nextInt();

		if (num1 < 1 || num2 < 1) { // 입력된 숫자 중 1미만의 숫자가 있는 경우
			System.out.println("1이상의 숫자를 입력해주세요.");
		} else { // 입력된 숫자가 모두 1이상인 경우
					// 두 숫자 중 작은 값부터 큰 값까지 출력
					// 삼항연산자 => 조건식 ? 조건식이 참인경우 사용할 값
					// : 조건식이 거짓인 경우 사용할 값

			int min = num1 < num2 ? num1 : num2;
			int max = num1 < num2 ? num2 : num1;

			for (int i = min; i <= max; i++) {
				System.out.print(i);
				if (i != max) {
					System.out.print(" ");
				}
			}

		}

	}

	public void practice8() {
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 : ");
		int num = sc.nextInt();

		System.out.println("===== " + num + "단 =====");
		for (int i = num;;) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}
			break;
		}
	}

	public void practice9() {
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 : ");
		int num1 = sc.nextInt();

		if (num1 > 9) {
			System.out.println("9이하의 숫자만 입력해주세요");
		} else {
			for (int i = num1; i < 10; i++) { //"i단"
				System.out.println("===== " + i + "단 =====");
				for (int j = 1; j < 10; j++) {
					System.out.println(i + " * " + j + " = " + (i * j));
		// = System.out.printf("%d * %d = %d", i, j, (i*j));
				}

			}
		}
	}

	public void practice10() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("숫자 : ");
			int num1 = sc.nextInt();

			if (num1 > 9) {
				System.out.println("9이하의 숫자만 입력해주세요");
			} else {
				for (int i = num1; i < 10; i++) {
					System.out.println("===== " + i + "단 =====");
					for (int j = 1; j < 10; j++) {
						System.out.println(i + " * " + j + " = " + (i * j));
					}

				} break;
			}
		}
	}
	
	public void practice12() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("연산자(+, -, *, /, %) : ");
			String op = sc.next();
			
			//연산자 입력 값이 "exit"인 경우 반복문 종료
			if (op.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			System.out.println("정수1 : ");
			int n1 = sc.nextInt();
			System.out.println("정수2 : ");
			int n2 = sc.nextInt();
			
			switch(op) {
			case "+" :
				System.out.printf("%d %s %d = %d\n", n1, op, n2, n1 + n2);
				break;
			case "-" :
				System.out.printf("%d %s %d = %d\n", n1, op, n2, n1 - n2);
				break;
			case "*" :
				System.out.printf("%d %s %d = %d\n", n1, op, n2, n1 * n2);
				break;
			case "/" :
				if(n2 == 0) {
					System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
				} else {
					System.out.printf("%d %s %d = %d\n", n1, op, n2, n1 / n2);
				}
				break;
			case "%" :
				if(n2 == 0) {
					System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
				} else {
					System.out.printf("%d %s %d = %d\n", n1, op, n2, n1 % n2);
				}
				break;
			default :
				System.out.println("없는 연산자입니다. 다시 입력해주세요.");
		}
		}
	}
}



/*
 * System.out.println("1이상의 숫자를 입력하세요 : "); int num = sc.nextInt();
 * 
 * do { if(num >=1){ for(int i=1; i<=num; i++){ System.out.print(i); if(i!=num){
 * System.out.print(""); } } break; } else {
 * System.out.println("1이상의 숫자를 입력해주세요.");
 * System.out.print("1이상의 숫자를 입력하세요 : "); num = sc.nextInt(); } } while(true);
 */
