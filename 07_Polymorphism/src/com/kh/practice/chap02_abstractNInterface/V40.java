package com.kh.practice.chap02_abstractNInterface;

public class V40 extends SmartPhone implements NotePen {
	
	public V40() {
		setMaker("LG");
	}
	
	public String makeCall() {
		return "번호를 누르고 통화버튼을 누름";
	}
	public String takeCall() {
		return "수신 버튼을 누름";
	}
	public String picture() {
		return "1200만, 1600만 화소 트리플 카메라";
	}
	public String charge() {
		return "고속 충전, 고속 무선 충전";
	}
	public String touch() {
		return "정전식";
	}
	public boolean bluetoothPen() {
		return !PEN_BUTTON;
	}
	public String printInformation() {
		return String.format("V40은 %s에서 만들어졌고 제원은 다음과 같다.\n"
				+"%s\n%s\n%s\n%s\n%s\n"
				+"블루투스 펜 탑재 여부 : %b",
				getMaker(), makeCall(), takeCall(), picture(), charge(), touch(), bluetoothPen());
		
		/*
				"V40은 "+getMaker()+"에서 만들어졌고 제원은 다음과 같다.\n"
				 +makeCall()+"\n"
				 +takeCall()+"\n"
				 +picture()+"\n"
				 +charge()+"\n"
				 +touch()+"\n"
				 +"블루투스 펜 탑재 여부 : "+bluetoothPen();
				 */
	}

}
