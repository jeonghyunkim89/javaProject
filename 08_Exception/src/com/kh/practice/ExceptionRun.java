package com.kh.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionRun {

	public static void main(String[] args) {
		//exceptionTest1();
		//exceptionTest2();
		//exceptionText3();
		
		System.out.println("-----1-----");

		try {
			exceptionText3();
		} catch (ValueLengthException e) {
			System.out.println("-----5------");
			e.printStackTrace();
			//e.getMessage();
		}
		System.out.println("-----6-----");
		}
		/*
		 * 1. ArithmeticException, InputMismatchException
		 * 		사용자로부터 2개의 정수를 입력받고
		 * 		첫번째로 입력된 값이 두번째 입력된 값의 배수인지 확인하여
		 * 		배수인 경우에는 "x는 x의 배수입니다." 출력
		 * 		배수가 아닌 경우에는 " x는 x의 배수가 아닙니다." 출력
		 * 		(프로그램이 정상적으로 종료될 수 있도록 시작지점에 "-----start-----")
		 * 									마지막지점에 "-----end-----"출력
		 */
	
		public static void exceptionTest1() {
			System.out.println("-----start-----");
			Scanner sc = new Scanner(System.in);
			
			try {
				System.out.print("첫 번째 정수 : ");
				int a = sc.nextInt();
				System.out.print("두 번째 정수 : ");
				int b = sc.nextInt();
			
				if (a%b == 0) {
					System.out.println(a+"는"+b+"의 배수입니다.");
				} else { 
					System.out.println(a+"는"+b+"의 배수가 아닙니다.");
				}
			} catch(ArithmeticException e) {	//java.lang 경로에 있어서 import생략
				e.printStackTrace();
			} catch(InputMismatchException e) {	//java.lang 경로에 있어 import필요
				e.printStackTrace();
			}
					System.out.println("-----end-----");
		}
		/*
		 * NegativeArraySizeException, ArrayIndexOutOfBoundsException
		 * 	-5 ~ 5 사이의 난수를 발생시켜 해당 난수크기로 배열을 생성한 후에
		 * 	1부터 배열 크기만큼 1씩 증가시키면서 값을 저장한 후 출력
		 * 	(프로그램이 정상적으로 종료되는 것을 확인하기 위해 처음과 끝에 "start", "end"출력)
		 */
		public static void exceptionTest2() {
			System.out.println("-----start-----");
			try {	//try : 예외발생을 관찰하는 영역
				int random= (int)(Math.random()*11+(-5));
				int[]arr = new int[random];
				for(int i=0; i<arr.length; i++) {
				//Math.random() * (끝값 - 시작값 + 1) + 시작값
				arr[i]=i+1;
				System.out.println("arr[]="+arr[i]);			
			}
			}catch(NegativeArraySizeException | ArrayIndexOutOfBoundsException e) {
				//catch : 작성한 예외(Exception) 발생 시 잡아서 중괄호({})안에서 처리하겠다
				e.printStackTrace();
			}
			System.out.println("-----end-----");
		}
		
		/*
		 * [사용자정의예외클래스 만들기]
		 * - Exception 클래스 상속
		 * - 생성자 (기본 / 매개변수1개 -> msg:String)
		 * 사용자에게 입력받은 값의 길이가 3 이하인 경우 예외를 발생시키기!
		 * - 클래스명 : ValueLengthException
		 * - main 메소드에서 예외처리
		 */
		public static void exceptionText3() throws ValueLengthException{
			System.out.println("-----2-----");
			Scanner sc = new Scanner(System.in);
			String value = sc.nextLine();
			
			//value 변수의 값의 길이가 3이하인 경우 예외 발생
			//throw new 예외 클래스명(); //예외클래스 객체 생성
			//발생시킨 메소드 헤드부분에 throws예외클래스명 추가
			if(value.length()<=3) {
				System.out.println("-----3-----");
				throw new ValueLengthException("입력된 길이가 3이하입니다. 4글자 이상 입력하세요.");
			}
			System.out.println(value);
			System.out.println("-----4-----");
		}
	}
