package graphs;

public class implementBFS80 {
	int vertices;
	DoublyLinkedList adjacent[];

	public implementBFS80(int vertices) {
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



	}

}
