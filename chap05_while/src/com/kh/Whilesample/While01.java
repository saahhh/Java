package com.kh.Whilesample;

import java.util.Scanner;

public class While01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		boolean isTrue = true;
		//int choice = sc.nextInt(); //while ������ �̵�
		
		while(isTrue) { // isTrue = true �̱� ������ true ��ſ� isTrue ���
			System.out.println("Ŀ�Ǹ� �ֹ����ּ���. 1. �Ƹ޸�ī�� 2.īǪġ�� 3.������ũƼ");
			int choice = sc.nextInt(); //while������ �̵�
			
			switch (choice) {
			case 1:
				System.out.println("�Ƹ޸�ī�� �ֹ�!");
				isTrue = false; //�Ƹ޸�ī�� �ֹ��� �޾����� while���� �����ϱ� ���ؼ� false�� �ִ´�.
				break;
			case 2:
				System.out.println("īǪġ�� �ֹ�!");
				isTrue = false; //īǪġ�� �ֹ��� �޾����� while���� �����ϱ� ���ؼ� false�� �ִ´�.
				break;
			case 3:
				System.out.println("������ũƼ �ֹ�!");
				isTrue = false; //������ũƼ �ֹ��� �޾����� while���� �����ϱ� ���ؼ� false�� �ִ´�.
				break;
			default:
				System.out.println("�߸��� �����Դϴ�. �ٽ� �ֹ����ּ���.");
				System.out.println("                           ");
				
			}		
		}
	}
}
