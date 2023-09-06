package com.kh.Inheritace.animal;

public class Dog extends Animal {
	public Dog(String name) {
		super(name); //상위 클래스(Animal)의 멤버에 접근하는 데 사용
						//super 키워드 : 자식클래스에서 부모클래스의 멤버를 참조할 때 super 키워드를 사용할 수 있다	
	}
	public void speak() {
		System.out.println(getName() + " 멍멍 (주인이짖네)");
	}
	public void eat() {
		System.out.println(getName() + " 냠");
	}	
}

