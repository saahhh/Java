package com.kh.example.practice3.model.vo;

public class Circle {
/*
 �ʵ�(�������)
 -PI : double = 3.14
 -radius : int = 1

 ������
 +Circle() -> +setter()/getter()
 
 �޼ҵ�
 +incrementRadius():void
 +getAreaOfCicle():void
 +getSizeOfCircle():void
 */
	
	//�ʵ�(�������)
	double PI = 3.14; //������ //getter setter ���� �� 3.14�巡�� �� ��Ŭ�� -> �ҽ� ->���ʷ���Ʈ ���ͼ���
	int radius = 1; //������
	
	
	public double getPI() {
		return PI;
	}
	public int getRadius() {
		return radius;
	}
	
	
	public void setPI(double PI) {
		this.PI = PI;
	}
	public void setRadius(int radius) {
		this.radius = radius;
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
