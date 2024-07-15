package com.kh.practice1;

import java.util.Scanner;

public class OperationPractice3 {

	public static void main(String[] args) {
		
		// Q. 실수형으로 국어, 영어, 수학 세 과목의 점수를 입력받아
		//	총점과 평균을 출력하세요. 이때 총점과 평균은 정수형으로 처리
		
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 : ");
		double dNum1 = sc.nextDouble();
		System.out.println("영어 : ");
		double dNum2 = sc.nextDouble();
		System.out.println("수학 : ");
		double dNum3 = sc.nextDouble();
		
//		 선생님 답변 int total = (int)(dNum1 + dNum2 + dNum3);
//		 System.out.println("총점 : " + total);
//		 System.out.println("평균 : " + total/3);
		
		System.out.println("총점 : " + (int)(dNum1 + dNum2 + dNum3));
		System.out.println("평균 : " + (int)((dNum1 + dNum2 + dNum3) / 3) );
		System.out.printf("총점 : %d\n", (int)(dNum1 + dNum2 + dNum3));
		System.out.printf("평균 : %d", (int)((dNum1 + dNum2 + dNum3) / 3));
		
	}
}
