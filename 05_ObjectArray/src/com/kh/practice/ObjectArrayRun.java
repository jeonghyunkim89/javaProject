package com.kh.practice;

import java.util.Scanner;

public class ObjectArrayRun {

	public static void main(String[] args) {

		//객체배열 : 여러개의 객체를 배열로 관리
		//여러명의 학생을 배열로 관리한다면
		//크기가 3인 정수형 배열
		int[]arr = new int[3];
		//반복문을 사용하여 1~3까지 저장
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
			System.out.println(arr[i]);
		}
		//------------------------
		// 크기가 3인 Student 타입의 배열
		Student[]sArr = new Student[3];
		Scanner sc = new Scanner(System.in);
		//반복문을 사용하여 입력된 정보를 각 위치에 저장
		for(int i=0; i<sArr.length; i++) {
			//이름, 나이, 성별을 입력받아 변수에 저장
			System.out.print("이름 : ");
			String name = sc.next();
			
			System.out.print("나이 : ");
			int age = sc.nextInt();
			
			System.out.print("성별 : ");
			char gender = sc.next().charAt(0);
			
			//i번째 위치에 Student 객체 생성하여 할당
			sArr[i] = new Student(name, age, gender);
			
			sArr[i].info();
		}
		sArr[1].info();
		//sArr[2]=null; 을 쓰게 되면 인덱스 2번위치의 객체를 삭제
	}

}
