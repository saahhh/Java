package com.kh.classCircle;

public class Circle {
	//�������
	
	//final double PI = 3.14; //��°���
	//private static final double PI = 3.14; //��°���
	final double PI = 3.14; // ���
	private int radius = 1; // ���� 			//�ۿ��� �ǵ��� ���ϰ� �ϱ� ���� private�� ��
	
	//������
	public Circle() {
		//�⺻������
	}
	//�޼ҵ忡�� 
	//�������� ���� ���
	public void inRadius() {
		//������ ����, ������ų ���� ������ �� �ִ�!
		radius++;
	}
	public void AreaCircle() {
		
	
	//���� ���̸� ����ϰ� ����ϴ� �޼ҵ�
	double area = PI * radius;
	System.out.println("���� ���� : " + area);
	

	}
	public void SizeOfCircle() {
		System.out.println("���� ũ��(������): " + radius);
	}


}


