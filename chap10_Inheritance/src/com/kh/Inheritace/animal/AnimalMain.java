package com.kh.Inheritace.animal;

public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog myDog = new Dog("�����");
		myDog.info();
		myDog.speak();
		myDog.eat();
		
		Cat myCat = new Cat("�����");
		myCat.run();
		myCat.eat();
		
		Lion myLion = new Lion("����");
		myLion.run();
		myLion.eat();

		Monkey myMonkey = new Monkey("������");
		myMonkey.speak();
		myMonkey.sleep();
	}
}

