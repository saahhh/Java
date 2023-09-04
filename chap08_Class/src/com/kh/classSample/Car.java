package com.kh.classSample;

public class Car {
	//1. ���� = �ʵ� = �������
	String brand;	  //�귣��
	String model;	  //��
	int speed;	 	  //�ӵ�
	boolean engineOn; //���� ����
	/* =============================================================== 
	 ������� �ؿ��� ���(=�̿ܿ���) �޼���� ���� (��� ��������� ������ �ۼ�, ���� �޼��� ����)
	*/
	//2. �����ڴ� �޼����� �Ѱ��� ����
	public Car(String brand, String model) { //���� �� �� �ʼ��� ���� �Ķ���ʹ� �귣��� ��
		this.brand = brand;
		this.model = model;
		this.speed = 100;
		this.engineOn = true;
		//System.out.println("Car ����");
	}
	
	// ���� ���� �޼���
	public void startEngine() { //
		//���࿡ ������ true�� ���� �õ�
		System.out.println("������ " + brand + "�Դϴ�.");
		if(engineOn) {
			System.out.println("������ �õ��մϴ�."); //��� �޼ҵ� �ۼ�
		} else { //������ false�� �̹� ������ �����ִ�.
			System.out.println("�̹� ������ ���� �ֽ��ϴ�.");
		}

	}
	
	//���� �޼���
	public void acclerate(int amount) { //amount (��,ũ��) �ڸ��� �ĸ����� �̸��� ���� ���ϴ� ��
		if(engineOn) {
			//������ true�� ���� �ӵ��� �󸶴�.
			speed += amount;
			System.out.println(amount + "�ӵ��� " + speed +"�Դϴ�.");
		} else {
			System.out.println("�ӵ��� �� �� ����");
			//������ false�� ������ �����־� �ӵ��� �� �� ����.
		}
		
		
	}
}
