package com.kh.practice4.t;

import java.util.Scanner;

public class Practice4 {

	public static void main(String[] args) {
		/*�޼ҵ� �� : public void practice4(){}
		�� ������ ��� ���� �����ϳ�, 1 �̸��� ���ڰ� �Էµƴٸ�
		��1 �̻��� ���ڸ� �Է����ּ��䡱�� ��µǸ鼭 �ٽ� ����ڰ� ���� �Է��ϵ��� �ϼ���.
		ex.
		1�̻��� ���ڸ� �Է��ϼ��� : 4    1�̻��� ���ڸ� �Է��ϼ��� : 0
		4 3 2 1                   1�̻��� ���ڸ� �Է����ּ���.
		                          1�̻��� ���ڸ� �Է��ϼ��� : 8
		                          8 7 6 5 4 3 2 1*/ 
		
			Scanner sc = new Scanner(System.in);
			boolean isChoice = false;
			
			while (!isChoice) {
				System.out.println("1�̻��� ���ڸ� �Է��ϼ���.");
				int num = sc.nextInt();
		
			if(num < 1) {
				System.out.println("1�̻��� ���ڸ� �Է��ϼ���.");
			} else {			
			for (int i = num ; i > 0 ; i--) {
				System.out.println(i);
				//+=����ϱ�
			}
				isChoice = true;
		}
	}

}
}
