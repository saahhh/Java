package com.kh.practice4.for��;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 1�� ������ ��� ���� ���� �ϳ�, 1�̸��� ���ڰ� �Է��ߴٸ�
		 "1 �̻��� ���ڸ� �Է����ּ���"�� ��µǸ鼭 �ٽ� ����ڰ� ���� �Է��ϵ��� �ϼ���.
		
		����) �� ������ ��� ���� �����ϳ�, 1 �̸��� ���ڰ� �Էµƴٸ�
		��1 �̻��� ���ڸ� �Է����ּ��䡱�� ��µǸ鼭 �ٽ� ����ڰ� ���� �Է��ϵ��� �ϼ���.
			ex.
			1�̻��� ���ڸ� �Է��ϼ��� : 4 	1�̻��� ���ڸ� �Է��ϼ��� : 0
			1 2 3 4 				1 �̻��� ���ڸ� �Է����ּ���.
			1�̻��� ���ڸ� �Է��ϼ��� : 8
			1 2 3 4 5 6 7 8
		*/
		
		Scanner sc = new Scanner(System.in);
			
		boolean isChoice = false;
		//boolean isTrue = true;
		
		//1.���� �� ����� boolean ���� = true of false;
			while(!isChoice) {     // 2.���� �߰��ϱ�
			//while(!isTrue)	
				System.out.println("���ڸ� �Է��ϼ���.");
				int num = sc.nextInt();
			
				if(num < 1) {    //���� 1 �̸��� ���ڰ� �Է��� ���� 
				System.out.println("1�̻��� ���ڸ� �Է����ּ���.");
			
				} else { //1�̻��� ����
			for (int i = 1; i <= num; i++) {
				System.out.println(i);
			}	
				isChoice = true; //3. ���� false
		  }	

		}
	}
}
