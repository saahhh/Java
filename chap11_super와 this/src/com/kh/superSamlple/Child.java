package com.kh.superSamlple;
//			  �ڽ��� ��ӹ޴´�   �θ� { 
public class Child extends Parent {
	// Child() { -> ���������ڰ� default�� ����� ���� ��, public�̶� ������ �Ȱ���
	public Child() {
		super(); //�θ� Ŭ������ �⺻ ������ ȣ��
		System.out.println("�ڽ� Ŭ������ �⺻ �������Դϴ�.");
	}
	
	public Child(String name) {
		super(name); //�θ� Ŭ������ ���ڿ� �Ķ���� ������ ȣ��
		System.out.println("�ڽ� Ŭ������ ���ڿ� �Ķ���� �������Դϴ�.");
	}
	
	public void display() {
		super.show(); //�θ� Ŭ������ show ��� �޼ҵ� ȣ��
		System.out.println("�ڽ� Ŭ������ display �޼��� �Դϴ�.");
	}
}

