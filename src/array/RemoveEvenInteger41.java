package array;

import java.util.HashSet;

public class RemoveEvenInteger41 {

	public static int[] removeEven(int[] array) {

		int odd = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 != 0)
				odd++;
		}
		int[] array2 = new int[odd];
		odd = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 != 0)
				array2[odd++] = array[i];
		}

		return array2;

	}

	public static void main(String[] args) {
		int[] array = new int[] { 3, 5, 4, 8, 11, 1, 2, 6 };

		int[] result = RemoveEvenInteger41.removeEven(array);
		for (int res : result)
			System.out.println(res);

	}

}
