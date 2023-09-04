package com.kh.classSample;

public class CarMain {

	public static void main(String[] args) {
		//public Car(String brand, String model)
		System.out.println("");
		
		Car myCar = new Car("Toyota", "carmy"); //생성자 //Scanner와 같은 원리 //myCar는 임의로 지정한 것
		myCar.startEngine();
		myCar.acclerate(50);
	}

}
