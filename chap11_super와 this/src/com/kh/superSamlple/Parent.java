package com.kh.superSamlple;
//��ӹ޾Ƽ� super(), super. ������ Ȯ��
/*
super. = �θ� Ŭ������ ������ �޼��忡 �����ϱ� ���� ���
super() = �θ� Ŭ������ �����ڸ� ȣ���ϱ� ���� ���
			����Ŭ������ �����ڿ��� ù ��° �ٿ� ȣ�� �Ǿ�� ��!
* */
public class Parent {
	String name;
	
	Parent() {
		System.out.println("�θ� Ŭ������ �⺻ �������Դϴ�.");
	}
	//������(�Ķ����)
	Parent(String name){
		this.name = name; //this��� �̸��� ����ؼ� �ν��Ͻ� ������ ���� ������
		System.out.println("�θ� Ŭ������ ���ڿ� �Ķ���� ������ �Դϴ�! �̸� : " + name);
	}

	public void show() {
		System.out.println("�θ� Ŭ������ show �޼��� �Դϴ�.");
	}

}


