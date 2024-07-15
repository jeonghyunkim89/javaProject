package com.kh.practice;

interface Inter1<T>{
	/*public abstract*/void method1(T data);
}

interface Inter2<F>{
	void method2(F data);
}

class DataClass04<E> implements Inter1<E>, Inter2<E> {
	//void method1(E date);
	//void method2(E date);
	public void method1(E date) {
		System.out.println(date);
	}
	//void method2(E date); ---> 오버라이딩
	public void method2(E data) {
		System.out.println(data);
	}
}

public class GenericImplRun {

	public static void main(String[] args) {
		//DataClass04 객체를 생성해서
		//"좋아하는 색은" --> method1 사용, "xxx다" --> method2사용
		DataClass04<String> dc = new DataClass04<>();
		dc.method1("좋아하는 색은");
		dc.method2(" 파랑색이다.");
		
		DataClass04<Integer> dc1 =  new DataClass04<>();
		dc1.method1(10000);
		dc1.method2(121212);
		
		DataClass04<Double> dc2 =  new DataClass04<>();
		dc2.method1(1.0000);
		dc2.method2(3.1414);		
	}
	
	

}
