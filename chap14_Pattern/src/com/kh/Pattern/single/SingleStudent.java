package com.kh.Pattern.single;

public class SingleStudent {
	private String name;
	
	//������
	private SingleStudent() {
		
	}
	public void display() {
		System.out.println("�̱� �л��Դϴ�.");
	}
	
	public static void main(String[] args) {
		SingleStudent std1 = new SingleStudent();
		
		std1.display();

	}

}
