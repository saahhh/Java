package com.kh.practice4.for��;

import java.util.Scanner;

public class Practice6 {

	public static void main(String[] args) {
		/*
		 
		*/

		Scanner sc = new Scanner(System.in);
		
		System.out.println("ù��° ���ڸ� �Է��ϼ���");
		int start = sc.nextInt();
		
		System.out.println("�ι�° ���ڸ� �Է��ϼ���");
		int end = sc.nextInt();
		
		//�� ������ ���ڸ� ��� ���
		
		System.out.println(start + " ����" + end + "���� ����");
		for (int i = start; i <= end; i++) {
			System.out.println(i);
		}
		if(start < end) {
		//(���࿡ ù ��° ���ڰ� �� ��° ���ں��� ���� ��) {
		
		}else if(end < start) {
		//(���� �� ��° ���ڰ� ù ��° ���ں��� ���� ��) {
	}

}
}