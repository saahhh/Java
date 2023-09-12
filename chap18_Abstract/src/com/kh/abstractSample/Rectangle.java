package com.kh.abstractSample;

/*public*/ class Rectangle extends Shape {
//The type Rectangle must implement the inherited abstract method Shape.calculateArea()
//
	private double width;
	private double height;

	//������
	public Rectangle(String color, double width, double height) {
		super(color);
		this.width = width;
		this.height = height;
	}
	//�߻�޼��� ����
	@Override
	public double calculateArea() {
		return width * height;
	}
	
}