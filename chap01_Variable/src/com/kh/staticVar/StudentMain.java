package com.kh.staticVar;

public class StudentMain {
	public static void main(String[] args) {
		StaticVar stkim = new StaticVar();
		stkim.setStudentName("kh");
		//System.out.println(stkim.serialNum);
		//학교에서 학생 회원가입
		//일단 우리 학교 학생이 맞는지 확인
		//우리학교 학생 인증키;
		//시리얼넘버를 수정해서 -> 20
		//kh학생1 20
		//kh학생2 20 //20으로 통일되게 할 때 static사용
		System.out.println("kh학생1");
		stkim.serialNum++;
		
		StaticVar khLee = new StaticVar();
		khLee.setStudentName("KH 2학생");
		System.out.print("KH stkim : ");
		System.out.println(stkim.serialNum);
		System.out.print("KH 2학생 : ");
		System.out.println(khLee.serialNum);
		
		
	}
}
