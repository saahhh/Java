package com.kh.abstractSample.Animal;

public class Dog extends Animal {
	private String sound;
	//积己磊 super
	public Dog(String name) {
		super(name);
		this.name= name;
	}
	//@Override
	@Override
	public String makeSound() {
		System.out.println("港港");
		return sound;
	
	}
	
}
