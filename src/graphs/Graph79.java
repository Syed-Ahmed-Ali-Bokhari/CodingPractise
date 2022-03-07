package graphs;

public class Graph79 {
	int vertices;
	DoublyLinkedList adjacent[];

	public Graph79(int vertices) {
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

	public static void main(String[] args) {

		Graph79 g = new Graph79(4);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 3);

	}

}
