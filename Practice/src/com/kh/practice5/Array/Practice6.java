package com.kh.practice5.Array;

import java.util.Scanner;

public class Practice6 {

	public static void main(String[] args) {
		// 
		Scanner sc = new Scanner(System.in);
		System.out.println("0 ~ 6 ���� ���� �Է� : ");
		int i = sc.nextInt();
		if (i < 7) {
			String[] day = {"��", "ȭ", "��", "��", "��", "��", "��"};
			System.out.println(day[i]);
		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}

		
		
	}

}
