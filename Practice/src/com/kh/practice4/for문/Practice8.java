package com.kh.practice4.for��;

import java.util.Scanner;

public class Practice8 {
		public static void main(String[] args) {
		
		/*
		 ����ڷκ��� �Է� ���� ������ ���� ����ϼ���.
			ex.
			���� : 4
			===== 4�� =====
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
		
		System.out.println("���� : ");
			int num = sc.nextInt();
		System.out.println("===== " + num + "�� =====");
		
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