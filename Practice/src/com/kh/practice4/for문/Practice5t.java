package com.kh.practice4.for��;

import java.util.Scanner;

public class Practice5t {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 1���� ����ڿ��� �Է� ���� �������� �������� ���� ����ϼ���.
		*/
		
			Scanner sc = new Scanner(System.in);
			
			System.out.println("���ڸ� �Է��ϼ���.");
			int num = sc.nextInt();
			int sum = 0;
			for(int i = 1; i <=num; i++) {
				sum += i; //1+2+3+4+5
				
			}
	
			System.out.println("1���� " + num +" ������ �������� ���� " + sum);
	
	}

}
