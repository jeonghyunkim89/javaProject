package com.kh.practice.snack.controller;

import com.kh.practice.snack.model.vo.*;

public class SnackController {
	//필드부(변수)
	private Snack s = new Snack();
	//생성자부
	public SnackController() {}
	
	public String saveData (String kind, String name, String flavor, int numOf, int price) {
		s.setKind(kind);
		s.setName(name);
		s.setFlavor(flavor);
		s.setNumOf(numOf);
		s.setPrice(price);
		return "저장 완료되었습니다.";
		}
	
	public String confirmData() {
		return s.information();
			
	}
	
}
