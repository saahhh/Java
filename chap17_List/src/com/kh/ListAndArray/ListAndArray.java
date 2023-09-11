package com.kh.ListAndArray;

import java.util.ArrayList;
import java.util.List;

public class ListAndArray {
			
	public static void main(String[] args) {
//		ListArray1(); //static이 추가된 후 실행
//		ListArray2();
		
//		or
		
		ListAndArray LAA = new ListAndArray();
		LAA.ListArray1();
		LAA.ListArray2();
	}
		
		//ListArray1();
	public static void ListArray1() {
		// Array 예제
		int[] intArray = new int[2]; //크기가 2인 정수 배열 생성
		intArray[0] = 1;
		intArray[1] = 2;

		// Array 출력
		System.out.println("Array 요소 : ");
		for(int a=0; a < intArray.length; a++) {
			System.out.print(intArray[a] + " ");
		}
		System.out.println(); // 개행문자 포함돼있어 enter같은 역할을 해준다.
		
		// List 예제
			//Integer = int			//빈 배열 리스트 생성
		List<Integer> intList = new ArrayList<>(); //리스트랑 어레이리스트 임포트해주기
									//integer 객체를 저장하는 ArrayList 생성
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		
		// List 출력
		System.out.println("List 요소 : ");
		for(int num : intList) { //ArrayList 는 향상된for문을 사용한다.
			System.out.print(num + " ");
		}
	}
	
	public static void ListArray2() { //static이 없으면 집없는 거렁뱅이라고 생각하면 된다, static이 있어야 문장이 완성되는것
		//String으로 변경 후 Array와 List 출력해보기
		String[] strArray = new String[2];
		strArray[0] = "딸기";
		strArray[1] = "바나나";
		
		System.out.println("Array 요소 : ");
		 for(int i=0; i<strArray.length; i++) {
			 System.out.print(strArray[i] + " ");
		 }
		 System.out.println();
		 
		 List<String> strList = new ArrayList<>();
		 strList.add(0, "사과"); //굳이 인덱스번호를 쓸 필요가 없음, List는 정해진 것이 아니기 때문
		 strList.add(1, "키위");
		 strList.add(2, "체리");
		 strList.add(2, "파인애플");
		 
		 System.out.println("List 요소 : ");
		 for(String str : strList) {
			 System.out.println(str);
		 }
	}
	
	
	
	

}


		//List는 누군가가 만들어 놓은 객체며 Object라고도 한다. 우선은 생김새부터 익히기.
		//ArrayList<>(); 는 빈 배열 리스트 생성
		//Array는 융통성이 없다, 반면에 List는 융통성이 있다. (나중에 메모리와 관련됨)
