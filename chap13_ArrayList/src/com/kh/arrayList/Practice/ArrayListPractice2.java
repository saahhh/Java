package com.kh.arrayList.Practice;

public class ArrayListPractice2 {

	public static void main(String[] args) {
		/*
		   향상된 for문
			for 반복 작업을 할 때 사용되는 제어 구조
			특정 조건이 참인 동안 또는 리스트, 배열 등의 컬렉션 요소를 하나씩 처리할 때 사용
			
			코드 구조
			for(요소의데이터타입 변수명 : ArrayList변수명) {
			//처리 요소 코드
			}
			
			숫자를 출력하기 (String이용금지)
			int[] numbers = {1,2,3,4,5}
		*/
		
		int[] numbers = {1,2,3,4,5};
			for(int num : numbers) {
				
			}
			System.out.println("숫자 출력 : " + numbers[0] + numbers[1] + numbers[2] + numbers[3] + numbers[4]);
			
	}

}