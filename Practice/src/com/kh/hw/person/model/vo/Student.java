package com.kh.hw.person.model.vo;

public class Student {
	private int grade;
	private String major;
	
	public Student(int grade,String major) {
		this.grade = grade;
		this.major = major;
	
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	public int getGrade() {
		return grade;
	}
	public String getMajor() {
		return major;
	}
	
}
