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

 /*ver의 자리가 10미만이 안되는 이유는 public class Graph의
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
		System.out.println("BFS 탐색 결과 : "); //레벨기준으로 왼쪽부터 출력 //시작점이 0일 때 : 레벨1:0 /레벨2:1 3 / 레벨3:2 5 /레벨4:7 8 /레벨5:9
		g.BFS(0);
	}
}