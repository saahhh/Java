package com.kh.example.practice3.model.vo;

public class Circle {
/*
 �ʵ�(�������)
 -PI : double = 3.14
 -radius : int = 1

 ������
 +Circle()
 
 �޼ҵ�
 +incrementRadius():void
 +getAreaOfCicle():void
 +getSizeOfCircle():void
 */
	
	//�ʵ�(�������)
	double PI = 3.14; //������
	int radius = 1; //������
	//������
	public Circle() { //�⺻ ������, �ƹ��� �ʱ�ȭ�� �������� �ʴ´�.
	//(double PI, int radius) {
//		this.PI = 3.14; //PI��� 3.14 �ֱ�
//		this.radius = 1; //radius��� 1 �ֱ�
	}
	//�޼ҵ�
	public void incrementRadius() {
		radius++;
		System.out.println("radius : " + radius);
	}
	public void	getAreaOfCircle() {
		double area = PI * radius * radius;
		System.out.println("area : " + area);
	}
	public void getSizeOfCircle() {
		System.out.println("���� ������ : " + radius);
	}
	
}
