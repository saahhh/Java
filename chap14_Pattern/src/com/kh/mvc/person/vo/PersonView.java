package com.kh.mvc.person.vo;

import java.util.Scanner;

public class PersonView {
	//Ŭ���̾�Ʈ�� ���� ��
	public String getUserInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸��� �Է��ϼ���.");
		return sc.nextLine();
	}
	//���� ��
	public void displayInfo(String result) {
		System.out.println("��� : " + result);
		
	}
}
