package com.kh.For;

import java.util.Scanner;

public class for02 {

	public static void main(String[] args) {
		// 구구단 만들기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 입력하세요.");
		int num1 = sc.nextInt();
		
		System.out.println("두번째 숫자를 입력하세요.");
		int num2 = sc.nextInt();
		
		int result = 0; //최초 값을 0으로 줍니다. 
		for (int i = 0; i < num2; i++) { //for 루프를 사용해서 i 변수를 0부터 num2 미만까지 반복, 이 루프는 두번째 숫자인 num2 만큼 반복
			result += num1; //result 변수에 num1 값을 더함 
							//num2 만큼 num1을 더하는 효과를 줌
			System.out.println("for문 안 : " + num1 + " * " + num2 + " = " + result);
		}
		//System.out.println(num1 + " * " + num2 + " = " + result); //for문 밖
		//계산된 결과를 출력, 입력받은 두 숫자와 결과값을 문자열로 결합해서 출력
		
		System.out.println("첫번째 숫자를 입력하세요.");
		int num3 = sc.nextInt();
		
		System.out.println("두번째 숫자를 입력하세요.");
		int num4 = sc.nextInt();
		
		int result2 = 0;
		for(int i = 1; i<= num4; i++) {
			result2 += num3;
			System.out.println("구구단 : " + num3 + " * " +  i + " = " + result2);
		//num3,4를 고정시킨 값이기 때문에 5*6으로만 출력됨 따라서 출력값에 i를 넣어주면 1,2,3,4,5로 올라간다
		}
		
	}

}
