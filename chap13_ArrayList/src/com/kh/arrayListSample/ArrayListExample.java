package com.kh.arrayListSample;

import java.util.ArrayList;

/*
 * toDoSample.java
 * ArrayLis �̿��ؼ�
 * ���� ����� (3��)
 * �����ϰ� (2��)
 * ����� (1)
 * ���δ� �����ϱ�
 * */

public class ArrayListExample {

	public static void main(String[] args) {
		// �� ArrayList ����
		
		ArrayList<String> fruits = new ArrayList<>();
		System.out.println("fruits : " + fruits); //fruits : []
		//��� �߰�
		fruits.add("���");
		System.out.println("��� �߰� : " + fruits);
		fruits.add("�ٳ���");
		System.out.println("�ٳ��� �߰� : " + fruits);
		fruits.add("����");
		System.out.println("���� �߰� : " + fruits);
		
		//��� ���� Ȯ��
		int size = fruits.size();
		System.out.println("���� ����� ũ�� : " + size);
		
		//�ε����� ����Ͽ� ��ҿ� ��������
		String firstFruits = fruits.get(0);
		System.out.println("ù ��° ���� : " + firstFruits);
//		String fourFruits = fruits.get(4);
//		System.out.println("�� ��° ���� : " + fourFruits);
		
		//��� �����Ұž�
		fruits.set(2,"ü��");
		System.out.println("����üũ : " + fruits);
		
		//��� ����
		fruits.remove(1);
		System.out.println("�ٳ��� ����Ȯ�� : " + fruits);
		
		//ArrayList ��ȸ�ؼ� ������
		System.out.println("��� ���� ���");
//		for(����ǵ�����Ÿ�� �츮�� ���� ������ : (����� ����ִ� ������) ArrayList������) {
		for(   String          fruit : fruits) {
			System.out.println(fruits);
		}
			
		//ArrayList ����
		fruits.clear();
		System.out.println("��� ������ ���� : " + fruits);
		
	}

}
