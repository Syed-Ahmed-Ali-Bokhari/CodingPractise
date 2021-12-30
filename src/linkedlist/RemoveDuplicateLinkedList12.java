package linkedlist;

public class RemoveDuplicateLinkedList12 {
	//List is sorted 

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

		public static LinkedList removeDuplicatesFromLinkedList(LinkedList head) {
			LinkedList current = head;
			while (current.next!=null) {
				if (current.value == current.next.value) {
				current.next = current.next.next;
				}
				else
				{
					current=current.next;
				}
				
		}
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

	}

	public static void main(String[] args) {
		int[] list = new int[] { 1, 1, 3, 3, 3, 4, 4, 5 };
		LinkedList listHead = LinkedList.createLinkedList(list);
		LinkedList.display(listHead);
		listHead = LinkedList.removeDuplicatesFromLinkedList(listHead);
		LinkedList.display(listHead);

	}

}
