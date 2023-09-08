package com.kh.arrayList.Practice;

import java.util.Scanner;

public class UserScannerMain {

	public static void main(String[] args) {
		/*사용자로부터 5개의 정수를 입력받아서 배열에 저장한다음,
		향상된 for 문을 사용해서 배열의 모든 요소를 더한 결과 출력 */
		
		//정수 입력받는 스캐너 만들기
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 5개를 입력하세요");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();
		int num5 = sc.nextInt();
		
		int[]numbers = new int[5];
		
		//배열에다가 5개의 정수를 입력하는 for문
//		for(인덱스 0으로 시작해서 하나씩 담자; 0부터~(5-1)까지 집어넣게해; 하나씩 증가시켜);
		/* 풀이방법1.
		 * int[]
				numbers = new int[5];
		for(int i = 0; i <= 4; i++) {
			//ArrayList 경우 color.get(0)
			//배열은 [] 안에 넣음
			//근데 배열의 자리가 없네?? 배열의 자리 먼저 만들어주자
			//어떻게?
			//바깥에다가 int numers 의 배열을 만들어줘야지
			//포문이 시작하기 전에 전체적인 장바구니는 만들어줘야지!
			System.out.println("정수 index " + (i) + "i");
//			System.out.println("정수 자리값 " + (i + i) + "i");
			numbers[i] = sc.nextInt();
			
		}*/
		
		
		
		/*코드 구조
		for(요소의데이터타입 변수명 : ArrayList변수명) {*/
		
		//풀이방법2.
		//배열의 모든 요소를 더한 결과 출력
		//조건의 최종까지 더하는 것이기 때문에 향상된 for문 사용
		//또는 기본for문을 사용하고 싶다면 length를 이용해서 출력 가능
		
		//		숫자1개씩		전체숫자
		int sum = 0;
		for(int number : numbers) {
			sum += number;
		}
//		int[] numbers = {num1,num2,num3,num4,num5};
//		for(int i : numbers) {
//			
//		}
//		System.out.println(num1+num2+num3+num4+num5);

		//합산된 결과 출력
		System.out.println("배열의 모든 요소를 더한 결과 : " + sum);
	}

}