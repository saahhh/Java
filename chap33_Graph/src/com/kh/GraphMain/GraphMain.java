package com.kh.GraphMain;

public class GraphMain {

	/*
	 * DFS탐색을 시작하여 그 결과를 출력
	 * 탐색 결과는 시작 노드에서 출발하여 깊이를 우선으로 탐색 후 노드를 방문한 순서대로 출력하겠다
	 * 노드의 방향은 단방향이며 역방향으로 갈 수 없다.
	 * */
	
	public static void main(String[] args) {
		int ver = 5; //그래프 노드의 수를 5로 정의
		DFSGraph graph = new DFSGraph(ver);
		
		//add.Edge() 를 사용해 간선을 추가한 것
		graph.addEdge(0, 1); //노드0에서 노드1로 방향이 있는 엣지를 추가
		graph.addEdge(0, 2); //노드0에서 노드2로 방향이 있는 엣지를 추가
		graph.addEdge(1, 3); //노드1에서 노드3으로 방향이 있는 엣지를 추가
		graph.addEdge(2, 4); //노드2에서 노드4로 방향이 있는 엣지를 추가
		
		System.out.println("DFS 탐색 결과 : ");
		//DFS 탐색을 시작할 노드의 번호를 전달하는 것
		//0으로 시작함
		graph.DFS(0); //시작 노드에서 출발해서 가능한 깊이 들어가서 더이상  없을 때 다시 상위 레벨로 돌아옴
					  //결과값은 중복이 허용되지 않는다.
	} 
}
