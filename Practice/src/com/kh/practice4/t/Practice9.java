package com.kh.practice4.t;

import java.util.Scanner;

public class Practice9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 : ");
		int num = sc.nextInt();
		
		boolean isChoice = false;
		
		while(!isChoice) {
		for(int i = num; i <= 9; i++) {
			System.out.println("=====" + i + "단 =====");
		}
		for (int i = num; i >=10; i--) {
			System.out.println("9이하의 숫자만 입력해주세요");
			
		}
			isChoice = true;
	}

}
}
