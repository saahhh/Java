package com.kh.foodstore;

import java.util.ArrayList;
import java.util.List;

//�ֹ� ��ü2 ����ϴ� ���� ����
public class Order implements FoodStore{
	private List<Menu> OrderMenus; // ordermenus=�ֹ��� �޾� ���� ��
	
	public Order() {
		OrderMenus = new ArrayList<>(); //�ֹ��� ���빰
		
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
		System.out.println("�ֹ�����");
		for(Menu menuA : OrderMenus) {
			System.out.println(menuA.getItem());
		}
//		OrderMenus.getItem();
	
	}
}

//�ֹ� ��ü2 ����ϴ� ���� ����
	public class Order2 implements FoodStore{
		private List<Menu> OrderMenus;
		
		public Order2() {
			OrderMenus = new ArrayList<>();
			
		public void addMenu
			
		}
	}
	
