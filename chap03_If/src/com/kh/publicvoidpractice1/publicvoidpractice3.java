package com.kh.publicvoidpractice1;

import java.util.Scanner;

public class publicvoidpractice3 {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�������� : ");
		int num1 = sc.nextInt();
		System.out.print("�������� : ");
		int num2 = sc.nextInt();
		System.out.print("�������� : ");
		int num3 = sc.nextInt();

		if ((num1 + num2 + num3) / 3 >=60 ) {
			System.out.println("�����մϴ�, �հ��Դϴ�!");
		
		System.out.println("���� : " + num1);
		System.out.println("���� : " + num2);
		System.out.println("���� : " + num3);
		System.out.println("�հ� : " + (num1 + num2 + num3));
		System.out.println("��� : " + (num1 + num2 + num3) / 3);
		
		//if ((num1 + num2 + num3) / 3 >=60 ) {
			//System.out.println("�����մϴ�, �հ��Դϴ�!");
		
		} else {
			System.out.println("���հ��Դϴ�.");			
		}
		
		//System.out.println("�������� : " + num);
		//System.out.println("�������� : " + num);
		//System.out.println("�������� : " + num);
			
	}
}
