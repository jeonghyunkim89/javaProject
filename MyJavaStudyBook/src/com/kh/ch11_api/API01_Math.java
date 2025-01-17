package com.kh.ch11_api;

public class API01_Math {
	
	public static void main(String[] args) {
		System.out.println("===== java.lang.Math =====");
		
		// abs : 절대값을 구해주는 메소드
		int n =100;
		System.out.println("-10ml 절대값 : "+Math.abs(-10));
		System.out.println(n+"의 절대값 : "+Math.abs(n));
		
		// ceil : 소숫점을 올림처리 해주는 메소드
		double d = 3.141592;
		System.out.println(d+"의 값을 올림처리 : "+Math.ceil(d));
		
		// round : 소숫점을 반올림처리 해주는 메소드
		System.out.println(d+"의 값을 반올림 처리 : "+Math.round(d));
		
		// floor : 내림(버림)처리 해주는 메소드
		System.out.println(d+"의 값을 내림 처리 : "+Math.floor(d));
	
		// rint : 가장 가까운 정수값을 알아낸 후 실수형으로 반환해주는 메소드
		System.out.println(d+"의 값에 가까운 정수(-> 실수형) : "+Math.rint(d));
		System.out.println("3.7의 값에 가까운 정수(-> 실수형) : "+Math.rint(3.7));
		System.out.println("3.5의 값에 가까운 정수(-> 실수형) : "+Math.rint(3.5));
	
		// sqrt : 제곱근(루트) 값을 구해주는 메소드
		System.out.println("제곱근 : "+Math.sqrt(5));
		System.out.println(2.23606797749979*2.23606797749979);
		
		// pow : 제곱값을 구해주는 메소드
		System.out.println("2의 10제곱 : "+Math.pow(2, 10)); //2의 10제곱(승)
		System.out.println("---------------------------------");
		// 2의 1승 ~ 2의 10승까지 출력
		for (int i=1; i<11; i++) {
			System.out.println("2의 "+i+"제곱 : "+Math.pow(2, i));
		}
		//------------------------------------------------------
	
	}
}
