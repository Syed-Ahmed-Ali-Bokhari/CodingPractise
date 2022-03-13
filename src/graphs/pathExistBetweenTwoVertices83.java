package graphs;

import java.util.*;

public class pathExistBetweenTwoVertices83 {
	int vertices;
	DoublyLinkedList adjacent[];

	public pathExistBetweenTwoVertices83(int vertices) {
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



	public static boolean pathExist(Graph79 g, int source,int destination) {
		
		if(source == destination)
			return true;
		
		boolean[] visit = new boolean[g.vertices];
		Stack stack = new Stack(g.vertices);
		stack.push(source);
		visit[source] = true;
		while (!stack.isEmpty()) {
			int current = stack.pop();
			DoublyLinkedList.Node temp = null;
			if (g.adjacent[current] != null) {
				temp = g.adjacent[current].head;
				
				while(temp!=null) {
					if(!visit[temp.data]) {
						if(temp.data == destination)
							return true;
						stack.push(temp.data);
					}
					temp=temp.next;
				}
				visit[current]=true;
			}
		}

		return false;
	}

	public static void main(String[] args) {

	}

}
