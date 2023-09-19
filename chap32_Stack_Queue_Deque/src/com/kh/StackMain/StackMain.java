package com.kh.StackMain;

import java.util.Stack;

public class StackMain {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		//push()는 stack에 값 추가
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		//pop()은 stack의 값 삭제
		stack.pop();
		
		//clear()는 stack의 전체 값 제거(초기화)
		stack.clear();
		
		//peek()은 stack에서 가장 상단의 값(가장 마지막에 넣은 값)을 출력
		stack.peek();
		
		//size()는 stack의 크기를 출력
		stack.size();
		
		//empty()는 stack이 비어있는지 체크
		//비어 있다면 true, 하나라도 들어있다면 false
		stack.empty();
		
		//stack1이 있는지 check, 1이 존재한다면 true
		stack.contains(1);
		
		/*
		 * |	 |
		 * |  3  |
		 * |  2  |
		 * |__1__|	
		 */
		
		System.out.println(stack.pop()); //3를제거한다
		System.out.println(stack.pop()); //2를제거한다

	}

}
