package com.kh.arrayList.Practice;

import java.util.ArrayList;

public class ArrayListPractice {

	public static void main(String[] args) {
		/*ArrayList �̿��ؼ� ���ֳ����ĳ���
		���� 3ȸ 1,3,5 ->��, ����, �׸� ����
		���ϱ� 2ȸ ->��Ȳ, [���ο�],�Ķ�,[�����Ķ�]
		���� for�� �̿��ؼ� ���� ����ϱ�
		�� �� ��� �� �� ��*/
		
		ArrayList<String> color = new ArrayList<>();
		System.out.println("color : " + color);
						
		color.add("��");		
		color.add("��");		
		color.add("��");		
		color.add("��");		
		color.add("��");	
		color.add("��");
		color.add("��");
		System.out.println("��ü���� : " + color);
		
		color.set(1, "��");
		color.set(3, "����");
		color.set(4, "�׸�"); //5�� �ƴ� 4
		System.out.println("����üũ : " + color);
		
		//��, ���ο�, �׸�, �����Ķ� ������
				
		color.add(2,"���ο�");
		color.add(6,"�����Ķ�");
		System.out.println("���� ���� : " + color);		
		//color.add(null)
		//���ο� �� ���� �׸�[�����Ķ�]
		//���1. ��� ���� ���� 
		//color.remove(3);
		//color.remove(3); //������ ������ �Ǿ �ڸ����� ����� ��
		//sysout " " + color
		//���2. ��� ���� ����
		//color.add(6,"�����Ķ�");
		//system.ont.print("�����Ķ� ���� : + color);
		
		
		/*
		   ���� for��
			for �ݺ� �۾��� �� �� ���Ǵ� ���� ����
			Ư�� ������ ���� ���� �Ǵ� ����Ʈ, �迭 ���� �÷��� ��Ҹ� �ϳ��� ó���� �� ���
			
			�ڵ� ����
			for(����ǵ�����Ÿ�� ������ : ArrayList������) {
			//ó�� ��� �ڵ�
			}
		*/
		
		String[] arr = new String[] {"��","��","��","��","��","��","��"};
		for(String aaa : color) { //���� colors�� ������ ���� aaa�ڸ��� ���� ������ color�� ���� ��

		}
		//System.out.println("���� ��� : " + arr[0] + arr[4] + arr[6]);
		//���� ��� : 
		//1.�ε��� �̿��ؼ� �ڸ� ��� (������ �ǵ�)
		color.set(7,"��");
		System.out.println("���� ��� : " + color.get(0) +" "+ color.get(7) +" "+ color.get(8));
		//2.�ʱ�ȭ �� ���
//		ArrayList<String> rainbow = new ArrayList<>();
//		color.add("��");
//		color.add("��");
//		color.add("��");
//		System.out.println("���� ��� : " + raindow.get(0) + raindow.get(7) + raindow.get(8) );
//		
	}

}