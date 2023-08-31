package com.kh.Whilesample;

public class While03 {

	public static void main(String[] args) {
		// 반복적으로 출력(무한루프)
		int i = 1;
		/*i가 1부터 10까지 출력되게 하기*/
		while (i <= 10) { //i가 5보다 같거나 작을 때 true //숫자가 5가 될 때 출력을 멈추고 싶어
			System.out.println(i); // 위 부등호가 참일 경우
			i = ++i; //i = i + 1; // i++; -> 무한루프 끝나게 만들기 = ++i
			/*
			 i++ 일 때 i가 1인 값을 먼저 대입했기 때문에 ++가 작동하지 않는다. 고로 무한루프가 발생한다.
			 ++i 일 때는 i에 +1을 먼저 대입했기 때문에 무한루프가 발생하지 않는다.
			 */
		
			
		}
		
	}

}
