package com.kh.practice.t;

import java.util.Scanner;

public class texam4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in); 
		
		System.out.println("문자열을 입력하세요. : ");
		String s = sc.next();
		
		char a = s.charAt(0); //문자를 1자씩 읽음 (몇번째)몇번째 자리를 읽을거야
		// 문자를 한 자리씩 보기 때문에 apple 1자가 넘어가 출력을 할 수 없음 
		// 자리 위치 정해서 출력하기 /때문에 0을 입력하면 a가 출력이 되는 것
		
		System.out.println("index 0번째 자리 : " + a);
		
		char p = s.charAt(1);
		System.out.println("index 1번째 자리 : " + p);
		
		//char indexNum2 = s.charAt(1)로 쓰이기도 함
		
		String p2 = s.substring(2,3); //시작과 끝을 지정 후 출력 가능, 긴 문자도 ()넣을수있음
		// 한자리가 아니라 자리를 지정해서 출력할 수 있음
		// 시작만 정해도 되고, 끝을 지정해도됨
		// 자리 위치 정해서 출력하기
		// 시작만 작성할 경우 시작한 인덱스 위치부터 끝까지 출력된다.
		
		System.out.println("index 2번째 자리 : " + p2);
				
	}

}
