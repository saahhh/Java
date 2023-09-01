package com.kh.arraysample;

import java.util.Scanner;

public class Array01 {

	public static void main(String[] args) {
		// Array
		// 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것
		/*
		 	동일한 데이터 타입을 가진 여러 값을 한 곳에 저장하고
		 	인덱스를 사용하여 각 값에 접근할 수 있도록 제공
		 	배열은 프로그램에서 데이터를 보다 효율적으로 저장하고 관리하는데에 사용
		 	데이터의 집합을 쉽게 다룰 수 있도록 도와준다
		 
		   배열의 구조
		 	배열 생성 및 초기화
		 	데이터타입[] 배열이름 = new 데이터타입[크기];
		 
		   특징 : 
		  1. 고정된 크기 : 생성할 때 크기가 결정되고, 크기가 고정되어 있음
		  				생성 후에는 크기를 변경할 수 없음
		  2. 같은 데이터 타입 : 배열 내에 모든 요소는 동일한 데이터타입을 가져야한다.
		  					ex) int타입의 배열은 모든 요소 점수
		  3. index 기반 접근 : 각 배열 요소는 순차적인 인덱스를 가지며
		  					0부터 시작해서 배열 크기 -1까지의 값을 가짐
		  					인덱스를 사용해서 특정 위치에 있는 요소 접근이 가능하다
		  					ex) 배열 크기 = 5로 줬다면 index는 0 ~ 4(0부터 시작하기 때문)
		  4. 배열의 길이 (length) : 배열의 길이를 알 수 있다.
		  	 					
		*/
		 int score1, score2, score3, score4, score5;
		 //score가 5개지만 나중에 score가 1000개 라면? -> 배열사용
		 //int 타입 배열을 생성
		 int[] score = new int[5]; //new를 사용해야 무언가가 나타난다 라는 뜻 (스캐너랑 같은 원리)
		 
		 score[0] = 1;
		 score[1] = 2;
		 score[2] = 3;
		 score[3] = 4;
		 score[4] = 5;
		 
		 
		//String[] stringArray = new String[4]; //인덱스를 사용하는 이유는 ""안에 어떤 값이 들어갈지 모를 때
		//String[] stringArray = {" ", " ", " ", " ", " "}; //""안에 어떤 값이 들어갈지는 모르지만 [숫자]자리가 필요한 것 -> 0,1,2,3,4
		
				//자리 번호표		0		1		2		3		4
		//String[] nameArray = {"김경난", "김말똥", "홍길동", "박철수", "허허허"};
		 
		/*
		String[] stringArray = new String[4];
		stringArray[0] = "가";
		System.out.println("stringArray : " + stringArray[0]); //출력값 : stringArray : null (아무것도 넣지 않았기때문)
		stringArray[1] = "나";
		System.out.println("stringArray : " + stringArray[1]);
		stringArray[2] = "다";
		System.out.println("stringArray : " + stringArray[2]);
		stringArray[3] = "라";
		System.out.println("stringArray : " + stringArray[3]);
		//{가, 나, 다, 라}
		*/
		
		//String[] nameArray = {"김경난", "김말똥", "홍길동", "박철수", "허허허"};
		String[] food = {"과자", "과일", "음식", "불고기"}; //3
		int foodLength = food.length;
		System.out.println("food 배열의 길이 : " + foodLength);
		
		 
		 
		 /*
		 //System.out.println(score); //[I@5e91993f
		 //System.out.println(score[0]); //1
		 
		 Scanner sc = new Scanner(System.in);
		 int[] arr = new int[5]; 
		 // index 0~4까지 만들기
		 // 배열은 int 5개를 생성
		 
		 for(int i = 0; i < 5; i++) {
			 arr[i]= sc.nextInt();
			 System.out.println(arr[i]);
			 
		//stack(저장) heap(임시저장영역)
		//arr			[]
		*/ 


				 
	}

}
