package com.kh.variable;
//test 대신 sample 이나 example을 많이 쓸 것
public class VariableSample {
	public static void main(String[] args) {
		String name;
		name = "쿠팡";
		
		int hour = 15;
		double score = 90.5;
		char grade = 'A';
	    System.out.println("안녕하세요. " + name + "입니다. 오늘 " + hour + "시에 배송됩니다.");
		System.out.println("저의 성적은 " + score + "입니다.");
		System.out.println(score + "은 학점 " + grade + " 입니다.");
		
		//변수에 이름과 나이와 자신의 성적 (double)로 넣기,
		/*
		 이름 String
		 나이 int
		 성적 double
		 char를 이용한 등급 적용하기*/
		
		String name2;
		name2 = "정선아";
		int age2 = 20;
		double score2 = 99.9;
		char grade2 = 'A';
		
		
		System.out.println("안녕하세요. 저는 " + name2 +"입니다.");
		System.out.println("저의 나이는 " + age2 + "입니다.");
		System.out.println(score2 + "은 학점 " + grade2 + "입니다.");
		
	}
	
}
