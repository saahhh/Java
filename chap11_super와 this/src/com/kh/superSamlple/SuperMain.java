package com.kh.superSamlple;

public class SuperMain {

	public static void main(String[] args) {
		Child child1 = new Child(); //������ȣ��
		System.out.println("=================");
		
		Child child2 = new Child("ȫ�浿");
		System.out.println("*****************");
		
		child2.display(); //super.display();���� �� ��� �Ǵ���?
		//super.display(); �� ����ϰ� �ʹٸ� ��� �ؾ��ϴ���?	
	}
}
