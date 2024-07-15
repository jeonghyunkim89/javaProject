package com.kh.ch12_IO;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StreamUtils {
	/*
	 * 보조 스트림 : 기반 스트림만으로 부족한 성능을 향상시켜주는 스트림
	 * 			  기반 스트림에서 제공되는 메소드 외에 추가적인 메소드 제공(데이터 전송 속도를 향상)
	 * 
	 * 출력 : 프로그램 ---> 외부매체(파일)
	 */
	public void objectSave(String filename, Object[] objs) {
		// FileOutputStream		: 파일에 연결하여 1바이트 단위로 출력할 수 있는 기반스트림
		// ObjectOutputStream	: 객체 단위로 출력할 수 있도록 도와주는 보조스트림 (ObjectWriter는 없음)
		
		//try ~ with ~ resource문 : 자원관리가 자동으로 되는 예외처리 구문
		try(ObjectOutputStream oos = new ObjectOutputStream( new FileOutputStream(filename) )){
			
			for(Object o : objs) {
				oos.writeObject(o);		//객체 데이터를 출력하는 메소드
			}
			
		} catch (IOException e) {
			System.out.println("객체 데이터를 파일에 저장 중 문제 발생!! :: "+e.getMessage());
			//e.printStackTrace();
		}
	}
	
	// 입력 : 외부매체(파일) --> 프로그램 
	public void objectRead(String filename) {
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))){
			
			while(true) {
				System.out.println(ois.readObject());
				//=> 파일 데이터를 모두 읽은 경우 예외 발생! --> EOFException
			}
		} catch(EOFException e) {
			System.out.println("===== 파일 읽기 완료 =====");
		} catch (IOException e) {
			System.out.println("객체 데이터를 일어오는 중 문제 발생!! ::"+e.getMessage());
			//e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
}
