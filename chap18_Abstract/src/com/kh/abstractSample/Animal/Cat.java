package com.kh.abstractSample.Animal;

public class Cat extends Animal {
	
	//1. cat�����
	//Cat ct = new Cat("�����");
	//2.��ü�迭�� Animal�����ؼ� ����ϱ� �������� Ȱ���� ��ü�ٷ��
	//Animal[] animal = new Animal[2];

	public Cat(String name) {
		super(name);	
	}
	
	@Override
	public void makeSound() {
		System.out.println("�߿�");
	}
}
	
//	//�Ҹ����
//	for(Animal a : animal) {
//		a.displayName(name);
//		a.makeSound();
//		System.out.println();
//	}
	


