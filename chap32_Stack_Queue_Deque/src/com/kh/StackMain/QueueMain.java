package com.kh.StackMain;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {

	public static void main(String[] args) {
		
		/* Front		   Rear(tail)(=������)
		 * 	 |				   |
		 *   v				   v
		 * +---+    +---+    +---+
		 * | 1 | <- | 2 | <- | 3 |
		 * +---+ 	+---+	 +---+
		 * */
		
		//ť Queue ����
		Queue<String> queue = new LinkedList<>();
		
		//ť�� ��� �߰�
		queue.offer("Apple");
		queue.offer("Banana");
		queue.offer("Cherry");
		
		//ť���� ��� ���� �� ��� (FIFO ������� ��µ�)
		String removeElement = queue.poll(); //queue���� Apple�����ϰ� ��ȯ
		System.out.println(removeElement);
		
		removeElement = queue.poll(); //Banana �����ϰ� ��ȯ
		
		//ť�� Front ��� Ȯ�� (�������� �ʰ� Ȯ�θ�)
		String frontElement = queue.peek(); //queue�� front��� Cherry��ȯ
		System.out.println(frontElement);
		
		//ť�� ũ�� Ȯ��
		int size = queue.size(); //1�� ��µɰ� (���� �ϳ��ۿ� ���� ������)
		System.out.println("size : " + size);
		
		
		while(!queue.isEmpty()) {
			String element = queue.poll(); //poll=�������
			System.out.println(element);
		}
	}
}
