package com.kh.operator;

public class Comparison {

	public static void main(String[] args) {
		// 4. �񱳿����� : ���� ���� �� ���
		/*
		 
		 ũ�� ��, ��ȣ �� ���� ������ �� ����
		 �ΰ��� �� �� ������� �� ū��, �� ������, ������, �ٸ����� ���θ� �Ǵ��Ѵ�.
		 �� �������� ��� ���� ��(true) �Ǵ� ����(false)���� ��ȯ�Ѵ�.
		  >  ���� ���� ũ�� ��, �ƴϸ� ������ ��ȯ ex) num>5  >�� �ʰ�
		  <  ���� ���� ������ ��, �ƴϸ� ������ ��ȯ ex) num<5  <�� �̸�
		  >= ���� ���� ������ �׺��� ũ�ų� ������ ��, �ƴϸ� ������ ��ȯ ex) num >= 5  >=�� ũ�ų�����
		  <= ���� ���� ������ �׺��� �۰ų� ������ ��, �ƴϸ� ������ ��ȯ ex) num <= 5  <=�� �۰ų�����
		  == �� ���� ���� ������ ��, �ƴϸ� ������ ��ȯ ex) num == 5
		  != �� ���� ���� �ڴٸ���� ��, �ƴϸ� ������ ��ȯ num != 5
		 		 
		*/
		int p = 5;
		int q = 10;
		System.out.println("boolean�� ���� ���� : " + (p==q)); //���� �ٸ��� ������ false
		boolean isEqual = p == q;
		System.out.println(isEqual);
		int r = 5;
		System.out.println("p == r : " +(p == r)); //���� 5�� �����ϱ� ������ true
		
		
		boolean isEqual1 = p != q; //p�� q�� ���� �ٸ��� ������ ������ true
		System.out.println("p != q : " + isEqual1);
		
		boolean isEqual2 = p != r; //p�� q�� ���� ���� ������ ������ false
		System.out.println("p != r : " + isEqual2);
		
		
		
	}

}