package com.kh.arraysample;

public class TwoArray {

	public static void main(String[] args) {
		// ���� ���ڿ� �迭 ����� �ʱ�ȭ
		String[][] fruits = {
				{"Apple","Banana","Cherry"},
				{"Grape","Orange","Strawberry"},
				{"Kiwi","Mango","pinApple"}
				
		};
		System.out.println("fruits.length : " + fruits.length);
		for(int i = 0; i < fruits.length; i++) { //fruits.length�θ� ���� cherry�� ��µ��� ����, fruits[i]�� �Է��������
			System.out.println("ù��° ����(��) : " + i);
			for(int a = 0; a < fruits[i].length; a++) {
				System.out.println("�ι�° ����(��) : " + a);
				System.out.println(fruits[i][a] + " ");
			}
			System.out.println(); //���������� �̵��� �� �ְ� enter�� ��� �޼ҵ� �Է�
			
		}
		
		

	}

}
