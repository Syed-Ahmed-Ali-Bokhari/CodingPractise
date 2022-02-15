package stack;

import java.util.ArrayDeque;
import java.util.Queue;

public class ImplementTwoStacksUsingOneArray63<V> {

	// Logic is correct but no main method 
	
	int max;
	int top1;
	int top2;
	V[] array;

	@SuppressWarnings("unchecked")
	public ImplementTwoStacksUsingOneArray63(int max) {
		this.max = max;
		top1 = -1;
		top2 = max;
		array = (V[]) new Object[max];
	}

	public void push1(V a) {
		if (top1 < top2 - 1)
			array[++top1] = a;
	}

	public void push2(V a) {
		if (top2 > top1 + 1)
			array[--top2] = a;
	}

	public V pop1() {
		if (top1 > -1)
			return array[top1--];
		return null;
	}

	public V pop2() {
		if (top2 < max)
			return array[top2++];
		return null;
	}

	public static void main(String[] args) {
		

	}

}
