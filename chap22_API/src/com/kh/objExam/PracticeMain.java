package com.kh.objExam;

import java.util.Scanner;

public class PracticeMain {

	public static void main(String[] args) {
		PracticeMain pm = new PracticeMain();
		//practice1();	
	}
		public void practice1() {
			//Scanner �̿��ؼ� ����
		Scanner sc = new Scanner(System.in);
		System.out.println("ù ��° ���ڿ��� �Է��ϼ���.");
		String str = sc.nextLine();
		System.out.println("�� ��° ���ڿ��� �Է��ϼ���.");
		String str2 = sc.nextLine();
		
		sc.close();
		
		//���ڿ� ��
		if(str.equals(str2)) {
			
		}
		
		
		//hashCode()
		int hashCode = str.hashCode();
		int hashCode2 = str2.hashCode();
		System.out.println("ù ��° ���ڿ��� �ؽ��ڵ� : " + hashCode);
		System.out.println("�� ��° ���ڿ��� �ؽ��ڵ� : " + hashCode2);
		
		//toString()
		String strString = str.toString();
		String str2String = str2.toString();
		System.out.println("ù ��°�� ���ڿ� ǥ�� : " + strString);
		System.out.println("�� ��°�� ���ڿ� ǥ�� : " + str2String);
	}

}
