package com.kh.Inheritace.animal;

public class Lion extends Animal {
	public Lion (String name) {
		super(name);
	}
	public void run() {
		System.out.println(getName() + " ����");
	}
	public void eat() {
		System.out.println(getName() + " ��");
	}	
}
