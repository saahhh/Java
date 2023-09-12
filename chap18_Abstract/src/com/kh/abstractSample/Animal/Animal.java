package com.kh.abstractSample.Animal;

public abstract class Animal {
	//�ʵ� String name;
	String name;
	
	//������
	public Animal(String name) {
		this.name = name;
	}
	
	//�߻�޼��� �����Ҹ� ��� void makeSound();
	public abstract void makeSound();
	
	//�Ϲݸ޼��� �����̸� ��� void displayName();
	public void displayName(String name) {
		System.out.println("�����̸� : " + name);
		this.name = name;
	}
	public String getdisplayName() {
		return name;
	}
	
}
