package com.kh.abstractSample.Animal;

public class Dog extends Animal {
	private String sound;
	//������ super
	public Dog(String name) {
		super(name);
		this.name= name;
	}
	//@Override
	@Override
	public String makeSound() {
		System.out.println("�۸�");
		return sound;
	
	}
	
}
