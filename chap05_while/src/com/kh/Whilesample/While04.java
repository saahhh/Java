package com.kh.Whilesample;

public class While04 {

	public static void main(String[] args) {
		// 1���� 100���� �� ���ϱ�
		
		int sum = 0; //���� ��
		int num = 1;
		
		while(num <= 5) {
			System.out.println("num �� : " + 1);
			sum += num; 
			//sum += 1
			num = num + 1;
			//System.out.println("sum �� : " + sum);
			//sum�� �հ踦 �ֱ������� ��������� while�� �ȿ� �ۼ��ϱ�
			
		} 
		System.out.println("sum �� : " + sum);
		/*
		 while�� ����Ǿ��ٰ��ؼ� Ŭ������ ����� ���� �ƴϱ� ������ while���� ����� �� �����ִ� System.out.pritnln(sum)�� ��µȴ�.
		*/
		
	}

}
