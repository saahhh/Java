package com.kh.switchsample;

import java.util.Scanner;

public class SwitchScanner {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	//Scanner sc = new Scanner(System.in); 입력 후 Scanner 커서 올리면 import java.util.Scanner; 가 위에 출력됨
	
	
	/*System.out.println("과일을 선택해주세요.");
	//int fruit =
	int fruit = sc.nextInt();
	
	switch (fruit) {
		case 1:
		System.out.println("사과");
		break;
		case 2:
		System.out.println("포도");
		break;
		case 3:
			System.out.println("잘못된 선택입니다.");
	}
	*/
	
	
	//scanner를 이용해서 과자를 선택하는 switch를 하나 만들어주세요
	
	System.out.println("과자를 선택해주세요. 1.촉촉한 초코칩 2.꼬깔콘 3.포페토칩");
	
	int snack = sc.nextInt();

	switch (snack) {
		case 1:
		
		case 2:
		
		case 3:
			System.out.println("포테토칩");
			break;
		default:
			System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
			
	}
	
	
	
	/*	System.out.println("주문하실 번호를 선택해주세요");
		System.out.println("1. 아메리카노");
		System.out.println("2. 카페 라떼");
		System.out.println("3. 바닐라 라떼");
		
		int choice = sc.nextInt();
		
		switch (choice) {
		case 1:
			System.out.println("아메리카노 주문하셨습니다.");
			break;
		case 2:
			System.out.println("카페 라떼 주문하셨습니다");
			break;
		case 3:
			System.out.println("바닐라 라떼");
			break;
		default : 
			System.out.println("잘못된 선택입니다. 다시 주문해주세요.");
			
		}
*/
		
	}

}
