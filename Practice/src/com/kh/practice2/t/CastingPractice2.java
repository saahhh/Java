package com.kh.practice2.t;

import java.util.Scanner;

public class CastingPractice2 {

	public static void main(String[] args) {
		/*
			�Ǽ������� ����, ����, ���� �� ������ ������ �Է� �޾� ������ ����� ����ϼ���.
			�� �� ������ ����� ���������� ó���ϼ���. 
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�������� : ");
		double kor = sc.nextDouble();
		
		System.out.println("�������� : ");
		double eng = sc.nextDouble();
		
		System.out.println("�������� : ");
		double math = sc.nextDouble();
		
		// ������ ����� ������
		int averageScore = (int) (kor + eng + math);
		int totalScore = (averageScore / 3);
		
		System.out.println("��������="+kor+" ��������="+eng+" ��������="+math+" ����="+averageScore+"�������="+totalScore);

	}

}