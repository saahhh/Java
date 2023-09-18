package com.kh.Practice;

public class User implements Comparable<User>{
//CompareExam -> User, Student, Actor  rename
//implement Compare
	
	private String name;
	private int age;
	
	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int compareTo(User otherUser) {
		return this.age -otherUser.age;
	}
	
	@Override 
	public String toString() {
		return "User name = " + name + ", age = " + age; 
	}

}