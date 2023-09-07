package com.kh.arrayListSample;

import java.util.ArrayList;

public class toDoSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> ToDo = new ArrayList<>();
		System.out.println("ToDo : " + ToDo);
		
		ToDo.add("밥먹기");
		System.out.println("밥 먹기 : " + ToDo);
		ToDo.add("카페가기");
		System.out.println("카페가기 : " + ToDo);
		ToDo.add("잠자기");
		System.out.println("잠자기 : " + ToDo);
		
		int size = ToDo.size();
		System.out.println("할일 목록의 크기 : " + size);
		
		String firstToDo = ToDo.get(0);
		System.out.println("첫 번째 할일 : " + firstToDo);
		
		ToDo.set(1,"운동하기");
		System.out.println("수정체크 : " + ToDo);
		
		ToDo.remove(2);
		System.out.println("카페가기 제거확인 : " + ToDo);
		
		//AarryList 순회해서 요소출력
		for(String aaaaa : ToDo) {
			System.out.println(ToDo);
		}
		
		ToDo.clear();
		System.out.println("모든 할일 제거 : " + ToDo);
	}

}


/* 오류
ToDo : []
밥 먹기 : [밥먹기]
카페가기 : [밥먹기, 카페가기]
ㅇㅇ : [밥먹기, 카페가기, ㅇㅇ]
할일 목록의 크기 : 3
첫 번째 할일 : [밥먹기, 카페가기, ㅇㅇ]
Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 3 out of bounds for length 3
	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
	at java.base/java.util.Objects.checkIndex(Objects.java:359)
	at java.base/java.util.ArrayList.set(ArrayList.java:441)
	at com.kh.arrayListSample.toDoSample.main(toDoSample.java:25)

*/