package com.kh;

public class VariablePractice0 {
	
	public static void main(String[] args) {
		
		/*
		 * 예제 1) 변수를 사용하여 아래 코드를 이해하기 쉽도록 변경해보기.
		 * - 연도에 해당하는 값을 정수형(int) 타입의 year 이름의 변수로 선언
		 * - 현재 연도를 year 변수에 대입
		 * 
		 * - 나이에 해당하는 값을 정수형(int) 타입의 age 이름의 변수로 선언 및 대입
		 */
		//변수를 사용하지 않은 경우
		System.out.println("[1] 현재 2024년이고, 올해 20살입니다.");
		//변수 선언 및 대입
		int year = 2024; int age = 20;
		// 정수형 변수 year이라는 이름으로 선언하여 year변수에 2024라는 값을 대입
		//정수형 변수 age라는 이름으로 선언 및 20이라는 값을 대입
		//변수를 사용하여 화면에 출력(println/printf사용)
		System.out.println("[1] 현재 " + year + "년이고, 올해 " + age + "살입니다." );
		System.out.printf("[1] 현재 %d년이고, 올해 %d살입니다.\n", year, age);
		//---------------------------------------------------------
		/*
		 * *변수명 명명규칙*
		 * - 카멜케이스 : 소문자로 시작하고, 다음 단어의 첫글자를 대문자로 작성하는 방법
		 * - 숫자로 시작하면 안된다.
		 * - 특수문자는 '_'와 '$'만 사용 가능하다.
		 * - 예약어는 사용할 수 없다. (예약어: 이미 정의되어 있는 단어들.. int/false/true/boolean 등)
		 * - 대소문자를 구분한다.
		 */
		//-----------------------------------------------------------
		/*
		 * *상수 : 변하지 않는 값을 저장하는 공간
		 *  - final 예약어를 사용
		 *  - 
		 */
		// ex) "몸무게가 80kg 이상인 경우 탑승을 못합니다." -> 상수명은 limit weight
		// 상수 선언
		final int LIMIT_WEIGHT = 80;
		//상수를 사용하여 메시지 출력
		System.out.println("몸무게가 " + LIMIT_WEIGHT + "kg이상인 경우 탑승을 못합니다.");
		
		//-------------------------------------------
				/*
				 * * 형변환 : 연산을 할 때 자료형의 종류가 다른 경우 형변환이 발생한다.
				 *  - 자동형변환 규칙
				 *    [1] 값의 범위가 작은 범위에서 큰 범위로 형변환 발생
				 *    [2] 정수형과 실수형의 연산 시에는 정수형에서 실수형으로 형변환 발생 
				 */
				int num1 = 10;
				double dNum1 = 5.5;
				
				// num1 변수가 자동형변환이 발생(int -> double)
				System.out.println(num1 + dNum1); //결과 => 15.5
				
				// dNum1 변수를 강제형변환. (double -> int)
				System.out.println(num1 + (int)dNum1); //결과 =>15
				
				// char <--> int : ASCII (아스키코드)
				char ch = 'A';
				System.out.println(ch); // 결과 => 'A'
				 
				System.out.println((int)ch); // 결과 => 65
				
				// Char (2byte) int (4byte)
				System.out.println(ch + 3); //결과 => 'A' -> 65 (자동형변환) 
											//		 65 + 3 => 68
				System.out.println((char)(ch + 3)); // 결과 => 'D'
				
	}

}
