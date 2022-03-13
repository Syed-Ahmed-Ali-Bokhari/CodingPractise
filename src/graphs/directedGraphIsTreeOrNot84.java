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


	public static boolean isTree(Graph79 g) {
		int root=0;
		boolean[] visit = new boolean[g.vertices];
		Queue queue = new Queue(g.vertices);
		queue.enqueue(root);
		visit[root] = true;
		int noOfVisit = 1;
		while (!queue.isEmpty()) {
			int current = queue.dequeue();
			DoublyLinkedList.Node temp = null;
			if (g.adjacent[current] != null) {
				temp = g.adjacent[current].head;
				
				while(temp!=null) {
					if(!visit[temp.data]) {
						queue.enqueue(temp.data);
						visit[temp.data] = true;
						noOfVisit++;
					}
					else
						return false;
					temp=temp.next;
				}
			}
		}
		if(noOfVisit == g.vertices)
			return true;
		return false;
	}

	public static void main(String[] args) {

	}

}
