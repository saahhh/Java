package com.kh.mvc.person.vo;

import java.util.Scanner;

public class PersonView {
	//클라이언트가 넣을 값
	public String getUserInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요.");
		return sc.nextLine();
	}
	//계산된 값
	public void displayInfo(String result) {
		System.out.println("결과 : " + result);
		
	}
}
