package com.kh.BFS;

import java.util.LinkedList;
import java.util.Queue;
/*
  Main메서드
  그래프의 BFS탐색을 구현하고, 주어진 시작 노드로부터 모든 연결된 노드를 너비 우선으로 탐색한다
 * */
public class BFSMain {
	public static void main(String[] args) {
		//Graph 생성
		BFSGraph g = new BFSGraph(6);
		//간선 추가
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 3);
		g.addEdge(2, 4);
		g.addEdge(2, 5);
		System.out.println("BFS 탐색 결과 : "); //레벨기준으로 왼쪽으로 
		//BFS 시작노드를 0에서 호출해서 실행한다
		g.BFS(0);
		//결과는 BFS의 탐색결과인 노드 순서를 출력
	}

}
