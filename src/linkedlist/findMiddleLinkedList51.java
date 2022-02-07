package linkedlist;

public class findMiddleLinkedList51 {

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

		public static int middleValue(LinkedList head) {
			LinkedList current = head;
			LinkedList middle = head;
			while (current != null && current.next != null && middle != null) {
				current=current.next.next;
				if(current!=null)
					middle=middle.next;
			}
			return middle.value;
		}
	}

	public static void main(String[] args) {
		int[] list = new int[] { 4, 7, 9, 11, 4 };
		int data = 9;
		LinkedList listHead = LinkedList.createLinkedList(list);
		int result = LinkedList.middleValue(listHead);
		System.out.println(result);

	}

}
