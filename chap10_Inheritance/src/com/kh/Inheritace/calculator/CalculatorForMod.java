package com.kh.Inheritace.calculator;


/* 나눈 다음 나머지를 구할 수 있는 기능이 추가된 계산기로 업그레이드!*/
public class CalculatorForMod extends Calculator {
	
	int a,b;
	public int mod(int a , int b) {
		return a % b;
	}
	
}


/*public class CaluculatorForMod extends Calculator {
	public int mod(int a, int b) {
		return a % b;
	}
}*/