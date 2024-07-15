package com.kh.practice.chap02;

public class Practice {

	public void method1() {
		// 1 ~ 10 출력 => 1 2 3 4 5 6 7 8 9 10
		for (int i = 1; i <= 10; i++) {

			System.out.print(i);

			if (i != 10) { // i 값이 10이 아닐 때 띄어쓰기 출력
				System.out.print(" ");
			}
		}
		System.out.println("\n--------------------");
		// 10 ~ 1 출력 => 10 9 8 7 6 5 4 3 2 1

		for (int i = 10; i > 0; i--) {

			System.out.print(i);

			if (i != 1) {
				System.out.print(" ");
			}
		}
		System.out.println();
	}

	public void method2() {
		// 1 ~ 10까지 총 합을 구하여 출력
		int sum = 0;

		for (int i = 1; i <= 10; i++) {

			sum = sum + i; // sum +=i;
		}
		System.out.print("1부터 10까지 총 합 : " + sum);
		System.out.println();
	}

	public void method3() {
		// 랜덤값까지의 총 합을 구하여 출력 (1 ~ 10 사이의 랜덤값)
		/*
		 * [랜덤값 구하는 방법] - Math : java.lang.Math * random() : 랜덤값을 반환해주는 메서드 => 사용법 :
		 * Math.random() 값의 범위 : 0.0 ~ 0.99999XX (0.0 <= n < 1.0) => 1 ~ 10 사이의 랜덤값 :
		 * (int)(Math.random() * 10 + 1)
		 */
		int random = (int) (Math.random() * 10 + 1);
		System.out.println("랜덤값은 " + random + "입니다.");
		// random 까지의 총합을 구하여 출력 (1 ~ random)
		// * 10 => 0.0 ~ 9.9999999
		// (int)(*10+1) => 1 ~ 10
		int sum = 0;

		for (int i = 1; i <= random; i++) {

			sum = sum + i; // sum += i;
		}
		System.out.println("1부터 10 사이의 랜덤값의 합 : " + sum);
	}

	public void method4() {
		// 분기문 : break (반복문 종료시키는 분기문)
		// 1 ~ 100 사이의 랜덤값을 추출하여
		// 해당 랜덤 값이 짝수일 때 반복문 종료 (종료 전 "종료" 출력).
		// 홀수일 때는 해당 값을 출력.
		/*
		 * int random = (int)(Math.random() * 100 + 1); int i = 1; for (;;) {
		 * 
		 * i++; if(i % 2 == 0) { System.out.println("종료"); break; } else {
		 * System.out.println(i % 2 == 1); } }
		 */

		while (true) {

			int random = (int) (Math.random() * 100 + 1);
			if (random % 2 == 0) {
				System.out.println("종료" + random);
				break;
			}
			System.out.println("랜덤값 : " + random);
		}
	}

	public void method5() {
		// 1부터 10까지 정수 중에 짝수만 출력
		// *continue : 반복문 내에서 실행되면 뒤에 코드를 무시하고 증감식이나 조건식으로 이동
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) {  // i % 2 !=0
				continue;
			}
			System.out.println(i + "출력");
		}
	}
}

/*
 * int i = 1; while(i <=10;){ if(1%2==1){ continue; }
 * System.out.println(i+"출력"); }
 */

		//예제 : for (int i = 1;; i++) {
		//			System.out.println(i + "출력");
		//	
		