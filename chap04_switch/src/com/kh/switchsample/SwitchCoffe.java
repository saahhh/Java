package com.kh.switchsample;

import java.util.Scanner;

public class SwitchCoffe {

	public static void main(String[] args) {
		// while���� Ȱ���� switch
		
		Scanner scanner = new Scanner(System.in);
		
		int choice;
		boolean isChoice = false;
		
		while (!isChoice) { //���ǹ��� ���� ���� �ڵ� ����� �ݺ������� ����
			System.out.println("Ŀ�Ǹ� �ֹ����ּ���. 1. �Ƹ޸�ī�� 2. ī��� 3. ȫ��");
			
			choice = scanner.nextInt();
		
		switch (choice) {
			case 1:
				System.out.println("�Ƹ޸�ī�� �ֹ�");
				isChoice = true;
			case 2:
				System.out.println("ī��� �ֹ�");
				isChoice = true;
			case 3:
				System.out.println("ȫ��");
				isChoice = true;
			default : 
				System.out.println("�߸��� �����Դϴ�. �ٽ� �������ּ���.");
		}
		
		}
		
	
	}

}
