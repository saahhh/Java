package com.kh.collectionMain;

import java.util.HashMap;
import java.util.Map;

public class UserMapExam {

	public static void main(String[] args) {
		// HashMap ���� UserAge
		Map<String, Integer> UserAge = new HashMap<>();
		
		// ������ �̸��� ����
		UserAge.put("��������", 15);
		UserAge.put("����", 17);
		UserAge.put("�ָԹ�����", 7);
		
		// Ư�� ���� �˻�
		String UserName = "��������";
		
		// ��� �л��� ���� ���
		if(UserAge.containsKey(UserName)) {
			int age = UserAge.get(UserName);
			System.out.println(UserName + "�� ���� : " + age);
		} else {
			System.out.println(UserName + "�� ���̸� ã�� �� �����ϴ�.");
		}
		
		// ������ ���� ����
		String UserUpdate = "�ָԹ�����";
		int newAge = 20;
		UserAge.put(UserUpdate, newAge);
		System.out.println(UserUpdate + "�� ���̸� " + newAge + "�� �����߽��ϴ�.");
		
		// ���� Ż��(����)
		String removeUser = "����";
		UserAge.remove(UserAge);
		
		// ���� ���� �̸� ���� ���
		System.out.println("���� ���� �̸� ���� : ");
			for(Map.Entry<String,Integer> entry : UserAge.entrySet()) {
			String name = entry.getKey();
			int age = entry.getValue();
			System.out.println(name + " : " + age);
			}
	}
}
