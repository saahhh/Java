package com.kh.abstractSample.Animal;

public abstract class Animal {
	//필드 String name;
	String name;
	
	//생성자
	public Animal(String name) {
		this.name = name;
	}
	
	//추상메서드 동물소리 출력 void makeSound();
	public abstract void makeSound();
	
	//일반메서드 동물이름 출력 void displayName();
	public void displayName(String name) {
		System.out.println("동물이름 : " + name);
		this.name = name;
	}
	public String getdisplayName() {
		return name;
	}
	
}
