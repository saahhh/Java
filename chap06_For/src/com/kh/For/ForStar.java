package com.kh.For;

import java.util.Scanner;

public class ForStar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�����Է� : ");
		int num = sc.nextInt();
		
		/* ���ǹ� hard ver pdf
		 	 ����� 
		 	 �簢��		 
		 	 *****
		 	 *	 *
		 	 *   *
		 	 *	 *
		 	 *****
		 */
				
		for (int i = 1; i <=5 ; i++) { // i = �� ����/ �� ���� ���� 1�� �� *�� ���
			for (int j = 1; j <=5; j++) {
				// ���� 1�� ��� (���� ����) 
				// ���� �࿡�� ����ϴ� ���� ù ��° ���� ��� ( j == 1 )
				// ���� �࿡�� ���� �������� ���� ��� ( j == num )
				// ���� �������� ��� (���� �Ʒ���)
				if( i == 1 || i == num || j == 1 || j == num) { // j = �� ����/
					System.out.print("*");
					System.out.print("");
				} else {
					System.out.print("&"); //&��� ������ �ֱ�
				}	
				//System.out.println(); //�ٹٲ�
			}
			//System.out.print("*");
			//System.out.print(" ");
			System.out.println();
		}
		
	}

}
