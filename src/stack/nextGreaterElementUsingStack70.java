package stack;

import java.util.Stack;

public class nextGreaterElementUsingStack70 {

	public static int[] nextGreater(int[] array) {
		Stack<Integer> stack = new Stack<Integer>();
		int[] result = new int[array.length];
		for (int i = array.length - 1; i >= 0; i--) {

			if (!stack.isEmpty()) {

				while (!stack.isEmpty() && stack.peek() <= array[i])
					stack.pop();
			}
			if (stack.isEmpty())
				result[i] = -1;
			else
				result[i] = stack.peek();
			stack.push(array[i]);

		}

		return result;
	}

	public static void main(String[] args) {
		int[] array = new int[] { 98,99,100,11};
		int[] result = nextGreaterElementUsingStack70.nextGreater(array);
		for (int res : result)
			System.out.println(res);
	}

}
