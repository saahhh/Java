package com.kh.practice4.for문;

import java.util.Scanner;

public class Practice5 {

	public static void main(String[] args) {
		/*
		1부터 사용자에게 입력 받은 수까지의 정수들의 합을 출력하세요.
			ex.
			정수를 하나 입력하세요 : 8
			1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 = 36
		*/ 

		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		int sum = 0; //sum의 초기값을 0으로 준다
		for(int  i = 1; i <= num; i++) {
			sum += i; //1+2+3+4+5
			//System.out.println("sum : "+sum);
		
		}
			System.out.println("1부터 "+ num + "" );		
		
	}

}
