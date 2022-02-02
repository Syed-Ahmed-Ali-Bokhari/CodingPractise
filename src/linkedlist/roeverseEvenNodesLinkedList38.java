package linkedlist;

import java.util.HashSet;
import java.util.Set;

public class roeverseEvenNodesLinkedList38 {
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
			if (head == null)
				return null;
			if (n == 1)
				return head;
			LinkedList current = head;
			LinkedList prev = null;
			for (int i = 1; i < n && current != null; i++) {
				prev = current;
				current = current.next;
			}
			if (current == null)
				return current;
			LinkedList temp = head.next;
			prev.next = head;
			head.next = current.next;
			current.next = temp;
			return current;
		}

		public static LinkedList mergeTwoSorted(LinkedList head1, LinkedList head2) {
			if (head1 == null)
				return head2;
			if (head2 == null)
				return head1;
			LinkedList mergeHead = null;
			if (head1.value <= head2.value) {
				mergeHead = head1;
				head1 = head1.next;
			} else {
				mergeHead = head2;
				head2 = head2.next;
			}
			LinkedList tail = mergeHead;
			while (head1 != null && head2 != null) {
				LinkedList temp = null;
				if (head1.value <= head2.value) {
					temp = head1;
					head1 = head1.next;
				} else {
					temp = head2;
					head2 = head2.next;
				}
				tail.next = temp;
				tail = temp;
			}
			if (head1 != null)
				tail.next = head1;
			if (head2 != null)
				tail.next = head2;

			return mergeHead;

		}

		public static int adjustRotation(int length, int n) {
			n = n % length;
			if (n < 0) {
				n = n + length;
			}

			return n;

		}

		public static LinkedList rotateLinkedList(LinkedList head, int k) {
			int length = LinkedList.lenghtLinkedList(head);
			int n = LinkedList.adjustRotation(length, k);
			if (n == 0)
				return head;
			int rotate = length - n - 1;
			LinkedList current = head;
			while (rotate > 0) {
				current = current.next;
				rotate--;
			}
			LinkedList temp = current.next;
			LinkedList newHead = temp;
			current.next = null;
			while (temp.next != null)
				temp = temp.next;
			temp.next = head;
			head = newHead;
			return head;
		}

		public static LinkedList merge(LinkedList list1, LinkedList list2) {
			if (list1 == null)
				return list2;
			if (list2 == null)
				return list1;
			LinkedList head = list1;
			while (list1 != null && list2 != null) {
				LinkedList temp = list2;
				list2 = list2.next;
				temp.next = list1.next;
				list1.next = temp;
				list1 = temp.next;
			}
			if (list1 == null)
				list1.next = list2;
			return head;
		}
		public static LinkedList rotateEven(LinkedList head) {
			LinkedList current = head;
			LinkedList evenList = null;
			while (current != null && current.next != null) {
				LinkedList even = current.next;
				current.next = even.next;
				even.next = evenList;
				evenList = even;
				current = current.next;
			}
			return merge(head, evenList);
		}
	}

	public static void main(String[] args) {

		int[] list = new int[] { 7, 14, 21, 28, 9 };
		LinkedList listHead = LinkedList.createLinkedList(list);
		LinkedList.display(listHead);
		LinkedList listHead1 = LinkedList.rotateEven(listHead);
		LinkedList.display(listHead1);
	}

}
