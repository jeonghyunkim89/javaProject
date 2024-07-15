package com.kh.practice.list;

import java.util.ArrayList;

public class MyStack {
	
	/*
	 * 스택(Stack) : LIFO (Last In First Out)
	 * 				제일 마지막에 저장된 데이터가 제일 처음으로 꺼내올 수 있는 구조
	 *  - 데이터 추가 : 순서대로 추가 (끝에 추가)
	 *  - 데이터 제거 : 마지막 위치부터 제거
	 */
	
	/*
	 * --------------------
	 * MyStack
	 * --------------------
	 * - arrStack : ArrayList<String> = new ArrayList<>();
	 * --------------------
	 * + push(data:String):void		//데이터 추가
	 * + pop():String				//데이터 제거
	 * 								//isEmpty() => 데이터가 없을 경우 "리스트가 비었습니다." 반환
	 * 								//remove() => arrStack(리스트)에서 데이터 제거 후 해당 데이터를 반환
	 * -------------------- 
	 */

	private ArrayList<String> arrStack = new ArrayList<>();
	
	public void push (String data) {
		arrStack.add(data);
	}
	
	public String pop() {
		if(arrStack.isEmpty()) {	//리스트가 비어있다면 "리스트가 비었습니다" 반환
			return "리스트가 비었습니다.";
		}
		//그렇지 않은 경우 리스트의 마지막 인덱스(위치)의 데이터 반환
		//remove(index) : 해당 index위치의 데이터를 제거하면서 해당 데이터 반환
		return arrStack.remove(arrStack.size()-1);
	}
}
