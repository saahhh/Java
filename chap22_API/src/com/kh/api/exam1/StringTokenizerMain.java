package com.kh.api.exam1;

import java.util.StringTokenizer;

public class StringTokenizerMain {
/*
 StringTokenizer Ŭ���� : ���ڿ��� �и��ϴµ� ���
 						�־��� ������(�⺻�� ����)�� �������� ���ڿ��� ��ū���� �и��Ѵ�
 */
	public static void main(String[] args) {
		String text = "apple orange banana";
		StringTokenizer tokenizer = new StringTokenizer(text);
		
		//hasMoreTokens �� �Ҹ��̴� (Ư�� ���ؿ� ���� ��ū�� ����?)
		while (tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
			System.out.println(token);
		}
	}
}
