package com.kh.practice4.t;

import java.util.Scanner;

public class Practice9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("���� : ");
		int num = sc.nextInt();
		
		boolean isChoice = false;
		
		while(!isChoice) {
		for(int i = num; i <= 9; i++) {
			System.out.println("=====" + i + "�� =====");
		}
		for (int i = num; i >=10; i--) {
			System.out.println("9������ ���ڸ� �Է����ּ���");
			
		}
			isChoice = true;
	}

}
}
