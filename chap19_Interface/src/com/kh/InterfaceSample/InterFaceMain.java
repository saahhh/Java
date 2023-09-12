package com.kh.InterfaceSample;

public class InterFaceMain {

	
	public static void main(String[] args) {
	/*	MyInterface myin;
		myin = new MyClass();
	  //MyInterface 변수명 = new MyInterface();
							   //객체가 아니기 때문에 생성할 수 없음 */
		MyInterface myin = new MyClass();
		myin.doMyInterFace();
	}

}
