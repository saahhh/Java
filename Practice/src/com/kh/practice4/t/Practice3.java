package com.kh.practice4.t;

import java.util.Scanner;

public class Practice3 {

		public static void main(String[] args) {
			/*사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
			단, 입력한 수는 1보다 크거나 같아야 합니다.
			ex.
			1이상의 숫자를 입력하세요 : 4   1이상의 숫자를 입력하세요 : 0
			4 3 2 1                  1 이상의 숫자를 입력해주세요.*/

			Scanner sc = new Scanner (System.in);
			
			System.out.println("숫자를 입력하세요");
			int num = sc.nextInt();
				
				if(num < 1) {
					System.out.println("1이상의 숫자를 입력해주세요.");
				} else { //1이상인 숫자
					for (int i = num; i > 0 ; i-- ) { //for문 안에 채우기
						System.out.println(i);
				}		
		}	
	}
}
