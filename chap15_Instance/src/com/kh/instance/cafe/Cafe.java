package com.kh.instance.cafe;

public class Cafe {
	private String type; //음료종류
	private int size; //음료사이즈
	private boolean isSugar; //설탕여부
				//String t, int s, boolean is 로도 가능
	public Cafe(String type, int size, boolean isSugar) {
		this.type = type;
		this.size = size;
		this.isSugar = isSugar;
		
	}
	public void CafeMenu() {
		System.out.println(type + "을 주문합니다.");
		System.out.println(size + "사이즈 입니다");
		if (isSugar) {
			System.out.println("설탕을 추가합니다");
		} else {
			System.out.println("설탕을 추가하지 않습니다.");
		}
	}
}
