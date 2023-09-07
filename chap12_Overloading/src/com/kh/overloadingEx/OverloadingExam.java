package com.kh.overloadingEx;
/* 
 Java 파일을 만드는데
 OverSample.java를 만들고
 오버로딩 5개 만들고 5개 출력하기
 */

public class OverloadingExam {
	//정수형 덧셈
	public int sum(int a, int b) {
		return a+b; //void를 안썼기 때문에 return을 씀
	}
	
	//세 개의 정수형 덧셈
	public int sum(int a, int b, int c) {
		return a+b+c;
	}
	
	//두 개의 실수형 덧셈
	public double sum(double a, double b) {
		return a+b;
	}
	public double sum(double a, double b, double c) {
		return a+b+c;
	}
	
	 public static void main(String[] agrs) {
		 OverloadingExam obj = new OverloadingExam();
		 
		 
		 //메서드 호출
		 System.out.println("두 정수의 합 : " + obj.sum(10,20));
		 System.out.println("세 정수의 합 : " + obj.sum(10,20,30));
		 System.out.println("두 실수의 합 : " + obj.sum(10.5, 10.5));
		 System.out.println("세 실수의 합 : " + obj.sum(10.5, 10.5, 10.5)); 
		 
	 }
}
