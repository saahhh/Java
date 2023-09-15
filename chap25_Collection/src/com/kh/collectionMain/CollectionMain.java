package com.kh.collectionMain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionMain {

	public static void main(String[] args) {
		// List
		List<String> myList = new ArrayList<>();
		myList.add("사과");
		myList.add("바나나");
		myList.add("딸기");
		
		System.out.println("List : ");
		//향상된 for문 활용해서 출력
		for(String fruit : myList) {
			System.out.println(fruit);
		}
		
		//set 예제
		Set<Integer> myset = new HashSet<>();
		myset.add(1);
		myset.add(2);
		myset.add(3);
		myset.add(2); //중복된 요소는 허용되지 않음
		
		for(Integer number : myset) {
			System.out.println(number);
		}
		
		
	}

}
