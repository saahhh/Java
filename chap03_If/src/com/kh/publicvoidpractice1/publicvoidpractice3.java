package com.kh.publicvoidpractice1;

import java.util.Scanner;

public class publicvoidpractice3 {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 : ");
		int num1 = sc.nextInt();
		System.out.print("수학점수 : ");
		int num2 = sc.nextInt();
		System.out.print("영어점수 : ");
		int num3 = sc.nextInt();

		if ((num1 + num2 + num3) / 3 >=60 ) {
			System.out.println("축하합니다, 합격입니다!");
		
		System.out.println("국어 : " + num1);
		System.out.println("수학 : " + num2);
		System.out.println("영어 : " + num3);
		System.out.println("합계 : " + (num1 + num2 + num3));
		System.out.println("평균 : " + (num1 + num2 + num3) / 3);
		
		//if ((num1 + num2 + num3) / 3 >=60 ) {
			//System.out.println("축하합니다, 합격입니다!");
		
		} else {
			System.out.println("불합격입니다.");			
		}
		
		//System.out.println("국어점수 : " + num);
		//System.out.println("수학점수 : " + num);
		//System.out.println("영어점수 : " + num);
			
	}
}
