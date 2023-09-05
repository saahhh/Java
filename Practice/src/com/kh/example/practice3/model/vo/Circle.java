package com.kh.example.practice3.model.vo;

public class Circle {
/*
 필드(멤버변수)
 -PI : double = 3.14
 -radius : int = 1

 생성자
 +Circle() -> +setter()/getter()
 
 메소드
 +incrementRadius():void
 +getAreaOfCicle():void
 +getSizeOfCircle():void
 */
	
	//필드(멤버변수)
	double PI = 3.14; //원주율 //getter setter 만들 때 3.14드래그 후 우클릭 -> 소스 ->제너레이트 게터세터
	int radius = 1; //반지름
	
	
	public double getPI() {
		return PI;
	}
	public int getRadius() {
		return radius;
	}
	
	
	public void setPI(double PI) {
		this.PI = PI;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}

	
	//메소드
	public void incrementRadius() {
		radius++;
		System.out.println("radius : " + radius);
	}
	public void	getAreaOfCircle() {
		double area = PI * radius * radius;
		System.out.println("area : " + area);
	}
	public void getSizeOfCircle() {
		System.out.println("원의 반지름 : " + radius);
	}
	
}
