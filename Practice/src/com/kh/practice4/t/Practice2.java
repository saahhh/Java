package com.kh.practice4.t;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 1�� ������ ��� ���� ���� �ϳ�, 1�̸��� ���ڰ� �Է��ߴٸ�
		 "1 �̻��� ���ڸ� �Է����ּ���"�� ��µǸ鼭 �ٽ� ����ڰ� ���� �Է��ϵ��� �ϼ���.
		*/
		
		Scanner sc = new Scanner(System.in);
			
		boolean isChoice = false;
		
		//1.���� �� ����� boolean ���� = true of false;
			while(!isChoice) {     // 2.���� �߰��ϱ� 
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
