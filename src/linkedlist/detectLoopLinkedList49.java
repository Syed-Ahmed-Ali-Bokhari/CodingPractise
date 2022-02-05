package linkedlist;

public class detectLoopLinkedList49 {

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

		public static LinkedList delete(LinkedList head, int data) {
			LinkedList temp = head;
			LinkedList prev = null;
			while (temp != null) {
				if (temp.value == data)
					prev.next = temp.next;
				prev = temp;
				temp = temp.next;
			}
			return head;
		}

		public static int length(LinkedList head) {
			LinkedList current = head;
			int length = 0;
			while (current != null) {
				current = current.next;
			length++;
			}
			return length;

		}
		
		public static boolean detectLoop(LinkedList head) {
			LinkedList slow = head;
			LinkedList fast = head;
			while (slow != null && fast.next != null && fast != null) {
				slow = slow.next;
				fast = fast.next.next;
				if(fast==slow)
					return true;
			}

			return false;
		}
	}

	public static void main(String[] args) {
		int[] list = new int[] { 1, 2, 4 };
		LinkedList listHead = LinkedList.createLinkedList(list);
		LinkedList.display(listHead);
		boolean result = LinkedList.detectLoop(listHead);
		System.out.println(result);

	}

}
