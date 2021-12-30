package array;
import java.util.HashSet;

public class TwoNumberSum1 {

	public static int[] twoNumberSum(int[] array, int targetSum) {

		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < array.length; i++) {
			Integer sum = targetSum - array[i];
			if (set.contains(sum)) {

				return new int[] { sum, array[i] };

			}
			set.add(array[i]);

		}
		return new int[0];

	}

	public static void main(String[] args) {
		int[] array = new int[] { 3, 5, -4, 8, 11, 1, -1, 6 };

		int[] result = TwoNumberSum1.twoNumberSum(array, 10);
		for (int res : result)
			System.out.println(res);

	}

}
