package com.kh.arraysample;

import java.util.Scanner;

public class Array01 {

	public static void main(String[] args) {
		// Array
		// ���� Ÿ���� ���� ������ �ϳ��� �������� �ٷ�� ��
		/*
		 	������ ������ Ÿ���� ���� ���� ���� �� ���� �����ϰ�
		 	�ε����� ����Ͽ� �� ���� ������ �� �ֵ��� ����
		 	�迭�� ���α׷����� �����͸� ���� ȿ�������� �����ϰ� �����ϴµ��� ���
		 	�������� ������ ���� �ٷ� �� �ֵ��� �����ش�
		 
		   �迭�� ����
		 	�迭 ���� �� �ʱ�ȭ
		 	������Ÿ��[] �迭�̸� = new ������Ÿ��[ũ��];
		 
		   Ư¡ : 
		  1. ������ ũ�� : ������ �� ũ�Ⱑ �����ǰ�, ũ�Ⱑ �����Ǿ� ����
		  				���� �Ŀ��� ũ�⸦ ������ �� ����
		  2. ���� ������ Ÿ�� : �迭 ���� ��� ��Ҵ� ������ ������Ÿ���� �������Ѵ�.
		  					ex) intŸ���� �迭�� ��� ��� ����
		  3. index ��� ���� : �� �迭 ��Ҵ� �������� �ε����� ������
		  					0���� �����ؼ� �迭 ũ�� -1������ ���� ����
		  					�ε����� ����ؼ� Ư�� ��ġ�� �ִ� ��� ������ �����ϴ�
		  					ex) �迭 ũ�� = 5�� ��ٸ� index�� 0 ~ 4(0���� �����ϱ� ����)
		  4. �迭�� ���� (length) : �迭�� ���̸� �� �� �ִ�.
		  	 					
		*/
		 int score1, score2, score3, score4, score5;
		 //score�� 5������ ���߿� score�� 1000�� ���? -> �迭���
		 //int Ÿ�� �迭�� ����
		 int[] score = new int[5]; //new�� ����ؾ� ���𰡰� ��Ÿ���� ��� �� (��ĳ�ʶ� ���� ����)
		 
		 score[0] = 1;
		 score[1] = 2;
		 score[2] = 3;
		 score[3] = 4;
		 score[4] = 5;
		 
		 
		//String[] stringArray = new String[4]; //�ε����� ����ϴ� ������ ""�ȿ� � ���� ���� �� ��
		//String[] stringArray = {" ", " ", " ", " ", " "}; //""�ȿ� � ���� ������ ������ [����]�ڸ��� �ʿ��� �� -> 0,1,2,3,4
		
				//�ڸ� ��ȣǥ		0		1		2		3		4
		//String[] nameArray = {"��泭", "�踻��", "ȫ�浿", "��ö��", "������"};
		 
		/*
		String[] stringArray = new String[4];
		stringArray[0] = "��";
		System.out.println("stringArray : " + stringArray[0]); //��°� : stringArray : null (�ƹ��͵� ���� �ʾұ⶧��)
		stringArray[1] = "��";
		System.out.println("stringArray : " + stringArray[1]);
		stringArray[2] = "��";
		System.out.println("stringArray : " + stringArray[2]);
		stringArray[3] = "��";
		System.out.println("stringArray : " + stringArray[3]);
		//{��, ��, ��, ��}
		*/
		
		//String[] nameArray = {"��泭", "�踻��", "ȫ�浿", "��ö��", "������"};
		String[] food = {"����", "����", "����", "�Ұ��"}; //3
		int foodLength = food.length;
		System.out.println("food �迭�� ���� : " + foodLength);
		
		 
		 
		 /*
		 //System.out.println(score); //[I@5e91993f
		 //System.out.println(score[0]); //1
		 
		 Scanner sc = new Scanner(System.in);
		 int[] arr = new int[5]; 
		 // index 0~4���� �����
		 // �迭�� int 5���� ����
		 
		 for(int i = 0; i < 5; i++) {
			 arr[i]= sc.nextInt();
			 System.out.println(arr[i]);
			 
		//stack(����) heap(�ӽ����念��)
		//arr			[]
		*/ 


				 
	}

}
