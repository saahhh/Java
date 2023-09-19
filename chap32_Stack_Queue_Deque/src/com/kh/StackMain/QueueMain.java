package com.kh.StackMain;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {

	public static void main(String[] args) {
		
		/* Front		   Rear(tail)(=마지막)
		 * 	 |				   |
		 *   v				   v
		 * +---+    +---+    +---+
		 * | 1 | <- | 2 | <- | 3 |
		 * +---+ 	+---+	 +---+
		 * */
		
		//큐 Queue 생성
		Queue<String> queue = new LinkedList<>();
		
		//큐에 요소 추가
		queue.offer("Apple");
		queue.offer("Banana");
		queue.offer("Cherry");
		
		//큐에서 요소 추출 및 출력 (FIFO 순서대로 출력됨)
		String removeElement = queue.poll(); //queue에서 Apple제거하고 반환
		System.out.println(removeElement);
		
		removeElement = queue.poll(); //Banana 제거하고 반환
		
		//큐의 Front 요소 확인 (제거하지 않고 확인만)
		String frontElement = queue.peek(); //queue의 front요소 Cherry반환
		System.out.println(frontElement);
		
		//큐의 크기 확인
		int size = queue.size(); //1이 출력될것 (값이 하나밖에 없기 때문에)
		System.out.println("size : " + size);
		
		
		while(!queue.isEmpty()) {
			String element = queue.poll(); //poll=요소추출
			System.out.println(element);
		}
	}
}
