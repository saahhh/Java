package com.kh.example.practice4.model.vo;

import com.kh.example.practice3.model.vo.Circle;

public class CircleRun {

	public static void main(String[] args) {
		// Circle ��ü ����
		
		Circle circle = new Circle();
		
		//���� ũ�� ���
		circle.getSizeOfCircle();
		
		//������ ���� �� ũ�� ���
		circle.incrementRadius();
		
		//���� ���� ��� �� 
		circle.getSizeOfCircle();

	}

}
