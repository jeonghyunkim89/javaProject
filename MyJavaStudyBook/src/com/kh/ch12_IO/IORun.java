package com.kh.ch12_IO;

public class IORun {
	public static void main(String[]args) {
		/*
		 * * 입출력(IO) : 프로그램 상의 데이터를 외부매체로 출력하거나(프로그램 -> 외부매체)
		 * 				외부매체로부터 입력받아오는 과정(외부매체 -> 프로그램)
		 * 	--> 외부 매체와의 연결되는 통로역할 : 스트림
		 * 
		 * * 스트림 특징
		 * 	- 단방향 : 입력이면 입력만 / 출력이면 출력만 가능
		 * 			=> 입출력을 동시에 하고자 한다면, 입력용 스트림/ 출력용 스트림을 각각 사용
		 * 	- 선입선출(FIFO) : 통로를 파이프로 본다면 먼저 보낸 데이터가 먼저 나오게 됨!
		 * 
		 * * 스트림 종류
		 * 	- 크기 기준으로 구분한다면 (바이트-1byte / 문자-2byte)
		 * 		+ 바이트 스트림 : 1byte 크기의 데이터가 왔다갔다하는 통로
		 * 			입력용 -> InputStream / 출력용 -> OutputStream
		 * 		+ 문자 스트림 : 2byte 크기의 데이터가 왔다갔다하는 통로
		 * 			입력용 -> Reader		/ 출력용 -> Writer
		 * 	
		 *  - 외부매체와의 직접 연결유무
		 *  	+기반(기본) 스트림 : 외부 매체와 직접적으로 연결되는 통로
		 *  	+보조 스트림	  : 기반스트림을 보조하는 역할의 통로
		 *  					(속도를 향상시켜주거나, 다양한 기능을 제공하기 위한 역할)
		 *  					=> 단독 사용 불가! 반드시 기반스트림과 함께 사용
		 * 
		 */
		
		StreamUtils utils = new StreamUtils();
		
		Product[] products = new Product[3];
		products[0] = new Product("큐센", 10000);
		products[1] = new Product("독거미", 75000);
		products[2] = new Product("삼성", 20000);
		
		String filename = "keyboard.txt";
		utils.objectSave("keyboard.txt", products);
		utils.objectSave(filename, products);
		utils.objectRead(filename);
	}
}
