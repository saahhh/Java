package com.kh.variable;

public class VariableConversion {
		public static void main(String[] args) {
	//1. 자동형변환(암시적형변환, 묵시적형변환)	
		int intNum = 100;
		System.out.println(intNum); //숫자 100을 의미
		long longNum = intNum; //=long longNum = 100; //int를 long으로 자동 형변환
		System.out.println(longNum);
		
		float floatNum = 3.14f;
		double doubleNum = floatNum; //float를 double로 자동 형변환
		
		//int -> long 변경하는 형변환 2가지 만들고 출력하기
		int intNum2 = 10;
		System.out.print("intNum2 : ");
		System.out.println(intNum2);
		int longNum2 = intNum2;
		System.out.println(longNum2);
		
		int intNum3 = -100;
		System.out.print("intNum3 : ");
		System.out.println(intNum3);
		int longNum3 = intNum3;
		System.out.println(longNum3);
		
		//short -> int 변경하는 형변환 1가지 만들고 출력하기
		short shortNum = 32000;
		System.out.print("shortNum : ");
		System.out.println(shortNum);
		int intNum4 = shortNum;
		System.out.println(intNum4);
			
		
		//float -> double 변경하는 형변환 1가지 만들고 출력하기
		float floatNum2 = 3.14f;
		System.out.println(floatNum2);
		
		double doubleNum2 = floatNum2;
		System.out.println(doubleNum2);
		
	//2. 명시적 형변환(강제 형변환)
		//long -> int
		long largeLong = 12345789012345L;
		System.out.print("largeLong : ");
		System.out.println(largeLong);
		int largeInt = (int) largeLong;
		System.out.println(largeInt); // long을 int로 강제 형변환 할 경우 범위안에 있지 않으면 일부데이터는 손실된다.
									  // 123456789012345로 넣었을 때 결과 값은 데이터가 손실된 값
		
		double largeDouble1 =12345.6789;
		int intPart = (int) largeDouble1;
		System.out.println(intPart); // 실수를 int로 강제 형변환 할 때 (정수 부분만 유지된다.)
		
		
		//문자와 숫자간의 형변환 2개 출력
		//문자는 char charBalue = 'Z'; -> int로 변경
		char charBalue = 'Z';
		int intNum7 = charBalue;
		System.out.print("charBalue : ");
		System.out.println(intNum7);
		//결과값이 90인 것은 아스키코드에서 Z가 90로 표기, A는 65로 표기이기 때문
		//cf.아스키코드
		
		char charValue = 'A';
		int intNum8 = charValue;
		System.out.print("charValue : ");
		System.out.println(intNum8);
		
		//double -> int로 형변환 출력 1개
		double doubleNum3 = 3.14;
		System.out.print("doubleNum3 : ");
		System.out.print(doubleNum3);
		//int intNum9 =
		
		
		//int를 short로 형변환 1개 출력
		
		}
}
