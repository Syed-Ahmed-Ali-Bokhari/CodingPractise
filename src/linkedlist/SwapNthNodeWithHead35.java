package linkedlist;

import java.util.HashSet;
import java.util.Set;

import linkedlist.IntersectionPointOfTwoLinkedList33.LinkedList;

public class SwapNthNodeWithHead35 {
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

		public static int lenghtLinkedList(LinkedList head) {
			int length = 0;
			while (head != null) {
				length++;
				head = head.next;
			}

			return length;

		}

		public static LinkedList removeFromEnd(LinkedList head, int k) {
			if (head == null || k < 1)
				return null;
			LinkedList current = head;
			LinkedList prev = null;
			int lenght = lenghtLinkedList(current);
			int size = lenght - k;
			while (size > 0) {
				prev = current;
				current = current.next;
				size--;
			}
			if (current == null)
				return null;
			prev.next = current.next;

			return head;

		}

		public static LinkedList swapNthNode(LinkedList head, int n) {
			if(head==null) return null;
			if(n==1) return head;
			LinkedList current = head;
			LinkedList prev = null;
			for (int i = 1; i < n && current != null; i++) {
				prev=current;
				current=current.next;
			}
			if(current==null) return current;
			LinkedList temp = head.next;
			prev.next=head;
			head.next=current.next;
			current.next=temp;
			return current;
		}

	}

	public static void main(String[] args) {
		int[] list = new int[] { 1, 1, 3, 3, 3, 4, 4, 5 };
		LinkedList listHead = LinkedList.createLinkedList(list);
		// LinkedList.display(listHead);
		listHead = LinkedList.removeDuplicatesFromLinkedList(listHead);
		// LinkedList.display(listHead);
		int deleteKey = 5;
		listHead = LinkedList.deleteKey(listHead, deleteKey);
		// LinkedList.display(listHead);
		int[] list3 = new int[] { 7, 14, 21, 28, 35, 42 };
		int n = 4;
		LinkedList listHead3 = LinkedList.createLinkedList(list3);
		LinkedList.display(listHead3);
		LinkedList listHead4 = LinkedList.swapNthNode(listHead3, n);
		LinkedList.display(listHead4);
	}

}
