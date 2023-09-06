package com.kh.Inheritace.calculator;

import java.util.Scanner;

public class CalculatorRun extends CalculatorForMod{

	public static void main(String[] args) {
		
		/*scanner 이용해서 코드 변경하기*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("계산할 숫자 두 개를 입력하세요");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		Calculator cal = new Calculator();
		
		int result1 = cal.add();
		int result2 = cal.substruct();
		int result3 = cal.multiply();
		int result4 = cal.divide();

		System.out.println("Add : " + result1);
		System.out.println("Substruct : " + result2);
		System.out.println("Multiply : " + result3);
		System.out.println("Divide : " + result4);
		
		
	}

}
