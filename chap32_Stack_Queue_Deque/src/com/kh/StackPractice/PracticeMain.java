package com.kh.StackPractice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PracticeMain {
	
	public static void main(String[] args) {
		PracticeMain pm = new PracticeMain();
		pm.PracticeStack();
		pm.PracticeQueue();	
	}
	
	public void PracticeStack() {
		// stack에 값을 저장하고 삭제하고 초기화 등 메서드 사용해보기
		Stack<Integer> stack = new Stack<>();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		stack.pop();
		System.out.println(stack.pop()); //30을제거한다 출력값:20 10
		
		stack.peek();
		System.out.println(stack.peek()); //가장 마지막에 넣은 값 30 출력
		
		stack.size();
		System.out.println(stack.size()); // stack의 크기 3 출력
		
		stack.empty();
		System.out.println(stack.empty()); //스택에 값이 있기 때문에 false 출력됨

		stack.contains(5);
		System.out.println(stack.contains(5)); //stack에 값 5가 없기 때문에 false
		
		stack.contains(10);
		System.out.println(stack.contains(10)); //stack에 값 10이 았기 때문에 true
		
		stack.clear();
		stack.push(40);
		System.out.println(stack); // 맨 위의 stack 값 전체 제거 된 후 40만 출력됨
		
	}

	
	public void PracticeQueue() {
		Queue<String> queue = new LinkedList<>();
		//queue 요소 추가 반환 삭제하고 while 사용해보기
		
		queue.offer("aaa");
		queue.offer("bbb");
		queue.offer("ccc");
		
		String removeElement = queue.poll(); 
		System.out.println(removeElement); //queue에서 aaa제거하고 반환 //aaa출력됨
		
		removeElement = queue.poll(); //bbb제거하고 반환
		
		String frontElement = queue.peek(); //queue의 front요소 
		System.out.println(frontElement); //ccc출력
		
		int size = queue.size();
		System.out.println("size : " + size); //위에서 다 제거됐기 때문에 1만 출력됨
		
		while(!queue.isEmpty()) {
			String element = queue.poll();
			System.out.println(element);
		}
	}
}
