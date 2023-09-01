package com.kh.practice5.Array;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("양의 정수");
		int num = sc.nextInt();
		int i = num;
		for(i = 1; i <= num; i++) {
			System.out.print(i + " ");
		}

	}

}
