package com.kh.practice4.for��;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		System.out.println("���ڸ� �Է��ϼ���");
		
		int num = sc.nextInt();
		
		if(num < 1) { //���� 1 �̸��� ���ڰ� �Է��� ���� 
			System.out.println("1�̻��� ���ڸ� �Է����ּ���.");
		} else { //1�̻��� ����
			for (int i = 1; i <= num; i++) {
				System.out.println(i);
		}	
		
	}

}
}
