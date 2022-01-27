package linkedlist;

import java.util.HashSet;
import java.util.Set;

public class IntersectionPointOfTwoLinkedList33 {
	// List is sorted

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
			LinkedList prev = null;
			Set<Integer> seen = new HashSet<Integer>();
			while (current != null) {
				if (!seen.contains(current.value)) {
					seen.add(current.value);
					prev = current;
					current = current.next;
				} else {
					prev.next = current.next;
					current = current.next;
				}

			}
			return head;
		}

		public static LinkedList deleteKey(LinkedList head, int data) {
			LinkedList current = head;
			LinkedList prev = null;

			if (head.value == data)
				return head = head.next;

			while (current != null) {
				if (current.value == data) {

					prev.next = current.next;
					current = current.next;
				} else {
					prev = current;
					current = current.next;
				}

			}
			return head;
		}

		public static LinkedList intersect(LinkedList head1, LinkedList head2) {
			int length1 = lenght(head1);
			int length2 = lenght(head2);
			LinkedList list1 = null;
			LinkedList list2 = null;
			int diff = 0;
			if (length1 >= length2) {
				diff = length1 - length2;
				list2 = head2;
				list1 = head1;
			} else {
				diff = length2 - length1;
				list2 = head1;
				list1 = head2;

			}

			while (diff > 0) {
				diff--;
				list1 = list1.next;
			}
			while (list1 != null) {
				if (list1 == list2)
				{	return list1;}
				list1 = list1.next;
				list2 = list2.next;
			}

			return null;
		}

		public static int lenght(LinkedList head) {
			int length = 0;
			while (head != null) {
				length++;
				head = head.next;
			}

			return length;

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
		int deleteKey = 5;
		listHead = LinkedList.deleteKey(listHead, deleteKey);
		LinkedList.display(listHead);
		int[] list1 = new int[] { 13, 4, 12, 27 };
		int[] list2 = new int[] { 29, 23, 82, 11, 12, 27 };
		LinkedList listHead1 = LinkedList.createLinkedList(list1);
		LinkedList listHead2 = LinkedList.createLinkedList(list2);
		LinkedList listHead3 = LinkedList.intersect(listHead1, listHead2);
		LinkedList.display(listHead3);
	}

}
