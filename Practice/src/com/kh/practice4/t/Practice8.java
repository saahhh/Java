package com.kh.practice4.t;

import java.util.Scanner;

public class Practice8 {
		public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¼ýÀÚ : ");
			int num = sc.nextInt();
		System.out.println("===== " + num + "´Ü =====");
		
		for (int i = 1; i <= 9; i++) {
			System.out.println(num + " * " + i + " = " + num * i);
		}
		
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