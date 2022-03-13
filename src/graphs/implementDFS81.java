package graphs;

import java.util.*;

public class implementDFS81 {
	int vertices;
	DoublyLinkedList adjacent[];

	public implementDFS81(int vertices) {
		this.vertices = vertices;

		adjacent = new DoublyLinkedList[vertices];
		for (int i = 0; i < vertices; i++) {
			adjacent[i] = new DoublyLinkedList();
		}
	}

	void addEdge(int source, int destination) {

		if (source < vertices && destination < vertices)
			this.adjacent[source].addNode(destination);
	}

	public static String dfs(Graph79 g) {
		String result = "";
		if (g.vertices < 1)
			return result;

		boolean[] visit = new boolean[g.vertices];
		for (int i = 0; i < g.vertices; i++) {
			if (!visit[i])
				result += dfsvisit(g, i, visit);

		}

		return result;

	}

	public static String dfsvisit(Graph79 g, int source, boolean[] visit) {
		String result = "";

		Stack stack = new Stack(g.vertices);
		stack.push(source);
		visit[source] = true;
		while (!stack.isEmpty()) {
			int current = stack.pop();
			result += String.valueOf(current);
			DoublyLinkedList.Node temp = null;
			if (g.adjacent[current] != null) {
				temp = g.adjacent[current].head;
				
				while(temp!=null) {
					if(!visit[temp.data]) {
						stack.push(temp.data);
					}
					temp=temp.next;
				}
				visit[current]=true;
			}
		}

		return result;
	}

	public static void main(String[] args) {

	}

}
