package linkedlist;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IntersectionLinkedList53 {

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
			Set<Integer> hset = new HashSet<Integer>();
			LinkedList result = null;
			while (current != null) {
				if (!hset.contains(current.value))
					hset.add(current.value);
				current = current.next;
			}
			while (temp != null) {
				if (hset.contains(temp.value)) {
					result.insertAtHead(temp.value);
					hset.remove(temp.value);
			}
				temp = temp.next;
			}
			return result;
		}
		public static LinkedList union(LinkedList head, LinkedList head1) {
			LinkedList current = head;
			LinkedList temp = head1;
			Set<Integer> hset = new HashSet<Integer>();
			LinkedList result = null;
			while (current != null) {
				if (!hset.contains(current.value)) {
					result.insertAtHead(current.value);
					hset.add(current.value);
				}
				current = current.next;
			}
			while (temp != null) {
				if (!hset.contains(temp.value)) {
					result.insertAtHead(temp.value);
					hset.add(temp.value);
			}
				temp = temp.next;
			}
			return result;
		}

		private void insertAtHead(int value2) {
			LinkedList newNode = new LinkedList(value2);

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
