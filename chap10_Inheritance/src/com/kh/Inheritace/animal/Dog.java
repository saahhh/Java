package com.kh.Inheritace.animal;

public class Dog extends Animal {
	public Dog(String name) {
		super(name); //���� Ŭ����(Animal)�� ����� �����ϴ� �� ���
						//super Ű���� : �ڽ�Ŭ�������� �θ�Ŭ������ ����� ������ �� super Ű���带 ����� �� �ִ�	
	}
	public void speak() {
		System.out.println(getName() + " �۸� (������¢��)");
	}
	public void eat() {
		System.out.println(getName() + " ��");
	}	
}

