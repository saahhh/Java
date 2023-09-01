package com.kh.practice4.for문;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 1번 문제와 모든 것이 동일 하나, 1미만의 숫자가 입력했다면
		 "1 이상의 숫자를 입력해주세요"가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
		
		문제) 위 문제와 모든 것이 동일하나, 1 미만의 숫자가 입력됐다면
		“1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
			ex.
			1이상의 숫자를 입력하세요 : 4 	1이상의 숫자를 입력하세요 : 0
			1 2 3 4 				1 이상의 숫자를 입력해주세요.
			1이상의 숫자를 입력하세요 : 8
			1 2 3 4 5 6 7 8
		*/
		
		Scanner sc = new Scanner(System.in);
			
		boolean isChoice = false;
		//boolean isTrue = true;
		
		//1.조건 값 만들기 boolean 변수 = true of false;
			while(!isChoice) {     // 2.조건 추가하기
			//while(!isTrue)	
				System.out.println("숫자를 입력하세요.");
				int num = sc.nextInt();
			
				if(num < 1) {    //만일 1 미만의 숫자가 입력한 수는 
				System.out.println("1이상의 숫자를 입력해주세요.");
			
				} else { //1이상인 숫자
			for (int i = 1; i <= num; i++) {
				System.out.println(i);
			}	
				isChoice = true; //3. 조건 false
		  }	

		}
	}
}
