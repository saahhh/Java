package com.kh.objExam;

import java.util.Scanner;

public class PracticeMain {

	public static void main(String[] args) {
		PracticeMain pm = new PracticeMain();
		//practice1();	
	}
		public void practice1() {
			//Scanner 이용해서 구현
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 문자열을 입력하세요.");
		String str = sc.nextLine();
		System.out.println("두 번째 문자열을 입력하세요.");
		String str2 = sc.nextLine();
		
		sc.close();
		
		//문자열 비교
		if(str.equals(str2)) {
			
		}
		
		
		//hashCode()
		int hashCode = str.hashCode();
		int hashCode2 = str2.hashCode();
		System.out.println("첫 번째 문자열의 해시코드 : " + hashCode);
		System.out.println("두 번째 문자열의 해시코드 : " + hashCode2);
		
		//toString()
		String strString = str.toString();
		String str2String = str2.toString();
		System.out.println("첫 번째의 문자열 표현 : " + strString);
		System.out.println("두 번째의 문자열 표현 : " + str2String);
	}

}
