package com.kh.practice.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		//1)요청할 서버의 "IP주소", "port번호" 확인
		String ip = "192.168.10.29";
		int port = 3000;
		
		//사용되는 통로(소켓, 스트림)객체 선언 및 null로 초기화
		Socket socket = null;
		BufferedReader br = null;
		PrintWriter pw = null;
		
		//2)서버에 연결 요청(요청할 서버의 IP주소와 포트번호를 사용하여 소켓객체생성)
		try{
			socket = new Socket(ip, port);
			if(socket != null) {
				//서버 연결 성공!
				System.out.println("서버 : "+ip+":"+port+"로 연결 성공!");
				
				//*입력용 스트림
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
				//*출력용 스트림
				pw = new PrintWriter(socket.getOutputStream());
				
				//3)데이터 통신(스트림을 이용하여 입출력)
				while(true) {
					System.out.print("메시지 입력 : ");
					String message = sc.nextLine();
					
					// 서버 쪽으로 데이터 전달 (출력)
					pw.println(message);
					pw.flush();
					
					// 서버로부터 데이터를 받기 (입력)
					String receive = br.readLine();
					System.out.println("서버 응답 : "+receive);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(br != null) br.close();
				if(pw != null) pw.close();
				if(socket !=null) socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
