package com.kh.Whilesample;

import java.util.Scanner;

public class While02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Scanner sc = new Scanner(System.in);
		
		boolean isChoice = false;
				
		while (!isChoice) { //!�� ����Ͽ� true�� ǥ��
			System.out.println("������ �������ּ���.");			
			
			int month = sc.nextInt();
			
			switch(month) {
			case 12: case 1: case 2: //case 3�� �� �ϳ��� ���̸� ���
				System.out.println("�ܿ�");
				System.out.println("�ܿ��� ���.");
				System.out.println("�ܿ��� �����ϰ� �Ծ���Ѵ�.");
				isChoice = true;
				break; // break�� case������ �����ϰ��� �ϴ°� ����� �� �� ���� ����Ѵ�.
						// switch�� �����ֱ� ������ break�� �ϳ��� ���� �ȴ�.	
				
			case 3: case 4: case 5:
				System.out.println("��");
				isChoice = true; //�� !�� ���� ��� ���� �������� ����ǰ�, ������ ������ ����Ǳ� ������ true�� �ۼ����־� !�� ���� false�� ������ while���� �������ش�. 
				break;
			case 6: case 7: case 8:
				System.out.println("����");
				isChoice = true;
				break;
			case 9: case 10: case 11:
				System.out.println("����");
				isChoice = true;
				break;
			default :
				System.out.println("�߸��� " + month + " �� �Դϴ�.");
			}	
		}
				
		/* ���̰����� �����ϴµ� 9�� �̻� Ƽ���� ������ �� �ֱ� �����Դϴ�.
		 ���̸� �Է¹޾� ����(19~20) û�ҳ�(14~18) ���(10~13)�� �з��ϰ� ����ϱ�
		 while switch case �̿��ؼ� ����ϱ�
		 case ���� 
		 �̿� ���̴� �ٽ� �Է��ϼ���. �� �����
		 */
		
		Scanner sc = new Scanner(System.in);
		
		boolean isChoice = false;
		
		while(!isChoice) { //true
			System.out.println("���̸� �Է��ϼ���. (10 ~ 20)");
			
			int age = sc.nextInt();
			
			switch (age) {
				case 10: case 11: case 12: case 13:
					System.out.println("���");
					isChoice = true;
					break; //switch �� case�� �����ϱ� ���� ��ġ //switch case ����
				case 14: case 15: case 16: case 17: case 18:
					System.out.println("û�ҳ�");
					isChoice = true;
					break;
				case 19: case 20:
					System.out.println("����");
					isChoice = true;
					break;
				default :
					System.out.println("�� �� ���̴� �ٽ� �Է��ϼ���.");
					
			}
		
		}
		
	}

}
