package com.kh.For;

import java.util.Scanner;

public class ForStar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수입력 : ");
		int num = sc.nextInt();
		
		/* 조건문 hard ver pdf
		 	 별찍기 
		 	 사각형		 
		 	 *****
		 	 *	 *
		 	 *   *
		 	 *	 *
		 	 *****
		 */
				
		for (int i = 1; i <=5 ; i++) { // i = 행 숫자/ 행 숫자 행이 1일 때 *을 출력
			for (int j = 1; j <=5; j++) {
				// 행이 1인 경우 (가장 윗줄) 
				// 현재 행에서 출력하는 열이 첫 번째 열일 경우 ( j == 1 )
				// 현재 행에서 가장 마지막인 열일 경우 ( j == num )
				// 행이 마지막일 경우 (가장 아랫줄)
				if( i == 1 || i == num || j == 1 || j == num) { // j = 열 숫자/
					System.out.print("*");
					System.out.print("");
				} else {
					System.out.print("&"); //&대신 공백을 넣기
				}	
				//System.out.println(); //줄바꿈
			}
			//System.out.print("*");
			//System.out.print(" ");
			System.out.println();
		}
		
	}

}
