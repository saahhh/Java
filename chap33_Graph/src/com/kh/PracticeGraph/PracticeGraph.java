package com.kh.PracticeGraph;

import java.util.LinkedList;

import com.kh.BFS.BFSGraph;
import com.kh.GraphMain.DFSGraph;

public class PracticeGraph {

	public static void main(String[] args) {
		PracticeGraph ph = new PracticeGraph();
		ph.DFSPracticeMain();
		ph.BFSPracticeMain();
	}
	
	public void DFSPracticeMain() {	
		int ver = 10;
		DFSGraph graph = new DFSGraph(ver);
		
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

 /*ver�� �ڸ��� 10�̸��� �ȵǴ� ������ public class Graph��
 public Graph(int ver) {
		V = ver;
		adjList = new LinkedList[ver];
		for (int i=0; i<ver; i++) {
		adjList[i] = new LinkedList<>();
	}
}
*/
	}


	public void BFSPracticeMain() {
		
		BFSGraph g = new BFSGraph(10);
		
		g.addEdge(0, 1);
		g.addEdge(0, 3);
		g.addEdge(1, 2);
		g.addEdge(3, 5);
		g.addEdge(2, 7);
		g.addEdge(5, 8);
		g.addEdge(7, 9);
		System.out.println();
		System.out.println("BFS Ž�� ��� : "); //������������ ���ʺ��� ��� //�������� 0�� �� : ����1:0 /����2:1 3 / ����3:2 5 /����4:7 8 /����5:9
		g.BFS(0);
	}
}