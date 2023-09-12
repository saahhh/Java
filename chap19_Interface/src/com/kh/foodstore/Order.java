package com.kh.foodstore;

import java.util.ArrayList;
import java.util.List;

//주문 객체2 출력하는 문구 변경
public class Order implements FoodStore{
	private List<Menu> OrderMenus; // ordermenus=주문을 받아 놓은 곳
	
	public Order() {
		OrderMenus = new ArrayList<>(); //주문한 내용물
		
	}
	
	@Override
	public void addMenu(String menu) {
		Menu menuA = new Menu(menu);
		OrderMenus.add(menuA);
	}
	
	@Override
	public void removeMenu(String menu) {
		System.out.println(menu);
	}
	
	@Override
	public void printMenu() {
		System.out.println("주문내역");
		for(Menu menuA : OrderMenus) {
			System.out.println(menuA.getItem());
		}
//		OrderMenus.getItem();
	
	}
}

//주문 객체2 출력하는 문구 변경
	public class Order2 implements FoodStore{
		private List<Menu> OrderMenus;
		
		public Order2() {
			OrderMenus = new ArrayList<>();
			
		public void addMenu
			
		}
	}
	
