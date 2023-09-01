package com.kh.practice4.for문;

import java.util.Scanner;

public class Practice8 {
		public static void main(String[] args) {
		
		/*
		 사용자로부터 입력 받은 숫자의 단을 출력하세요.
			ex.
			숫자 : 4
			===== 4단 =====
			4 * 1 = 4
			4 * 2 = 8
			4 * 3 = 12
			4 * 4 = 16
			4 * 5 = 20
			4 * 6 = 24
	 		4 * 7 = 28
	 		4 * 8 = 32
			4 * 9 = 36
 
		 */	
			
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 : ");
			int num = sc.nextInt();
		System.out.println("===== " + num + "단 =====");
		
		for (int i = 1; i <= 9; i++) {
			System.out.println(num + " * " + i + " = " + num * i);
		}
		
		//
		
			/*int num2 = ;
		for (int i = 1 ; i > 9; i++) {
			int result = 0;
			System.out.println(num1 + " * " + num2 + " = " + result);
		}*/
		
		
		/*
		int result = 0;
		for (int i = 0; i < num1; i++) {
			result += num1;
			System.out.println(num1);*/
		}	
	 }