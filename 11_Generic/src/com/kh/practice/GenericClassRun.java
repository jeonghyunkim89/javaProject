package com.kh.practice;

//정수형 데이터를 다루는 클래스 : DataClass
/*
public class GenericClassRun {

	public static void main(String[] args) {
		DataClass d1 = new DataClass();
		d1.setData(1000);
		double data = d1.getData();
		System.out.println(data);
	}
		
		class DataClass{
			private int data;
			
			public int getData() {
				return data;
			}
			
			public void setData(int data) {
				this.data = data;
			}
		}
	
//정수형, 실수형 모두 관리하고자 할 때 ==> 실수로 인해 오류 발생할 수 있음!
				class DataClass{
					private Object data;
					
					public Object getData() {
						return data;
					}
					
					public void setData(Object data) {
						this.data = data;
					}
				}*/	

class DataClass<T>{
	private T data;			//필드의 타입(자료형)
	
	public T getData() {	//메소드 반환타입
		return data;
	}
	
	public void setData(T data) {	//메소드의 매개변수 타입
		this.data = data;
	}
}
public class GenericClassRun {

	public static void main(String[] args) {
		DataClass<Double> d1 = new DataClass<Double>();
		d1.setData(new Double(1000));
		double data = d1.getData();
		System.out.println(data);
		
		DataClass<Integer> d2 = new DataClass<>();
		d2.setData(1000);
		System.out.println(d2.getData());
	
		DataClass<String> d3 = new DataClass<>();
		d3.setData("Apple");
		System.out.println(d3.getData());
	}
}


