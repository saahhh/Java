package com.kh.collectionPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PracticeCollection {

	public static void main(String[] args) {
		PracticeCollection pc = new PracticeCollection();
		pc.practiceList();
		pc.practiceSet();
		pc.practiceMap();
	}
	
	public void practiceList() {
		List<String> pList = new ArrayList<>();
		//String add 해보고 for문 출력
		pList.add("아아");
		pList.add("아바라");
		pList.add("뜨아");
		pList.add("아아"); //중복허용
		
		System.out.println("List : ");
		
		for(String coffee : pList) {
			System.out.println(coffee);
		}

	}
	//String add 해보고 for문 출력, 중복된 값 add 넣어서 연습해보기
	public void practiceSet() {
		Set<String> pSet = new HashSet<>();
		pSet.add("1");
		pSet.add("2");
		pSet.add("3");
		pSet.add("4");
		pSet.add("5");
		pSet.add("5"); //중복허용안됨
		
		for(String number : pSet) {
			System.out.println(number);
		}
		
	}	
		
		
	//Map 
	public void practiceMap() {
		Map<String, Integer> pMap = new HashMap<>();
		pMap.put("강아지", 1);
		pMap.put("고양이", 2);
		pMap.put("너구리", 5);
		pMap.put("햄스터", 3);
		
		for(String animal : pMap.keySet()) {
			int code = pMap.get(animal);
			System.out.println(animal + " : " + code);
			
		}
	}
}
