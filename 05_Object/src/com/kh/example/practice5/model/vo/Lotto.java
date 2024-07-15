package com.kh.example.practice5.model.vo;

import java.util.Arrays;

//import java.lang.* - Math.random()은 자바랭이기 때문에 생략가능

public class Lotto {
	//변수부(필드부)
	private int[] lotto;
	
	//초기화 블럭
	// int[] --> 정수형 1차원 배열 : 숫자 여러개
	// int   --> 정수형 : 숫자 한개
	{
		lotto = new int [6]; //6개 정수데이터를 담을 배열할당
		for(int i=0; i<lotto.length; i++) {
			//lotto배열의 i번째 위치에 랜덤값(1~45)을 저장
			lotto[i]=(int)(Math.random()*45+1); //java.lang에 있는 아이들은 import해주지 않음
			for(int j=0; j<i; j++) {
				if(lotto[i]==lotto[j]) {
					i--;
					break;
				}
			}
		}
	}
	//생성부
	public Lotto() {}
	//메소드부
	public int[] getLotto() {
		return lotto;
	}
	public void setLotto(int[]lotto) {
		this.lotto = lotto;
	}
	public void information() {
		// 정보출력 => 필드(변수)의 정보를 출력
		// Arrays.toString(배열명) : [값1, 값2, 값3, ...] 형식출력
		System.out.println(Arrays.toString(lotto));
		//향상된 for문 / foreach문 : 배열의 첫번째 위치부터 마지막 위치까지 순서대로 데이터에 접근
		//for(자료형 변수명 : 배열명) {} --> 자료형은 배열의 자료형과 일치해야함
		System.out.println("========================");
		for(int num : lotto) {
			System.out.print(num+", ");
		}
	}

}
