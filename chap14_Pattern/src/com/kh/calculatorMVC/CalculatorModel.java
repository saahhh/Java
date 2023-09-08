package com.kh.calculatorMVC;

public class CalculatorModel {
	private int number;
	
	public void setNumer(int number) {
		this.number = number;
	}
	public int calculateSquare() {
		return number * number;
	}
}
