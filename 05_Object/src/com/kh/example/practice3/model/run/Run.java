package com.kh.example.practice3.model.run;

import com.kh.example.practice3.model.vo.*;

public class Run {

	public static void main(String[] args) {

		Circle c = new Circle();
		
		c.getAreaOfCircle();
		c.getSizeOfCircle();
		
		c.incrementRadius();
		
		c.getAreaOfCircle();
		c.getSizeOfCircle();
	}

}
