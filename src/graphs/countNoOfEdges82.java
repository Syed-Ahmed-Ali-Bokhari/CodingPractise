package graphs;

public class countNoOfEdges82 {
	int vertices;
	DoublyLinkedList adjacent[];

	public countNoOfEdges82(int vertices) {
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

	public static int NumEdge(Graph79 g) {
		int sum = 0;

		for (int i = 0; i < g.vertices; i++) {
			DoublyLinkedList.Node temp = null;
			if (g.adjacent[i] != null) {
				temp = g.adjacent[i].head;

				while (temp != null) {
					sum++;
					temp = temp.next;
				}
			}
		}

		return sum/2;
	}

	public static void main(String[] args) {

	}

}
