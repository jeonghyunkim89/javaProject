package com.kh.practice1;

import java.util.Scanner;

public class OperationPractice2 {

	public static void main(String[] args) {
		
		// Q.키보드로 가로, 세로 값을 실수형으로 입력받아 사각형의 면적과 둘레를 계산하여 출력하세요.
		// 계산공식) 면적 : 가로 * 세로 
		//		   둘레 : (가로 + 세로) * 2
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 : ");
		double dNum1 = sc.nextDouble();
		
		System.out.print("세로 : ");
		double dNum2 = sc.nextDouble();
		
		System.out.println("면적 : " + (dNum1 * dNum2));
		System.out.println("둘레 : " + ((dNum1 + dNum2) * 2));
		
		System.out.printf("면적 : %.2f\n", dNum1 * dNum2);
		System.out.printf("둘레 : %.1f", (dNum1 + dNum2)*2);
	}
}