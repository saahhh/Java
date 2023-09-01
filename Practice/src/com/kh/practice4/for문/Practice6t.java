package com.kh.practice4.for문;

import java.util.Scanner;

public class Practice6t {

	public static void main(String[] args) {
		
	/*
        사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
       
       		ex.
			첫 번째 숫자 : 8 첫 번째 숫자 : 4 첫 번째 숫자 : 9
			두 번째 숫자 : 4 두 번째 숫자 : 8 두 번째 숫자 : 0
			4 5 6 7 8 4 5 6 7 8
     */
		Scanner sc = new Scanner(System.in);
   	
		//사용자로부터 두 개의 값을 입력 받아
		System.out.println("첫 번째 숫자를 입력해주세요 : ");
   		int start = sc.nextInt();
   	
   		System.out.println("두 번째 숫자를 입력해주세요 : ");
   		int end = sc.nextInt();
   	
   		// 그 사이의 숫자를 모두 출력
   		System.out.println(start + " 부터 "+ end + "까지 숫자");
   		for (int i = start; i <= end; i++ ) {
   		System.out.println(i);
   	}
	}
}
