package com.kh.practice.t;

import java.util.Scanner;

public class texam4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in); 
		
		System.out.println("���ڿ��� �Է��ϼ���. : ");
		String s = sc.next();
		
		char a = s.charAt(0); //���ڸ� 1�ھ� ���� (���°)���° �ڸ��� �����ž�
		// ���ڸ� �� �ڸ��� ���� ������ apple 1�ڰ� �Ѿ ����� �� �� ���� 
		// �ڸ� ��ġ ���ؼ� ����ϱ� /������ 0�� �Է��ϸ� a�� ����� �Ǵ� ��
		
		System.out.println("index 0��° �ڸ� : " + a);
		
		char p = s.charAt(1);
		System.out.println("index 1��° �ڸ� : " + p);
		
		//char indexNum2 = s.charAt(1)�� ���̱⵵ ��
		
		String p2 = s.substring(2,3); //���۰� ���� ���� �� ��� ����, �� ���ڵ� ()����������
		// ���ڸ��� �ƴ϶� �ڸ��� �����ؼ� ����� �� ����
		// ���۸� ���ص� �ǰ�, ���� �����ص���
		// �ڸ� ��ġ ���ؼ� ����ϱ�
		// ���۸� �ۼ��� ��� ������ �ε��� ��ġ���� ������ ��µȴ�.
		
		System.out.println("index 2��° �ڸ� : " + p2);
				
	}

}
