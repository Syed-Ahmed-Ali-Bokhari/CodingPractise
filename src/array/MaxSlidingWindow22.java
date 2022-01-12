package array;

import java.util.ArrayDeque;
import java.util.Deque;

public class MaxSlidingWindow22 {

	public static Deque<Integer> maxSliding(int[] array, int windowSize) {

		Deque<Integer> result = new ArrayDeque<Integer>();
		Deque<Integer> list = new ArrayDeque<Integer>();

		if (array.length < windowSize)
			return result;

		for (int i = 0; i < windowSize; i++) {
			while (!list.isEmpty() && array[i] >= array[list.peekLast()]) {
				list.removeLast();
			}
			list.addLast(i);
		}
		for (int i = windowSize; i < array.length; i++) {
			result.add(array[list.peek()]);

			while (!list.isEmpty() && array[list.peek()] >= i - windowSize) {
				list.removeFirst();
			}
			
			while (!list.isEmpty() && array[i] >= array[list.peekLast()]) {
				list.removeLast();
			}
			list.addLast(i);
		}

		result.add(array[list.peek()]);

		return result;
	}

	public static void main(String[] args) {

		int[] array = new int[] { -4, 2, -5, 3, 6 };
		int windowSize = 3;

		Deque<Integer> result = MaxSlidingWindow22.maxSliding(array, windowSize);
		for (int res : result)
			System.out.println(res);

	}
}
