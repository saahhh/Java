package com.kh.practice4.for��;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		/*
		����ڷκ��� �� ���� ���� �Է� �޾� 1���� �� ���ڱ����� ���ڵ��� ��� ����ϼ���.
		��, �Է��� ���� 1���� ũ�ų� ���ƾ� �մϴ�.
		���� 1 �̸��� ���ڰ� �Էµƴٸ� ��1 �̻��� ���ڸ� �Է����ּ��䡰�� ����ϼ���.
			ex.
			1�̻��� ���ڸ� �Է��ϼ��� : 4 		1�̻��� ���ڸ� �Է��ϼ��� : 0
			1 2 3 4 					1 �̻��� ���ڸ� �Է����ּ���.
		*/

		Scanner sc = new Scanner (System.in);
		
		System.out.println("���ڸ� �Է��ϼ���");
		
		int num = sc.nextInt();
		
		if(num < 1) { //���� 1 �̸��� ���ڰ� �Է��� ���� 
			System.out.println("1�̻��� ���ڸ� �Է����ּ���.");
		} else { //else�� ������ 1�̻��� ���ڵ�
			for (int i = 1; i <= num; i++) {
				System.out.println(i);
		}	
		
	}

}
}


