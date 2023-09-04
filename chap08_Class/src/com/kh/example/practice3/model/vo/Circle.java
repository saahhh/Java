package com.kh.example.practice3.model.vo;

public class Circle {
/*
 필드(멤버변수)
 -PI : double = 3.14
 -radius : int = 1

 생성자
 +Circle()
 
 메소드
 +incrementRadius():void
 +getAreaOfCicle():void
 +getSizeOfCircle():void
 */
	
	//필드(멤버변수)
	double PI = 3.14; //원주율
	int radius = 1; //반지름
	//생성자
	public Circle() { //기본 생성자, 아무런 초기화를 진행하지 않는다.
	//(double PI, int radius) {
//		this.PI = 3.14; //PI대신 3.14 넣기
//		this.radius = 1; //radius대신 1 넣기
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
