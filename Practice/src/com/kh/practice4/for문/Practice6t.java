package com.kh.practice4.for��;

import java.util.Scanner;

public class Practice6t {

	public static void main(String[] args) {
		
	/*
        ����ڷκ��� �� ���� ���� �Է� �޾� �� ������ ���ڸ� ��� ����ϼ���.
       
       		ex.
			ù ��° ���� : 8 ù ��° ���� : 4 ù ��° ���� : 9
			�� ��° ���� : 4 �� ��° ���� : 8 �� ��° ���� : 0
			4 5 6 7 8 4 5 6 7 8
     */
		Scanner sc = new Scanner(System.in);
   	
		//����ڷκ��� �� ���� ���� �Է� �޾�
		System.out.println("ù ��° ���ڸ� �Է����ּ��� : ");
   		int start = sc.nextInt();
   	
   		System.out.println("�� ��° ���ڸ� �Է����ּ��� : ");
   		int end = sc.nextInt();
   	
   		// �� ������ ���ڸ� ��� ���
   		System.out.println(start + " ���� "+ end + "���� ����");
   		for (int i = start; i <= end; i++ ) {
   		System.out.println(i);
   	}
	}
}
