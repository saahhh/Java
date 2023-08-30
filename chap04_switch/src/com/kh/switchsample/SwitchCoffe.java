package com.kh.switchsample;

import java.util.Scanner;

public class SwitchCoffe {

	public static void main(String[] args) {
		// while문을 활용한 switch
		
		Scanner scanner = new Scanner(System.in);
		
		int choice;
		boolean isChoice = false;
		
		while (!isChoice) { //조건문이 참인 동안 코드 블록을 반복적으로 실행
			System.out.println("커피를 주문해주세요. 1. 아메리카노 2. 카페라떼 3. 홍차");
			
			choice = scanner.nextInt();
		
		switch (choice) {
			case 1:
				System.out.println("아메리카노 주문");
				isChoice = true;
			case 2:
				System.out.println("카페라떼 주문");
				isChoice = true;
			case 3:
				System.out.println("홍차");
				isChoice = true;
			default : 
				System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
		}
		
		}
		
	
	}

}
