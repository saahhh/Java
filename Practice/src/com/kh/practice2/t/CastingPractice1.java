package com.kh.practice2.t;

import java.util.Scanner;

public class CastingPractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �Է�");
		char inputChar = sc.next().charAt(0); // sc.next(); ���� ��������, charAt();�� �Է¹��� ���� ���
		
		int changeChar = inputChar;
		System.out.println("�Է¹��� : " + inputChar + "�����ڵ� : " + changeChar);
		
	}

}
