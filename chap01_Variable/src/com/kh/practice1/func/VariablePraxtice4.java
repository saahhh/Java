package com.kh.practice1.func;

import java.util.Scanner;
public class VariablePraxtice4 {
	public static void main (String[] args) {
		
	Scanner sc = new Scanner(System.in)
			;		
		String str = "apple";
		char chr = 'a';
		char chr2 = 'p';
		char chr3 = 'p';
		
		System.out.print("문자열을 입력하세요.");
		str = sc.next();
		System.out.println(str);
		
		System.out.print("첫 번째 문자 : ");
		System.out.println(chr);
		System.out.print("두 번째 문자 : ");
		System.out.println(chr2);
		System.out.print("세 번째 문자 : ");
		System.out.println(chr3);
			
	}
}