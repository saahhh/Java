package com.kh.BFS;

import java.util.LinkedList;
import java.util.Queue;
/*
 Graph Ŭ����
 	�ڷ� ������ ��Ÿ��
 * */
public class BFSGraph {
		private int V; //�׷����� ���� ��
		private LinkedList<Integer>[] adj; //��������Ʈ
		
		//�׷��� �ʱ�ȭ
		public BFSGraph(int v) {
			//GraphŬ������ �����ڿ��� �׷����� ���� ��(V)�� �޾Ƽ� �ʱ�ȭ
			this.V = v;
			adj = new LinkedList[v];
			//adj�� ��������Ʈ�� ��Ÿ����, �� �������� ������ �������� ����� �����Ѵ�
			for(int i=0; i<v; ++i) {
				adj[i] = new LinkedList();
				
			}
		}
		//�׷����� ���� �߰�
		//addEdge �� �׷����� ������ �߰�
		//v�� w�� ������ �� ���� ������ ��Ÿ��
		public void addEdge(int v, int w) {
			adj[v].add(w);
		}
		
		//BFSŽ���� ����
		public void BFS(int start) {
			//visited �迭�� �� ������ �湮 ���θ� ����
			boolean[] visited = new boolean[V]; //�湮 ���θ� ǥ���ϱ� ���� �迭
			
			//BFS�� ���� ������ ������ ���ȴ�.
			Queue<Integer> queue = new LinkedList<>();
			
			//Ž���� ���� ���(start)���� �����ϰ�
			//���۳�带 �湮�ϰ� ť�� �߰�
			visited[start] = true;
			queue.add(start);
			//ť�� ����� �� ���� �ݺ������� ���� �ܰ迡 ������ ��带 �湮�Ѵ�.

			while (!queue.isEmpty()) {
				start = queue.poll();
				System.out.print(start + " ");
				//System.out.println(start + " ");
				
				for(Integer neighbor : adj[start]) {
					if(!visited[neighbor]) {
						visited[neighbor] = true;
						queue.add(neighbor);
					}
				}
			}
		}
}
