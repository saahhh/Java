package com.kh.LinkedListSample;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExam {

	public static void main(String[] args) {
		// List �������̽� �� LinkedList ��ü Ȱ���ؼ� �� �ְ� ���
		// String �� �ְ� ���� ���� ����ϱ�
		
		//LinkedList ��ü new LinkedList ��ü
		//int �� �ְ� ���� ���� ����ϱ�
		List<String> linkedList = new LinkedList<>();
		linkedList.add("ù ��°");
		linkedList.add("�� ��°");
		linkedList.add("�� ��°");
		
		System.out.println("linkedList : " + linkedList);
		
		//��� ����
		linkedList.remove(2);
		System.out.println("���� �� : " + linkedList);
		
		linkedList.clear();
		System.out.println("���� �� : " + linkedList);
	}

}
