package hashmap;

public class IntersectionLinkedListusingHashMap61 {

	// logic is correct but wont able to execute

	static class LinkedList {
		int value;
		LinkedList next = null;

		public LinkedList(int value) {
			this.value = value;
		}

		public static LinkedList createLinkedList(int[] arr) {
			LinkedList head = null;
			LinkedList tail = null;
			for (int i = 0; i < arr.length; ++i) {
				LinkedList newNode = new LinkedList(arr[i]);
				if (head == null) {
					head = newNode;
				} else {
					tail.next = newNode;
				}
				tail = newNode;
			}
			return head;
		}

		public static LinkedList reverseLinkedList(LinkedList head) {
			LinkedList current = head;
			LinkedList previous = null;
			while (current != null) {
				LinkedList temp = current.next;
				current.next = previous;
				previous = current;
				current = temp;

			}
			head = previous;
			return head;
		}

		public static void display(LinkedList head) {
			LinkedList temp = head;
			while (temp != null) {
				System.out.printf("%d", temp.value);
				temp = temp.next;
				if (temp != null) {
					System.out.printf(", ");
				}
			}
			System.out.println();
		}

		public static void insertion(LinkedList head, int data) {
			LinkedList temp = head;
			LinkedList newNode = new LinkedList(data);
			newNode.next = null;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;

		}

		@SuppressWarnings("null")
		public static LinkedList intersection(LinkedList head, LinkedList head1) {
			LinkedList current = head;
			LinkedList temp = head1;
			LinkedList result = null;
			while (current != null) {

				if (contains(current.value, temp))
					result.insertAtHead(current.value);

				current = current.next;

			}
			return result;
		}

		private void insertAtHead(int value2) {
			LinkedList newNode = new LinkedList(value2);

		}

		private static boolean contains(int value2, LinkedList current) {
			while (current != null) {
				if (current.value == (value2)) {
					return true;
				}
			}
			return false;

		}
	}

	public static void main(String[] args) {
		int[] list = new int[] { 4, 7, 9, 11, 4 };
		int[] list1 = new int[] { 4, 11 };

		LinkedList listHead = LinkedList.createLinkedList(list);
		LinkedList listHead1 = LinkedList.createLinkedList(list1);
//		LinkedList listHead2 = LinkedList.intersection(listHead, listHead1);

	}

}
