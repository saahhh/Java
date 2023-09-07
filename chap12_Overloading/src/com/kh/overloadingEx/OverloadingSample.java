package com.kh.overloadingEx;

public class OverloadingSample {

	/*오버로딩된 메서드들은 매개변수 타입(int,double...), 개수, 순서가 달라야 됨*/

	public int sum (int a, int b) { //이 줄이 메서드
		return a+b;
	}
	public int sum (int a, int b, int c) {
		return a+b+c;
	}
	public double sum (double a, double b) {
		return a+b;
	}
	public double sum (double a, double b, double c) {
		return a+b+c;
	}
	public int sum (int a, int b, int c, int d) {
		return a+b+c+d;
	}

	public static void main(String[] args) {
		OverloadingSample obj = new OverloadingSample();
	
		System.out.println("두 정수의 합 : " + obj.sum(10,20));
		System.out.println("세 정수의 합 : " + obj.sum(10,20,30));
		System.out.println("두 실수의 합 : " + obj.sum(5.5,5.5));
		System.out.println("세 실수의 합 : " + obj.sum(5.5,5.5,5.5));
		System.out.println("네 정수의 합 : " + obj.sum(10,20,30,40));
	
	}		
		
}


