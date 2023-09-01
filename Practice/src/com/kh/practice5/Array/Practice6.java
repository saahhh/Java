package com.kh.practice5.Array;

import java.util.Scanner;

public class Practice6 {

	public static void main(String[] args) {
		// 
		Scanner sc = new Scanner(System.in);
		System.out.println("0 ~ 6 사이 숫자 입력 : ");
		int i = sc.nextInt();
		if (i < 7) {
			String[] day = {"월", "화", "수", "목", "금", "토", "일"};
			System.out.println(day[i]);
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}

		
		
	}

}
