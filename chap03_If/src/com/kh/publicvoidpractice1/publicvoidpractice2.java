package com.kh.publicvoidpractice1;

import java.util.Scanner;

public class publicvoidpractice2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �� �� �Է��ϼ���");
		System.out.println("����� �Է����ּ���.");
		
		int num = sc.nextInt();
		
		if (num > 0 ) {
			if(num % 2 == 0) {
				System.out.println("¦����");
			} else {
				System.out.println("Ȧ����");	
			}
		}else {
			System.out.println("����� �Է����ּ���.");
			
		}
	}
}
