package com.kh.Inheritace.animal;

public class Monkey extends Animal{
	public Monkey (String name) {
		super(name);
}	
	public void speak() {
		System.out.println(getName() + " 우끼끼");
	}
	@Override //animal에 적혀있는 eat을 원숭이 안에서만 다시 정의를 내린다.
	public void sleep() {
		System.out.println(getName() + " 거꾸로 자니 떨어짐 유의");
	}
}
