package com.kh.practice.test2;

public class Task2 extends Thread {

	@Override
	public void run() {
		try {
			//1~30까지 홀수만 출력
			for(int i=1; i<31; i++) {
				if(i%2==1) {
					System.out.println(Thread.currentThread().getName()+":"+i);
				}
				//출력 후 0.1초 재우기
				Thread.sleep(100);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}