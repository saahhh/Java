package com.kh.operator;

public class IncrementDecrement {

	public static void main(String[] args) {
		// 3. ����������(Increment & Decrement)
		/* ���������ڴ� ������ ���� 1�� ������Ű�ų� ���ҽ�ų �� ����Ѵ�.
	  	   ���� ���� ������(++x(x�¼���), --x) ���� ���� ������(x++, x--)
			1-1) ���� ���� ������
			++ ���� ���� 1�� ���Ѵ�.
			val = ++num; // num�� ���� 1������ �� val ������ ����
			val = --num; // num�� ���� 1������ �� val ������ ����
			
			 
		 * */
		int val1, val2; // val�� ���� ����
		int num1 = 10;
		val1 = ++num1; // num�� ���� 1 ������ �� val ������ �����ϱ� ������ 11�� ���Ե�
		System.out.println(val1);
		
	
		val2 = --num1;
		//num�� ���� 1 ������ �Ŀ� val ������ ����
		System.out.println(val2);
		
		// 1-2) ���� ���� ������ : ++ ���� ���� 1�� ���Ѵ�.
		int val3, val4;
		int num2 = 10;
		System.out.println(num2);
		val3 = num2++; //val3 ������ ���� num3 ���� ������ �Ŀ� num3 ���� 1 ����
		//1�� val3 = num2 �� �߰�����
		//2�� num2 ++ 1 �߰����� = num2 = 11
		System.out.println("val : " + val3);
		System.out.println("num2�� �� : "+ num2);
		
		val4 = num2--;
		System.out.println("val4 : " + val4);
		System.out.println("num2�� �� : " + num2);
		
				
		
	}

}
