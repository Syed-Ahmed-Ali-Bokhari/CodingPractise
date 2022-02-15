package stack;

import java.util.ArrayDeque;
import java.util.Queue;

public class generateBinaryNumbFrom1toNusingQueue62 {

	// Reverse words in a String

	public static String[] subset(int n) {
		String[] result = new String[n];
		Queue<String> queue = new ArrayDeque<String>();
		queue.add("1");
		for (int i = 0; i < n; i++) {
			String a = queue.peek();
			queue.remove();
			result[i] = a;
			String res1 = a + "0";
			String res2 = a + "1";
			queue.add(res1);
			queue.add(res2);

		}

		return result;
	}

	public static void main(String[] args) {

		int n = 3;
		String[] result = generateBinaryNumbFrom1toNusingQueue62.subset(n);

		for (String res : result)
			System.out.println(res);

	}

}
