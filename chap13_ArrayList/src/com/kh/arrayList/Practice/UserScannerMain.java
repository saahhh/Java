package com.kh.arrayList.Practice;

import java.util.Scanner;

public class UserScannerMain {

	public static void main(String[] args) {
		/*����ڷκ��� 5���� ������ �Է¹޾Ƽ� �迭�� �����Ѵ���,
		���� for ���� ����ؼ� �迭�� ��� ��Ҹ� ���� ��� ��� */
		
		//���� �Է¹޴� ��ĳ�� �����
		Scanner sc = new Scanner(System.in);
		System.out.println("���� 5���� �Է��ϼ���");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();
		int num5 = sc.nextInt();
		
		int[]numbers = new int[5];
		
		//�迭���ٰ� 5���� ������ �Է��ϴ� for��
//		for(�ε��� 0���� �����ؼ� �ϳ��� ����; 0����~(5-1)���� ����ְ���; �ϳ��� ��������);
		/* Ǯ�̹��1.
		 * int[]
				numbers = new int[5];
		for(int i = 0; i <= 4; i++) {
			//ArrayList ��� color.get(0)
			//�迭�� [] �ȿ� ����
			//�ٵ� �迭�� �ڸ��� ����?? �迭�� �ڸ� ���� ���������
			//���?
			//�ٱ����ٰ� int numers �� �迭�� ����������
			//������ �����ϱ� ���� ��ü���� ��ٱ��ϴ� ����������!
			System.out.println("���� index " + (i) + "i");
//			System.out.println("���� �ڸ��� " + (i + i) + "i");
			numbers[i] = sc.nextInt();
			
		}*/
		
		
		
		/*�ڵ� ����
		for(����ǵ�����Ÿ�� ������ : ArrayList������) {*/
		
		//Ǯ�̹��2.
		//�迭�� ��� ��Ҹ� ���� ��� ���
		//������ �������� ���ϴ� ���̱� ������ ���� for�� ���
		//�Ǵ� �⺻for���� ����ϰ� �ʹٸ� length�� �̿��ؼ� ��� ����
		
		//		����1����		��ü����
		int sum = 0;
		for(int number : numbers) {
			sum += number;
		}
//		int[] numbers = {num1,num2,num3,num4,num5};
//		for(int i : numbers) {
//			
//		}
//		System.out.println(num1+num2+num3+num4+num5);

		//�ջ�� ��� ���
		System.out.println("�迭�� ��� ��Ҹ� ���� ��� : " + sum);
	}

}