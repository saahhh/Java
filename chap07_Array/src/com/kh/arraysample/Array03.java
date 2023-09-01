package com.kh.arraysample;

import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {
		/*
		 ���ڿ��� �Է� �޾� ���� �ϳ��ϳ� �迭�� �ְ� �˻��� ���ڰ� ���ڿ��� �� �� �� �ִ��� ������ �� ��° �ε����� ��ġ�ϴ��� �ε��� ����ϱ�
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڿ��� �Է��ϼ���."); //1.���ڿ��� �Է� �޾�
		String inputString = sc.next();
		System.out.println("�˻��� ���ڸ� �Է��ϼ���."); //�˻��� ���� �Է¹ޱ�
		char searchChar = sc.next().charAt(0); //ù ��°
		
		//���ڿ��� -> ���ڷ� ��ȯ
		//ex)�ȳ��ϼ���. -> {'��' '��' '��' '��' '��'} �� ������ �ϸ� �迭 (�迭�� �߰�ȣ�� ���� ����)
		
		//toCharArray -> ���ڿ��� ���� �迭�� ��ȯ�ϴ� ����*******
		char[] charString = inputString.toCharArray();
		
		int charCount = charString.length;
		System.out.println("charCount : " + charCount);
		
		//	 String	  -> char
		//���ڿ��� �� �� �� �ִ��� ������ -> length
		//�� ��° �ε����� ��ġ�ϴ��� �ε��� ����ϱ� -> �ε��� �� ���
		//�� ���̰� �󸶳� �Ǵ��� Ȯ���ϰ�, �� �ڸ��� ����ϱ�
		
		int count = 0; //�˻��� ���� ���� ī��Ʈ
		System.out.println(inputString + " �� " + searchChar + " �� �����ϴ� ��ġ(�ε���)");
		//�ݺ����� ����ؼ� ��ġ ã��
		for (int i = 0; i < charCount; i++) {
			//���࿡ ���� �� �ܾ �˻����� �� �� ���ڴ� �� ��° �ε����� ��ġ�ϴ��� �ε��� ����ϱ�
			if (charString[i] == searchChar) { //���� �迭�� ���� �˻��� ���ڿ� ��ġ�ϴ���
				/*charSting[i] �������� �ƴ϶� i���� �Ǿ�� �ϴ� ������ 
			searchChar �츮�� �˻��ؼ� ���ڰ��� �������ֱ� ������ ���� �����Ǿ� �־�� �Ѵ�.*/
				System.out.println(i);
				count++;
			}
			
		}
		
	}

}
