package stack;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class ReversingFirstKelementsOfQueue64 {

	// Logic is correct but no main and improper syntaxes  

	public static Queue reverse(int n) {
		Stack stack = new Stack();
		Queue q = new ArrayDeque();
		for (int i = 0; i < n; i++) {
			stack.push(q.remove());
		}
		while (!stack.isEmpty()) {
			q.add(stack.pop());
		}
		for (int i = 0; i < n; i++) {
			q.add(q.remove());
		}
		return q;

	}

	public static void main(String[] args) {

	}

}
