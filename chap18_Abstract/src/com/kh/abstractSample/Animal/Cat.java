package com.kh.abstractSample.Animal;

public class Cat extends Animal {
	
	//1. cat만들기
	//Cat ct = new Cat("고양이");
	//2.객체배열로 Animal정의해서 출력하기 다형성을 활용한 객체다루기
	//Animal[] animal = new Animal[2];

	public Cat(String name) {
		super(name);	
	}
	
	@Override
	public void makeSound() {
		System.out.println("야옹");
	}
}
	
//	//소리출력
//	for(Animal a : animal) {
//		a.displayName(name);
//		a.makeSound();
//		System.out.println();
//	}
	


