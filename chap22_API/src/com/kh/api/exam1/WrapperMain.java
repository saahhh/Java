package com.kh.api.exam1;

public class WrapperMain {
/*
  Wrapper 기본 데이터 유형을 객체로 래핑(wrap) 
  		  객체로 작업할 때 유용하다
  		  클래스로는 Integer, Double, Boolean 등이 있음
 * */
	public static void main(String[] args) {
		Integer num = 40;
		System.out.println("정수값 : " + num);
		
		//Wrapper 클래스를 기본 데이터 유형으로 반환
		int intValue = num.intValue();
		System.out.println("기본 데이터 유형 값 : " + intValue);
		
		Double pi = 3.14159265359; //대문자로 적은 더블은 객체이다.
	
		//원의 넓이 계산
		double radius = 5.0;
		double area = pi * Math.pow(radius, 2);
		System.out.println("원의 넓이 : " + area);
		
		//문자열을 실수로 변환
		String numStr = "3.14";
		Double parseDouble = Double.parseDouble(numStr);
		//parseInt / parseDouble String 문자열 데이터를 정수, 소수로 변환하겠다.
		System.out.println("문자열을 실수로 변환한 값 : " + parseDouble);
		
		//boolean Wrapper 클래스 만들기
		Boolean isJavaFun = true;
		
		//조건문 활용
		if (isJavaFun) {
			System.out.println("자바는 재밌습니다.");
		} else {
			System.out.println("자바는 재미없습니다.");
		}
	
		String boolstr = "true";
		Boolean parseBool = Boolean.parseBoolean(boolstr);
		System.out.println("문자열을 불리언으로 변환한 값 : " + parseBool);
	}

}
