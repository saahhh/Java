package com.kh.exceptionPractice;

public class PracticeMain {

	public static void main(String[] args) {
		PracticeMain p = new PracticeMain();
		//p.ArithException();	
		//p.NPException();
		p.NumFormatException();
	}
	
	public void ArithException() {
		//int dividend / divisor 나누었을 때 예외처리
		int dividend = 100;
		int divisor = 0;
		try {
			int result = 100/0;
			System.out.println("Result : " + result);
		} catch(ArithmeticException e) {
			System.out.println("에러 : " + e.getMessage());
		}
	}

	public void NPException() {
		String text = "Hello World";
		String subtext = null;
//		int length = text.indexOf(subtext); //Hello World 길이 얻기
		try {
			//indexOf subText에 있는 null 값을 포함한 문자열 검색
			int length = subtext.length();
			System.out.println(length);
		} catch (NullPointerException a) {
			System.out.println("NullPointerException 에러 발생" + a.getMessage());
		}
	}
	
	public void NumFormatException() {
		try {
			String text = "123.45";
			int number = Integer.parseInt(text); 
			//부적절한 형식의 문자열을 정수로 변환
			System.out.println(number);
		} catch(NumberFormatException e) {
			System.out.println(e.getMessage());
		}
	} 
}
