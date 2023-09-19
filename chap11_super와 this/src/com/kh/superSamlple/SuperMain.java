package com.kh.superSamlple;

public class SuperMain {

	public static void main(String[] args) {
		Child child1 = new Child(); //생성자호출
		System.out.println("=================");
		
		Child child2 = new Child("홍길동");
		System.out.println("*****************");
		
		child2.display(); //super.display();했을 때 어떻게 되는지?
		//super.display(); 를 사용하고 싶다면 어떻게 해야하는지?	
	}
}
