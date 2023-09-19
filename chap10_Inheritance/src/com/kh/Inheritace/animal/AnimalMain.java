package com.kh.Inheritace.animal;

public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog myDog = new Dog("´ó´óÀÌ");
		myDog.info();
		myDog.speak();
		myDog.eat();
		
		Cat myCat = new Cat("°í¾çÀÌ");
		myCat.run();
		myCat.eat();
		
		Lion myLion = new Lion("»çÀÚ");
		myLion.run();
		myLion.eat();

		Monkey myMonkey = new Monkey("¿ø¼şÀÌ");
		myMonkey.speak();
		myMonkey.sleep();
	}
}

