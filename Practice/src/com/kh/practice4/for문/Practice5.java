package com.kh.practice4.for��;

import java.util.Scanner;

public class Practice5 {

	public static void main(String[] args) {
		/*
		1���� ����ڿ��� �Է� ���� �������� �������� ���� ����ϼ���.
			ex.
			������ �ϳ� �Է��ϼ��� : 8
			1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 = 36
		*/ 

		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �ϳ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		int sum = 0; //sum�� �ʱⰪ�� 0���� �ش�
		for(int  i = 1; i <= num; i++) {
			sum += i; //1+2+3+4+5
			//System.out.println("sum : "+sum);
		
		}
			System.out.println("1���� "+ num + "" );		
		
	}

}
