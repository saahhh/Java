package com.kh.operator;
 
public class Arithmetic {

	public static void main(String[] args) {
		//1.산술연산자 : 더하기(+) , 빼기(-), 나누기 몫(/), 나누기 나머지(%)
		int num1 = 5;
		int num2 = 2;
		System.out.println("더하기 + : " + (num1 + num2));
		//우선연산자 ()를 써야 제대로 된 계산이 출력된다.
		System.out.println("빼기 - : " + (num1 - num2));
		System.out.println("곱하기 * : " + (num1 * num2));
		System.out.println("나누기 몫 / : " + (num1 / num2));
		System.out.println("나누기 나머지 % " + (num1 % num2));	
	}
}
