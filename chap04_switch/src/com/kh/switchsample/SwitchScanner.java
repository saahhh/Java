package com.kh.switchsample;

import java.util.Scanner;

public class SwitchScanner {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	//Scanner sc = new Scanner(System.in); �Է� �� Scanner Ŀ�� �ø��� import java.util.Scanner; �� ���� ��µ�
	
	
	/*System.out.println("������ �������ּ���.");
	//int fruit =
	int fruit = sc.nextInt();
	
	switch (fruit) {
		case 1:
		System.out.println("���");
		break;
		case 2:
		System.out.println("����");
		break;
		case 3:
			System.out.println("�߸��� �����Դϴ�.");
	}
	*/
	
	
	//scanner�� �̿��ؼ� ���ڸ� �����ϴ� switch�� �ϳ� ������ּ���
	
	System.out.println("���ڸ� �������ּ���. 1.������ ����Ĩ 2.������ 3.������Ĩ");
	
	int snack = sc.nextInt();

	switch (snack) {
		case 1:
		
		case 2:
		
		case 3:
			System.out.println("������Ĩ");
			break;
		default:
			System.out.println("�߸��� �����Դϴ�. �ٽ� �������ּ���.");
			
	}
	
	
	
	/*	System.out.println("�ֹ��Ͻ� ��ȣ�� �������ּ���");
		System.out.println("1. �Ƹ޸�ī��");
		System.out.println("2. ī�� ��");
		System.out.println("3. �ٴҶ� ��");
		
		int choice = sc.nextInt();
		
		switch (choice) {
		case 1:
			System.out.println("�Ƹ޸�ī�� �ֹ��ϼ̽��ϴ�.");
			break;
		case 2:
			System.out.println("ī�� �� �ֹ��ϼ̽��ϴ�");
			break;
		case 3:
			System.out.println("�ٴҶ� ��");
			break;
		default : 
			System.out.println("�߸��� �����Դϴ�. �ٽ� �ֹ����ּ���.");
			
		}
*/
		
	}

}
