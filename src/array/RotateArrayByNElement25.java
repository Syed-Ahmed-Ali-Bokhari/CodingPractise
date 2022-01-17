package array;

import java.util.ArrayDeque;
import java.util.Deque;

public class RotateArrayByNElement25 {

	public static Deque<Integer> rotate(Deque<Integer> list, int rotate) {

		if (rotate > 0) {
			for (int i = 0; i < rotate; i++) {
				list.addFirst(list.removeLast());
			}
		} else {
			for (int i = 0; i < Math.abs(rotate); i++) {
				list.addLast(list.removeFirst());
			}
		}
		return list;

	}

	public static void main(String[] args) {

		Deque<Integer> list = new ArrayDeque<Integer>();
		list.add(1);
		list.add(2);
		list.add(5);
		list.add(7);
		list.add(9);
		list.add(11);
		int rotate = 2;

		Deque<Integer> result = RotateArrayByNElement25.rotate(list, rotate);
		for (int res : result)
			System.out.println(res);

	}
}
