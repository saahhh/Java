package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice1 {
	public static void main (String[] args)  {
		Scanner sc = new Scanner(System.in);
				
		String name = "�ƹ���";
		String gender = "��/��";
		int age = 20;
		double height = 180.5;
		
		System.out.print("�̸��� �Է��ϼ���.");
		name = sc.next();
		System.out.print("������ �Է��ϼ���. (��/��)");
		gender = sc.next();
		System.out.print("���̸� �Է��ϼ���.");
		age = sc.nextInt();
		System.out.print("Ű�� �Է��ϼ���.(cm)");
		height = sc.nextDouble();
		
		System.out.println(height + "�� " + age + "�� " + gender + " " + name + "�� �ݰ����ϴ�.^^");
		
	}
}