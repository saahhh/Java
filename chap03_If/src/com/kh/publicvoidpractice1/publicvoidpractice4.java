package com.kh.publicvoidpractice1;

import java.util.Scanner;

public class publicvoidpractice4 {
		
		public static void main(String[] args) {
			
		Scanner sc = new Scanner (System.in);
		System.out.println("1~12 ������ ���� �Է�: ");
			int month = sc.nextInt();
			
			String season = "";
			
			switch(month) {
			case 3:
			case 4:
			case 5:
				season ="��";
				break;
			case 6:
			case 7:
			case 8:
				season ="����";
				break;
			case 9:
			case 10:
			case 11:
				season = "����";
				break;
			case 12:
			case 1:
			case 2:
				season = "�ܿ�";
				break;
			default:
				season ="�߸� �Էµ� ��";
				
			}
			
			System.out.println(month + "���� " + season +"�Դϴ�.");
			
		}
			
}
