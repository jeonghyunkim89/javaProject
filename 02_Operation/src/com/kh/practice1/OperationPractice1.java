package com.kh.practice1;

import java.util.Scanner;

public class OperationPractice1 {

	public static void main(String[] args) {
		
		// Q.키보드로 정수 두 개를 입력받아 두 수의 합, 차, 곱, 나누기한 몫을 출력하세요.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫 번째 정수 : ");
		int n1 = sc.nextInt();
		
		System.out.println("두 번째 정수 : ");
		int n2 = sc.nextInt();
		
		// 더하기/빼기/곱하기/나누기몫 결과 출력
		System.out.println("더하기 결과 : " + (n1 + n2));
		System.out.println("빼기 결과 : " + (n1 - n2));
		System.out.println("곱하기 결과 : " + (n1 * n2));
		System.out.println("나누기 결과 : " + (n1 / n2));
	
	}
}
