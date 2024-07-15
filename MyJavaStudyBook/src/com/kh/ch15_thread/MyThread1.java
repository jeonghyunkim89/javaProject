package com.kh.ch15_thread;

import java.util.Date;

/*
 * 스레드 정의방법 1. Thread클래스 상속
 */
public class MyThread1 extends Thread {

	@Override
	public void run() {
		// 현재 실행 중인 스레드의 정보 : Thread.currentThread()
		String name = Thread.currentThread().getName();
		
		for(int i=0; i<10; i++) {
			try {
				System.out.println(name + " : " + new Date().getTime());
				//3초간 재우기 .. sleep(millis)
				Thread.sleep(3*1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		System.out.println(name+":----------END---------");
	}
	

	
	
}
