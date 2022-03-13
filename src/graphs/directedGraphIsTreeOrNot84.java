package graphs;

import java.util.*;

public class directedGraphIsTreeOrNot84 {
	int vertices;
	DoublyLinkedList adjacent[];

	public directedGraphIsTreeOrNot84(int vertices) {
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

	public static String bfs(Graph79 g) {
		String result = "";
		if (g.vertices < 1)
			return result;

		boolean[] visit = new boolean[g.vertices];
		for (int i = 0; i < g.vertices; i++) {
			if (!visit[i])
				result += bfsvisit(g, i, visit);

		}

		return result;

	}

	public static String bfsvisit(Graph79 g, int source, boolean[] visit) {
		String result = "";

		Queue queue = new Queue(g.vertices);
		queue.enqueue(source);
		visit[source] = true;
		while (!queue.isEmpty()) {
			int current = queue.dequeue();
			result += String.valueOf(current);
			DoublyLinkedList.Node temp = null;
			if (g.adjacent[current] != null) {
				temp = g.adjacent[current].head;
				
				while(temp!=null) {
					if(!visit[temp.data]) {
						queue.enqueue(temp.data);
						visit[temp.data] = true;
					}
					temp=temp.next;
				}
			}
		}

		return result;
	}

	public static void main(String[] args) {

	}

}
