package com.kh.For;

import java.util.Scanner;

public class for02 {

	public static void main(String[] args) {
		// ������ �����
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ù��° ���ڸ� �Է��ϼ���.");
		int num1 = sc.nextInt();
		
		System.out.println("�ι�° ���ڸ� �Է��ϼ���.");
		int num2 = sc.nextInt();
		
		int result = 0; //���� ���� 0���� �ݴϴ�. 
		for (int i = 0; i < num2; i++) { //for ������ ����ؼ� i ������ 0���� num2 �̸����� �ݺ�, �� ������ �ι�° ������ num2 ��ŭ �ݺ�
			result += num1; //result ������ num1 ���� ���� 
							//num2 ��ŭ num1�� ���ϴ� ȿ���� ��
			System.out.println("for�� �� : " + num1 + " * " + num2 + " = " + result);
		}
		//System.out.println(num1 + " * " + num2 + " = " + result); //for�� ��
		//���� ����� ���, �Է¹��� �� ���ڿ� ������� ���ڿ��� �����ؼ� ���
		
		System.out.println("ù��° ���ڸ� �Է��ϼ���.");
		int num3 = sc.nextInt();
		
		System.out.println("�ι�° ���ڸ� �Է��ϼ���.");
		int num4 = sc.nextInt();
		
		int result2 = 0;
		for(int i = 1; i<= num4; i++) {
			result2 += num3;
			System.out.println("������ : " + num3 + " * " +  i + " = " + result2);
		//num3,4�� ������Ų ���̱� ������ 5*6���θ� ��µ� ���� ��°��� i�� �־��ָ� 1,2,3,4,5�� �ö󰣴�
		}
		
	}

}
