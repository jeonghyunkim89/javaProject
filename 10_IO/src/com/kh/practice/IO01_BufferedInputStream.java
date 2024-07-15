package com.kh.practice;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IO01_BufferedInputStream {

	public static void main(String[] args) {

		// 파일 객체 생성
		File f = new File("./resources", "src.txt");

		System.out.println("file check : " + f.exists());

		// 파일 입력 스트림 객체 생성
		FileInputStream fis = null; // 기반 스트림 -> 입출력 장치에 직접 연결
		BufferedInputStream bis = null; // 보조 스트림 -> 기반스트림에 연결되어 보조하는 스트림

		byte[] buf = new byte[1024]; // 입력 데이터 저장 변수 (버퍼)
		int len = -1; // 입력 데이터 길이

		try {
			// 파일 입력 스트림 객체 생성
			fis = new FileInputStream(f); // File ---> FileInputStream
			bis = new BufferedInputStream(fis); // FileInputStream ---> BufferedInputStream

			// 파일 입력 --> 파일로부터 데이터를 입력받기
			while ((len = bis.read(buf)) != -1) {
				System.out.println(new String(buf, 0, len));
				// new String(buf:byte[], offset:int, length:int)변환 시
				// byte[1024]배열에서 1024개의 요소를 전부 변환
				// => 단, 입력받은 길이만큼 변환하기 위해 offset을 0으로 설정하고
				// length 값은 데이터 길이(len)으로 지정
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 스트림 자원 반납 시 생성 역순으로..!!
			try {
				if (bis != null)
					bis.close();
				if (fis != null)
					fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
