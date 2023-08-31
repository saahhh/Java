package com.kh.practice2.t;

import java.util.Scanner;

public class CastingPractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자 입력");
		char inputChar = sc.next().charAt(0); // sc.next(); 에서 끝내도됨, charAt();은 입력받은 문자 출력
		
		int changeChar = inputChar;
		System.out.println("입력문자 : " + inputChar + "유니코드 : " + changeChar);
		
	}

}
