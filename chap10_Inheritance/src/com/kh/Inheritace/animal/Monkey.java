package com.kh.Inheritace.animal;

public class Monkey extends Animal{
	public Monkey (String name) {
		super(name);
}	
	public void speak() {
		System.out.println(getName() + " �쳢��");
	}
	@Override //animal�� �����ִ� eat�� ������ �ȿ����� �ٽ� ���Ǹ� ������.
	public void sleep() {
		System.out.println(getName() + " �Ųٷ� �ڴ� ������ ����");
	}
}
