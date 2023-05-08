package array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeNumberSum4 {

//	Three Number Sum O f
//	Write a function that takes in a non-empty array of distinct integers and an integer representing a target sum. The
//	function should find all triplets in the array that sum up to the target sum and return a two-dimensional array of all
//	these triplets. The numbers in each triplet should be ordered in ascending order, and the triplets themselves should
//	be ordered in ascending order with respect to the numbers they hold.
//	If no three numbers sum up to the target sum, the function should return an empty array.
//			Sample Input
//	array = [12, 3, 1, 2, -6, 5,
//			-8, 6]
//	targetSum
//	Sample Output
//[[-8, 2, 6], [-8, 3, 5], [-6, 1, 511

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
