package array;

import java.util.Arrays;

public class sortedsquaredArray86 {

	public static int[] squared(int[] array) {

		for (int i = 0; i < array.length; i++) {
			array[i] = array[i] * array[i];
		}
		Arrays.sort(array);
		return array;

	}

	public static void main(String[] args) {
		int[] array = new int[] { 3, 2, 1, 6, 5 };

		int[] result = sortedsquaredArray86.squared(array);

		for (int res : result)
			System.out.println(res);

	}

}
