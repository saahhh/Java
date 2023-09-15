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
		//String add �غ��� for�� ���
		pList.add("�ƾ�");
		pList.add("�ƹٶ�");
		pList.add("�߾�");
		pList.add("�ƾ�"); //�ߺ����
		
		System.out.println("List : ");
		
		for(String coffee : pList) {
			System.out.println(coffee);
		}

	}
	//String add �غ��� for�� ���, �ߺ��� �� add �־ �����غ���
	public void practiceSet() {
		Set<String> pSet = new HashSet<>();
		pSet.add("1");
		pSet.add("2");
		pSet.add("3");
		pSet.add("4");
		pSet.add("5");
		pSet.add("5"); //�ߺ����ȵ�
		
		for(String number : pSet) {
			System.out.println(number);
		}
		
	}	
		
		
	//Map 
	public void practiceMap() {
		Map<String, Integer> pMap = new HashMap<>();
		pMap.put("������", 1);
		pMap.put("�����", 2);
		pMap.put("�ʱ���", 5);
		pMap.put("�ܽ���", 3);
		
		for(String animal : pMap.keySet()) {
			int code = pMap.get(animal);
			System.out.println(animal + " : " + code);
			
		}
	}
}
