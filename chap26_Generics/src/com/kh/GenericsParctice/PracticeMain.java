package com.kh.GenericsParctice;

import java.util.ArrayList;

public class PracticeMain {

	public static void main(String[] args) {
		// String Integer T ����Ͽ� ���
		PracticeMain pm = new PracticeMain();
		pm.practice1();

	}
	public void practice1() {
		//������ �����͸� �����ϴ� ArrayList
		ArrayList<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		
		//���ڿ� �����͸� �����ϴ� ArrayList
		ArrayList<String> strList = new ArrayList<>();
		strList.add("Hello");
		strList.add("World");
		
		//���ʸ� �޼��带 ����ؼ� ��� ���
		printList(intList);
		printList(strList);

	}
	public static <T> void printList(ArrayList<T> list) {
		for (T item : list) {
			System.out.println(item);
		}
	}

}