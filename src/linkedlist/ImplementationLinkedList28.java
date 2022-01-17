package linkedlist;

public class ImplementationLinkedList28 {

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
		
		
	}

	public static void main(String[] args) {
		 int[] list = new int[] {4, 7, 4, 9, 7, 11, 4};
		 LinkedList listHead = LinkedList.createLinkedList(list);
		 LinkedList.display(listHead);
		 listHead = LinkedList.reverseLinkedList(listHead);
		 LinkedList.display(listHead);
		
	}

}
