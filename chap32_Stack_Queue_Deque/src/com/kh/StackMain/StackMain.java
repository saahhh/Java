package com.kh.StackMain;

import java.util.Stack;

public class StackMain {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		//push()�� stack�� �� �߰�
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		//pop()�� stack�� �� ����
		stack.pop();
		
		//clear()�� stack�� ��ü �� ����(�ʱ�ȭ)
		stack.clear();
		
		//peek()�� stack���� ���� ����� ��(���� �������� ���� ��)�� ���
		stack.peek();
		
		//size()�� stack�� ũ�⸦ ���
		stack.size();
		
		//empty()�� stack�� ����ִ��� üũ
		//��� �ִٸ� true, �ϳ��� ����ִٸ� false
		stack.empty();
		
		//stack1�� �ִ��� check, 1�� �����Ѵٸ� true
		stack.contains(1);
		
		/*
		 * |	 |
		 * |  3  |
		 * |  2  |
		 * |__1__|	
		 */
		
		System.out.println(stack.pop()); //3�������Ѵ�
		System.out.println(stack.pop()); //2�������Ѵ�

	}

}
