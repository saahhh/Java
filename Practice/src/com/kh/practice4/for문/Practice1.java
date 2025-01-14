package com.kh.practice4.for문;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		/*
		사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
		단, 입력한 수는 1보다 크거나 같아야 합니다.
		만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
			ex.
			1이상의 숫자를 입력하세요 : 4 		1이상의 숫자를 입력하세요 : 0
			1 2 3 4 					1 이상의 숫자를 입력해주세요.
		*/

		Scanner sc = new Scanner (System.in);
		
		System.out.println("숫자를 입력하세요");
		
		int num = sc.nextInt();
		
		if(num < 1) { //만일 1 미만의 숫자가 입력한 수는 
			System.out.println("1이상의 숫자를 입력해주세요.");
		} else { //else의 조건은 1이상인 숫자들
			for (int i = 1; i <= num; i++) {
				System.out.println(i);
		}	
		
	}

}
}


