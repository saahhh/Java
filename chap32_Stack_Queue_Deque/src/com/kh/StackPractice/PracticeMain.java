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
		// stack�� ���� �����ϰ� �����ϰ� �ʱ�ȭ �� �޼��� ����غ���
		Stack<Integer> stack = new Stack<>();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		stack.pop();
		System.out.println(stack.pop()); //30�������Ѵ� ��°�:20 10
		
		stack.peek();
		System.out.println(stack.peek()); //���� �������� ���� �� 30 ���
		
		stack.size();
		System.out.println(stack.size()); // stack�� ũ�� 3 ���
		
		stack.empty();
		System.out.println(stack.empty()); //���ÿ� ���� �ֱ� ������ false ��µ�

		stack.contains(5);
		System.out.println(stack.contains(5)); //stack�� �� 5�� ���� ������ false
		
		stack.contains(10);
		System.out.println(stack.contains(10)); //stack�� �� 10�� �ұ� ������ true
		
		stack.clear();
		stack.push(40);
		System.out.println(stack); // �� ���� stack �� ��ü ���� �� �� 40�� ��µ�
		
	}

	
	public void PracticeQueue() {
		Queue<String> queue = new LinkedList<>();
		//queue ��� �߰� ��ȯ �����ϰ� while ����غ���
		
		queue.offer("aaa");
		queue.offer("bbb");
		queue.offer("ccc");
		
		String removeElement = queue.poll(); 
		System.out.println(removeElement); //queue���� aaa�����ϰ� ��ȯ //aaa��µ�
		
		removeElement = queue.poll(); //bbb�����ϰ� ��ȯ
		
		String frontElement = queue.peek(); //queue�� front��� 
		System.out.println(frontElement); //ccc���
		
		int size = queue.size();
		System.out.println("size : " + size); //������ �� ���ŵƱ� ������ 1�� ��µ�
		
		while(!queue.isEmpty()) {
			String element = queue.poll();
			System.out.println(element);
		}
	}
}
