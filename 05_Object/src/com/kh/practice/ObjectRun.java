package com.kh.practice;

public class ObjectRun {

	public static void main(String[] args) {
		//학생을 대상으로 프로그래밍을 해본다면
		//"학생을 객체로 선정!
		//정보 -> 학번, 이름, 나이, 성별
		//기능 -> 정보 조회
		
		//변수를 사용하여 학생의 정보를 관리한다면 ..
		int no1 = 100;			//학번
		String name1 = "임수진";	//이름
		int age1 = 20;			//나이
		char gender1 = '여';		//성별
				
		int no2 =  101;
		String name2 = "카리나";
		int age2 = 26;
		char gender2 = '여';
				
		int no3 = 102;
		String name3 = "엄희윤";
		int age3 = 30;
		char gender3 = '남';
		// => 너무 많은 변수가 사용되었다... 12개...
		// 배열을 사용해보자 (각 정보를 담을 배열)
		int[]noArr = {100, 101, 102};			//학번 정보를 담을 배열
		String[]nameArr = {"임수진", "카리나", "엄희윤"};	//이름 정보를 담을 배열
		int [] ageArr = {20,26,30};			//나이 정보를 담을 배열
		char[] genderArr = {'여', '여', '남'};		//성별 정보를 담을 배열
		
		//첫번째 학생 정보
		/*noArr[0]= 100;
		nameArr[0]="임수진";
		ageArr[0]=20;
		genderArr[0]='여'; */
		
		//클래스를 사용해보자(서로 다른 종류의 데이터를 한 공간에 저장)
		Student s1 = new Student();
		//s1.no = 100;
		//s1.name = "임수진";
		//s1.age = 20;
		//s1.gender = '여';
		
		Student s2 = new Student();
		//s2.no = 101;
		//s2.name = "카리나";
		//s2.age = 26;
		//s2.gender = '여';
		
		Student s3 = new Student("윈터");
		s3.getName();
		s3.setName("윈터2");
	}

}
