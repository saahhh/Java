package com.kh.foodstore;

public class Main {

	public static void main(String[] args) {
		//						FoodStore -> Order //FoodStore�� ��ӵ� ���� ����
		FoodStore order = new Order();
		order.addMenu("«���ֹ�");
		order.addMenu("¥����ֹ�");
		order.addMenu("��«���ֹ�");
		order.printMenu();
		
		FoodStore order1 = new Order();
		order.addMenu("���ֹ�");
		order.addMenu("�����ֹ�");
		order.addMenu("�����ֹ�");
		order.printMenu();		
		

	}

}
