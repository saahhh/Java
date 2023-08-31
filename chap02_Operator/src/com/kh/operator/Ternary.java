
package com.kh.operator;

public class Ternary {
	public static void main(String[] args) {
		// 6.���� ������
		/* ���� = ���� ? ���� : ����
		   ������ ���ϰ� �� ���� �� �� �ϳ��� ��ȯ�մϴ�. //������ ������ ��ȣ �ȿ� �ֱ�(���� ���)
		   (����) ? ��1        : ��2        ���·� ���
		   (����) ? ��1(=true) : ��2(=false) 
		   ��1�� ������ ���� �� ���
		   ��2�� ������ ������ �� ���
		*/
		
		//ex) ���̰� 20�ε� �����ΰ� �̼������ΰ�
		int age = 20;
		String status = (age >= 20) ? "����" : "�̼�����";
		System.out.println(status);
		
		int score = 85;
		String result = (score >= 60) ? "�հ�" : "���հ�";
		System.out.println("������ : " + result);
		
		int number = -5;
		String sign = (-5 > 0) ? "true" : "false";
		System.out.println("sign : " + sign);
		
		int temperature = 25;
		String weather = (temperature > 21) ? "������ ����" : "�߿� ����";
		System.out.println("���� ���� : " + weather);
		
		//���� 7�� ���� ¦������ Ȧ������ ���
		int num = 7;
		String result2 = (num > 9) ? "¦��" : "Ȧ��";
		System.out.println("7�� �� : " + result2);
		
		//���
		int value = 7;
		String evenorOdd = (value % 2 == 0) ? "¦��" : "Ȧ��";
		System.out.println("¦�� �Ǵ� Ȧ�� : " + evenorOdd);
		
		//�� ������ �ʴ� ��
		int number2 = -5;
		String sign2 = (number2 > 0) ? "���" : (number2 < 0) ? "����" : "0";
		System.out.println("������ ��ȣ : " + sign2);
		
				
		}
}