package com.kh.practice.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPServer {
	
	/*
	 * TCP (Transmission Control Protocol)
	 * : 서버와 클라이언트의 1:1 통신
	 * : 데이터 교환 전 서버와 클라이언트가 연결되어야 함
	 *  (연결 전에는 서버가 먼저 실행되어 있어야 함 --> 클라이언트가 요청할 수 있음)
	 * : 신뢰성 있는 데이터를 전달 가능
	 * 
	 * - 소켓(Socket) : 네트워크 상 통신할 때 통로 역할
	 * 	 Input / OutputStream 을 가지고 있음 (입출력시 사용)
	 * 	 *ServerSocket : 설정된 포트로 프로그램이 실행되어 외부의 연결 요청을 대기하다
	 * 					 요청이 들어오면 수락(통신할 수 있는 socket을 생성)하는 용도
	 * 
	 */
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		// 1) 포트 번호 정의 
		int port = 3000;
		ServerSocket server = null;
		BufferedReader stream = null;
		PrintWriter pw = null;
		
		try {
			// 2) 서버용 소켓 객체 생성
			server = new ServerSocket(port);
			//-------------클라이언트 요청 대기--------------
			System.out.println("---- 요청 대기 중 ----");
			//3) 연결 요청 시 수락 후 해당 클라이언트와의 통신 준비(Socket객체 생성)
			Socket socket = server.accept();
			System.out.println(socket.getInetAddress().getHostAddress()+"로부터의 연결 요청...");
			//4) 클라이언트와의 입출력을 위한 스트림 생성
			//	+입력용 스트림 : 클라이언트로부터 데이터를 입력받는 용도
			stream = new BufferedReader(
									new InputStreamReader(
											socket.getInputStream()
											)
									);
			// + 출력용 스트림 : 클라이언트에게 전달된 데이터를 출력하기 위한 용도
			pw = new PrintWriter(socket.getOutputStream());
			
			while(true) {
				
				//클라이언트로부터 입력받기
				String message = stream.readLine();		//한 줄씩 입력 받기
				System.out.println(socket.getInetAddress().getHostAddress()+":"+message);
				
				//클라이언트에게 출력하기
				System.out.print("답변 : ");
				String sendMessage = sc.nextLine();
				
				pw.println(sendMessage);
				pw.flush();
			}
			
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try{
				if(pw != null) pw.close();
				if(stream != null) stream.close();
				if(server != null) server.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
