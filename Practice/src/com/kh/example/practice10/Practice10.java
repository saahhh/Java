package com.kh.example.practice10;

public class Practice10 {

	public static void main(String[] args) {
		/* �޼ҵ� �� : public void practice10(){}
			�ֹε�Ϲ�ȣ �����ڸ� ���ĺ��� *�� ������ ����ϼ���.
			��, ���� �迭 ���� ���� ���� �迭 ���纻���� �����ϼ���.
			ex.
			�ֹε�Ϲ�ȣ(-����) : 123456-1234567
			123456-1******
		*/

		//1. �ֹι�ȣ �����
		String jumin = "123456-1234567"; //-�ڸ� �����ؼ� 14�ڸ�
		
		//2. �����ڸ� ���� ��ǥ ����°� ����� //8��°�ڸ����� ������ ��ǥó��
		String makestar = "*";
		
		//�ֹε�Ϲ�ȣ �����ڸ� ���ĺ��� *�� ������ ���
		//to char Array�� ����ؼ� String -> char Array�� ����
		char[] juminStar = jumin.toCharArray();
		//{'1','2','3','4','5','6','-','1','2','3','4','5','6'','7'}
		
		//for(�ֹι�ȣ 9�ڸ����� ���ڸ����� *ǥ ó�� �ع�����) {
		//juminStar 9�ڷ� �����ϸ� *�� �ٲ������
		//ó���� �����ϴ� ���ڴ� 9, 9���� �������ڸ�����, 1������
		for(int a=8; a <= 13; a++) {
			juminStar[a]= '*';
		}
		System.out.println(juminStar);
		
	}
}

