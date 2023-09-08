package com.kh.arrayList.Practice;

import java.util.ArrayList;

public class ArrayListPractice {

	public static void main(String[] args) {
		/*ArrayList 이용해서 빨주노초파남보
		수정 3회 1,3,5 ->블랙, 브라운, 그린 수정
		더하기 2회 ->주황, [옐로우],파랑,[연한파랑]
		향상된 for문 이용해서 색상 출력하기
		최 후 출력 빨 파 보*/
		
		ArrayList<String> color = new ArrayList<>();
		System.out.println("color : " + color);
						
		color.add("빨");		
		color.add("주");		
		color.add("노");		
		color.add("초");		
		color.add("파");	
		color.add("남");
		color.add("보");
		System.out.println("전체색상 : " + color);
		
		color.set(1, "블랙");
		color.set(3, "브라운");
		color.set(4, "그린"); //5가 아닌 4
		System.out.println("수정체크 : " + color);
		
		//블랙, 옐로우, 그린, 연한파랑 순서로
				
		color.add(2,"옐로우");
		color.add(6,"연한파랑");
		System.out.println("더한 색상 : " + color);		
		//color.add(null)
		//옐로우 노 브라운 그린[연한파랑]
		//방법1. 노랑 브라운 삭제 
		//color.remove(3);
		//color.remove(3); //위에서 삭제가 되어서 자릿수가 당겨진 것
		//sysout " " + color
		//방법2. 노랑 브라운 삭제
		//color.add(6,"연한파랑");
		//system.ont.print("연한파랑 수정 : + color);
		
		
		/*
		   향상된 for문
			for 반복 작업을 할 때 사용되는 제어 구조
			특정 조건이 참인 동안 또는 리스트, 배열 등의 컬렉션 요소를 하나씩 처리할 때 사용
			
			코드 구조
			for(요소의데이터타입 변수명 : ArrayList변수명) {
			//처리 요소 코드
			}
		*/
		
		String[] arr = new String[] {"빨","주","노","초","파","남","보"};
		for(String aaa : color) { //보통 colors를 변수로 쓰고 aaa자리에 단일 색상인 color를 많이 씀

		}
		//System.out.println("최후 출력 : " + arr[0] + arr[4] + arr[6]);
		//최후 출력 : 
		//1.인덱스 이용해서 자리 출력 (출제한 의도)
		color.set(7,"파");
		System.out.println("최후 출력 : " + color.get(0) +" "+ color.get(7) +" "+ color.get(8));
		//2.초기화 후 출력
//		ArrayList<String> rainbow = new ArrayList<>();
//		color.add("빨");
//		color.add("파");
//		color.add("보");
//		System.out.println("최후 출력 : " + raindow.get(0) + raindow.get(7) + raindow.get(8) );
//		
	}

}