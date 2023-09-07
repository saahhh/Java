package com.kh.thisSample;
/*
this 객체(=인스턴스) 자신을 가리키는 참조변수 객체(=인스턴스)의 주소가 저장되어 있음
참조변수는 직접적으로 값을 주지 않음
this() 현재 클래스의 다른 생성자를 호출하는데 사용

	int x = 10; //정수 x를 10이라는 값을 할당
	int y = x; //참조변수 y는 x를 가리킨다.
	
	x = 20;
	System.out.println("y :" + y);// y값을 주기 않았기 때문에 10이 나옴
	
	x=20;
	y=x;
	System.out.println("y : " + y);//20이 나옴
	
	int[] list1 = {1,2,3};
	int[] list2 = list1; //list2  list1	
*/
/*
인스턴스와 객체
객체 = 인스턴스, 똑같은 말인데 메모리관련으로 조금 다름
객체 클래스의 인스턴스	
*/


class MyClass{
	int myField; //myField에 this.myfield가 이미 써있는 것
	
	//첫 번째 생성자
	MyClass() {
		//this.myField=0; // this() 사용해서 다른 생성자 호출
		this(0);
	}
	//두 번째 생성자
	MyClass(int value) { //MyClass는 인스턴스 변수
		this.myField = value;
		
	}
	void printValue() {
		System.out.println("myField의 값 : " + this.myField);
	}
}

public class ThisMain {

	public static void main(String[] args) {
		MyClass obj1 = new MyClass(); //첫 번째 생성자 호출
		MyClass obj2 = new MyClass(10); //두 번째 생성자 호출
		
		obj1.printValue();
		obj2.printValue();
	}

}

