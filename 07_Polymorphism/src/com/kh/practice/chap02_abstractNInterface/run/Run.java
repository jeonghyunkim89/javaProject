package com.kh.practice.chap02_abstractNInterface.run;

import com.kh.practice.chap02_abstractNInterface.PhoneController;

public class Run {

	public static void main(String[] args) {

		// PhoneController객체 생성하고 method() 호출 후 반환 값을 String 배열에 담고
		PhoneController pc = new PhoneController();
		String[] result = pc.method();
		// 반복문을 이용하여 String배열의 각 인덱스 출력
		for(int i=0; i<result.length; i++) {
			System.out.println(result[i]);
			
			//for(String info : r){
			//      System.out.println(info);
			//}
		}

	}

}
