package com.kh.GenericsMain;

import java.util.ArrayList;

public class GenericsMain {

	public static void main(String[] args) {
		// 정수형 데이터를 저장하는 ArrayList
		ArrayList<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		
		// 문자열 데이터를 저장하는 ArrayList
		ArrayList<String> strList = new ArrayList<>();
		strList.add("Hello");
		strList.add("World");
		
		// 제너릭 메서드를 사용해서 요소 출력
		printList(intList); 
		printList(strList);
		

	}

	public static <T> void printList(ArrayList<T> list) { //printList(intList);를 사용할 수 있게 추가해준것
		for (T item : list) {
			System.out.println(item);
			
		}
	}
}

