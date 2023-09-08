package com.kh.Pattern.mvc.Model;

public class StudentModel {

	/*1. 유저 정보 표현
	 * private 이름 나이
	 * getter setter 만들기*/
	
	private String name; //학생이름
	private int age;//학생나이
	
	public StudentModel(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}

	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}



}
