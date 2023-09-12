package com.kh.LinkedListSample;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExam {

	public static void main(String[] args) {
		// List 인터페이스 와 LinkedList 객체 활용해서 값 넣고 출력
		// String 값 넣고 수정 삭제 출력하기
		
		//LinkedList 객체 new LinkedList 객체
		//int 값 넣고 수정 삭제 출력하기
		List<String> linkedList = new LinkedList<>();
		linkedList.add("첫 번째");
		linkedList.add("두 번째");
		linkedList.add("세 번째");
		
		System.out.println("linkedList : " + linkedList);
		
		//요소 삭제
		linkedList.remove(2);
		System.out.println("삭제 후 : " + linkedList);
		
		linkedList.clear();
		System.out.println("수정 후 : " + linkedList);
	}

}
