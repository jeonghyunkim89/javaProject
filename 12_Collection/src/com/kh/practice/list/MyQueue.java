package com.kh.practice.list;

import java.util.ArrayList;

public class MyQueue {
	
	/*
	 * 큐(Queue) : FIFO(First In First Out)
	 * 				처음 저장된 데이터가 가장 먼저 꺼내올 수 있는 구조
	 *  - 데이터 추가 : 순서대로 추가
	 *  - 데이터 제거 : 처음 위치부터 제거
	 *  
	 *  ---------------------------
	 *  MyQueue
	 *  ---------------------------
	 *  -queue : ArrayList<String> = new ArrayList<>();
	 *  ---------------------------
	 *  +enQueue(data:String) : void
	 *  +deQueue() : String
	 *  ----------------------------
	 *  
	 */
	
	private ArrayList<String> queue = new ArrayList<>();
	
	public void enQueue(String data) {
		queue.add(data);
		
	}
	public String deQueue() {
		if(queue.isEmpty()) {	//리스트가 비어있다면 "리스트가 비었습니다" 반환
			return "큐가 비었습니다.";
		}
		//그렇지 않은 경우 리스트의 마지막 인덱스(위치)의 데이터 반환
		//remove(index) : 해당 index위치의 데이터를 제거하면서 해당 데이터 반환
		return queue.remove(0);
			
	}

}
