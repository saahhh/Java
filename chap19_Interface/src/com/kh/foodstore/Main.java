package com.kh.foodstore;

public class Main {

	public static void main(String[] args) {
		//						FoodStore -> Order //FoodStore가 상속된 곳을 참고
		FoodStore order = new Order();
		order.addMenu("짬뽕주문");
		order.addMenu("짜장면주문");
		order.addMenu("굴짬뽕주문");
		order.printMenu();
		
		FoodStore order1 = new Order();
		order.addMenu("밥주문");
		order.addMenu("굴비주문");
		order.addMenu("생선주문");
		order.printMenu();		
		

	}

}
