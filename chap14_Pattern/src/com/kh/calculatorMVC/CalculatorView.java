package com.kh.calculatorMVC;

import java.util.Scanner;

public class CalculatorView {
	//클라이언트가 넣을 값
	public int getUserInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		return sc.nextInt();		
	}	
		//계산된 값
		public void displayResult(int result) {
			System.out.println("결과 : "  + result);
		}
}
