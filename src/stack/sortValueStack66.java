package stack;

import java.util.Arrays;
import java.util.Stack;

public class sortValueStack66 {

	public static Stack sort(Stack<Integer> stack) {
		Stack<Integer> newStack = new Stack<Integer>();
		while (!stack.isEmpty()) {
			Integer value = stack.pop();

			if (!newStack.isEmpty() && newStack.peek() < value) {
				newStack.push(value);
			}

			else {
				while (!newStack.isEmpty() && newStack.peek() >= value) {
					stack.push(newStack.pop());
				}
				newStack.push(value);
			}

		}
		while (!newStack.isEmpty())
			stack.push(newStack.pop());

		return stack;

	}

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(7);
		stack.push(5);
		stack.push(1);
		stack.push(3);
		Stack<Integer> result = sortValueStack66.sort(stack);
		System.out.println(Arrays.toString(result.toArray()));
	}

}
