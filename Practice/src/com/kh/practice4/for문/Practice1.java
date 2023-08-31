package com.kh.practice4.for문;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		System.out.println("숫자를 입력하세요");
		
		int num = sc.nextInt();
		
		if(num < 1) { //만일 1 미만의 숫자가 입력한 수는 
			System.out.println("1이상의 숫자를 입력해주세요.");
		} else { //1이상인 숫자
			for (int i = 1; i <= num; i++) {
				System.out.println(i);
		}	
		
	}

}
}
