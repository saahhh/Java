package com.kh.practice4.for문;

import java.util.Scanner;

public class Practice6 {

	public static void main(String[] args) {
		/*
		 
		*/

		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 입력하세요");
		int start = sc.nextInt();
		
		System.out.println("두번째 숫자를 입력하세요");
		int end = sc.nextInt();
		
		//그 사이의 숫자를 모두 출력
		
		System.out.println(start + " 부터" + end + "까지 숫자");
		for (int i = start; i <= end; i++) {
			System.out.println(i);
		
			
		
		}
	}

}
