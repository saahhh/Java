package com.kh.instance.cafe;

public class Cafe {
	private String type; //��������
	private int size; //���������
	private boolean isSugar; //��������
				//String t, int s, boolean is �ε� ����
	public Cafe(String type, int size, boolean isSugar) {
		this.type = type;
		this.size = size;
		this.isSugar = isSugar;
		
	}
	public void CafeMenu() {
		System.out.println(type + "�� �ֹ��մϴ�.");
		System.out.println(size + "������ �Դϴ�");
		if (isSugar) {
			System.out.println("������ �߰��մϴ�");
		} else {
			System.out.println("������ �߰����� �ʽ��ϴ�.");
		}
	}
}
