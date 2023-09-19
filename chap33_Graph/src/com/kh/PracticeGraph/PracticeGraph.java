package com.kh.PracticeGraph;

import java.util.LinkedList;

import com.kh.GraphMain.Graph;

public class PracticeGraph {

	public static void main(String[] args) {
		int ver = 10;
		Graph graph = new Graph(ver);
		
		graph.addEdge(0, 1);
		graph.addEdge(0, 3);
		graph.addEdge(1, 4);
		graph.addEdge(3, 5);
		graph.addEdge(4, 9);
		graph.addEdge(1, 7);
		graph.addEdge(5, 8);
		
		System.out.println("DFS Ž�� ��� : ");
		graph.DFS(0);
		
		/* DFS Ž�� ��� : 
			0 
			1 
			4 
			9 
			7  //�߰��� 7�� ������ ������ 0���� ������ ������ 9���� �̾����� ���� �� �ٽ� 0���� ���ư��� �ʱ�ȭ�ϱ� ���� (1,7�� 1�̶� �̾���)
			3 
			5 
			8
		*/ 
	}
}

 /*ver�� �ڸ��� 10�̸��� �ȵǴ� ������ public class Graph��
 public Graph(int ver) {
		V = ver;
		adjList = new LinkedList[ver];
		for (int i=0; i<ver; i++) {
		adjList[i] = new LinkedList<>();
	}
}
*/