package com.kh.overloadingEx;

public class OverloadingSample {

	/*�����ε��� �޼������ �Ű����� Ÿ��(int,double...), ����, ������ �޶�� ��*/

	public int sum (int a, int b) { //�� ���� �޼���
		return a+b;
	}
	public int sum (int a, int b, int c) {
		return a+b+c;
	}
	public double sum (double a, double b) {
		return a+b;
	}
	public double sum (double a, double b, double c) {
		return a+b+c;
	}
	public int sum (int a, int b, int c, int d) {
		return a+b+c+d;
	}

	public static void main(String[] args) {
		OverloadingSample obj = new OverloadingSample();
	
		System.out.println("�� ������ �� : " + obj.sum(10,20));
		System.out.println("�� ������ �� : " + obj.sum(10,20,30));
		System.out.println("�� �Ǽ��� �� : " + obj.sum(5.5,5.5));
		System.out.println("�� �Ǽ��� �� : " + obj.sum(5.5,5.5,5.5));
		System.out.println("�� ������ �� : " + obj.sum(10,20,30,40));
	
	}		
		
}


