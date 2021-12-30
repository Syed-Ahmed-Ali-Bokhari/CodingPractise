package array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeNumberSum4 {

	// (Find all triplets with the given sum)

	public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
		Arrays.sort(array);
		List<Integer[]> triplet = new ArrayList<Integer[]>();
		for (int i = 0; i < array.length - 2; i++) {
			int left = i + 1;
			int right = array.length - 1;
			while (left < right) {
				int potential = array[left] + array[right] + array[i];
				if (potential == targetSum) {
					Integer[] res = new Integer[] { array[left], array[right], array[i] };
					triplet.add(res);
					left++;
					right--;

				} else if (potential < targetSum) {
					left++;
				} else {
					right--;
				}

			}

		}

		return triplet;

	}

	public static void main(String[] args) {

		int[] array = new int[] { 12, 3, 1, 2, -6, 5, -8, 6 };
		int targetSum = 0;

		List<Integer[]> result = ThreeNumberSum4.threeNumberSum(array, targetSum);
		for (Integer[] triplets : result) {
			for (int num : triplets) {
				System.out.print(num + " ");
			}
			System.out.println();
		}

	}

}
