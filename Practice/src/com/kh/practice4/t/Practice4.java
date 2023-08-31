package com.kh.practice4.t;

import java.util.Scanner;

public class Practice4 {

	public static void main(String[] args) {
		/*메소드 명 : public void practice4(){}
		위 문제와 모든 것이 동일하나, 1 미만의 숫자가 입력됐다면
		“1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
		ex.
		1이상의 숫자를 입력하세요 : 4    1이상의 숫자를 입력하세요 : 0
		4 3 2 1                   1이상의 숫자를 입력해주세요.
		                          1이상의 숫자를 입력하세요 : 8
		                          8 7 6 5 4 3 2 1*/ 
		
			Scanner sc = new Scanner(System.in);
			boolean isChoice = false;
			
			while (!isChoice) {
				System.out.println("1이상의 숫자를 입력하세요.");
				int num = sc.nextInt();
		
			if(num < 1) {
				System.out.println("1이상의 숫자를 입력하세요.");
			} else {			
			for (int i = num ; i > 0 ; i--) {
				System.out.println(i);
				//+=사용하기
			}
				isChoice = true;
		}
	}

}
}
