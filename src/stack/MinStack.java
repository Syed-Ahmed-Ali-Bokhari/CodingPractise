package stack;

import java.util.Stack;

//there will be no main method 

public class MinStack {
	static Stack<Integer> mainStack;
	static Stack<Integer> minStack;
	int maxSize;

	public MinStack(int max) {
		maxSize = max;
		mainStack = new Stack<Integer>();
		minStack = new Stack<Integer>();

	}

	public static void push(Integer value) {
		mainStack.push(value);
		
		if(!minStack.isEmpty() && value > minStack.peek())
		{
			minStack.push(minStack.peek());
		}
		else
			minStack.push(value);
	}

	public static int pop() {
		minStack.pop();
		return mainStack.pop();
	}

	public static int min() {
		return minStack.peek();
	}

	public static void main(String[] args) {

	}

}
