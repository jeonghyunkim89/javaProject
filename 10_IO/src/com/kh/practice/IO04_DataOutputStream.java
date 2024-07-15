package com.kh.practice;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO04_DataOutputStream {

	public static void main(String[] args) {

		// 출력 파일 객체 생성
		File f = new File("./resources", "DataSample.txt");
		
		//데이터 출력 스트림 선언
		DataOutputStream dos = null;
		try {
		//스트림 생성
			//파일 출력 스트림 --> 버퍼 출력 스트림 --> 데이터 출력 스트림
		dos = new DataOutputStream(
				new BufferedOutputStream(
						new FileOutputStream(f)));
		//데이터 출력
		dos.write(83);	//아스키코드
		
		dos.writeBoolean(true);		//1B
		dos.writeChar('J');			//2B
		dos.writeDouble(3.141592);	//8B
		dos.writeInt(369);			//4B
		
		dos.flush();
		
		} catch(FileNotFoundException e) {
			System.out.println("[ERROR] 파일을 찾을 수 없습니다. 오타를 확인하세요!");
		} catch(IOException e) {
			System.out.println("[ERROR] 입출력 오류 발생!.. 관리자 호출!!");
		} finally {
			try {
				dos.close();
			} catch(IOException e) {
				System.out.println("[ERROR] 자원반납 실패!");
			}
		}
		}

}
