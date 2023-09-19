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
		
		System.out.println("DFS 탐색 결과 : ");
		graph.DFS(0);
		
		/* DFS 탐색 결과 : 
			0 
			1 
			4 
			9 
			7  //중간에 7이 나오는 이유는 0부터 시작한 간선이 9까지 이어져서 끝난 후 다시 0으로 돌아가서 초기화하기 때문 (1,7은 1이랑 이어짐)
			3 
			5 
			8
		*/ 
	}
}

 /*ver의 자리가 10미만이 안되는 이유는 public class Graph의
 public Graph(int ver) {
		V = ver;
		adjList = new LinkedList[ver];
		for (int i=0; i<ver; i++) {
		adjList[i] = new LinkedList<>();
	}
}
*/