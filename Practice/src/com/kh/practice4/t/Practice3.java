package com.kh.practice4.t;

import java.util.Scanner;

public class Practice3 {

		public static void main(String[] args) {
			/*����ڷκ��� �� ���� ���� �Է� �޾� 1���� �� ���ڱ����� ��� ���ڸ� �Ųٷ� ����ϼ���.
			��, �Է��� ���� 1���� ũ�ų� ���ƾ� �մϴ�.
			ex.
			1�̻��� ���ڸ� �Է��ϼ��� : 4   1�̻��� ���ڸ� �Է��ϼ��� : 0
			4 3 2 1                  1 �̻��� ���ڸ� �Է����ּ���.*/

			Scanner sc = new Scanner (System.in);
			
			System.out.println("���ڸ� �Է��ϼ���");
			int num = sc.nextInt();
				
				if(num < 1) {
					System.out.println("1�̻��� ���ڸ� �Է����ּ���.");
				} else { //1�̻��� ����
					for (int i = num; i > 0 ; i-- ) { //for�� �ȿ� ä���
						System.out.println(i);
				}		
		}	
	}
}
