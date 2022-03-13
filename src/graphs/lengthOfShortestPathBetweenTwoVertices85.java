package graphs;

import java.util.*;

public class lengthOfShortestPathBetweenTwoVertices85 {
	int vertices;
	DoublyLinkedList adjacent[];

	public lengthOfShortestPathBetweenTwoVertices85(int vertices) {
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


	public static int findMin(Graph79 g, int source, int destination) {
		if(source == destination)
			return 0;
		int[] distance = new int[g.vertices];
		boolean[] visit = new boolean[g.vertices];
		Queue queue = new Queue(g.vertices);
		queue.enqueue(source);
		visit[source] = true;
		while (!queue.isEmpty()) {
			int current = queue.dequeue();
			DoublyLinkedList.Node temp = null;
			if (g.adjacent[current] != null) {
				temp = g.adjacent[current].head;
				
				while(temp!=null) {
					if(!visit[temp.data]) {
						queue.enqueue(temp.data);
						visit[temp.data] = true;
						distance[temp.data]=distance[current]+1;
					}
					if(temp.data == destination) {
						return distance[destination];
					}
					temp=temp.next;
				}
			}
		}

		return -1;
	}

	public static void main(String[] args) {

	}

}
