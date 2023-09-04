package com.kh.classSample;

public class Student {  //객체는 나만의 예약어
	//1.멤버변수 (학생의 속성)
	String name;
	int age;
	String grade;

	/****** 생성자 ******/
	public Student(String name, int age, String grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	//학생 정보 출력 메서드
	public void displayInfo() {
		System.out.println("학생 이름 : " + name);
		System.out.println("나   이  : " + age);
		System.out.println("학   년  : " + grade);
	}
}