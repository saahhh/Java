package com.kh.arraysample;

public class TwoArray {

	public static void main(String[] args) {
		// 이중 문자열 배열 선언과 초기화
		String[][] fruits = {
				{"Apple","Banana","Cherry"},
				{"Grape","Orange","Strawberry"},
				{"Kiwi","Mango","pinApple"}
				
		};
		System.out.println("fruits.length : " + fruits.length);
		for(int i = 0; i < fruits.length; i++) { //fruits.length로만 쓰면 cherry는 출력되지 않음, fruits[i]로 입력해줘야함
			System.out.println("첫번째 포문(행) : " + i);
			for(int a = 0; a < fruits[i].length; a++) {
				System.out.println("두번째 포문(열) : " + a);
				System.out.println(fruits[i][a] + " ");
			}
			System.out.println(); //다음행으로 이동할 수 있게 enter용 출력 메소드 입력
			
		}
		
		

	}

}
