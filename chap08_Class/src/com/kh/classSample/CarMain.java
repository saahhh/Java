package com.kh.classSample;

public class CarMain {

	public static void main(String[] args) {
		//public Car(String brand, String model)
		System.out.println("");
		
		Car myCar = new Car("Toyota", "carmy"); //������ //Scanner�� ���� ���� //myCar�� ���Ƿ� ������ ��
		myCar.startEngine();
		myCar.acclerate(50);
	}

}
