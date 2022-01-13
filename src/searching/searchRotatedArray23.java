package searching;

public class searchRotatedArray23 {

	public static int shiftedBinarySearch(int[] array, int target) {

		return shiftedBinarySearch(array, target, 0, array.length - 1);
	}

	public static int shiftedBinarySearch(int[] array, int target, int left, int right) {

		while (left <= right) {
			int middle = (left + right) / 2;
			int potential = array[middle];
			int leftNum = array[left];
			int rightNum = array[right];

			if (potential == target) {
				return middle;
			} else if (leftNum <= potential) {
				if (leftNum <= target && potential > target) {
					right = middle - 1;

				} else {
					left = middle + 1;
				}

			} else {
				if (rightNum >= target && potential < target) {
					left = middle + 1;

				} else {
					right = middle - 1;
				}
			}

		}
		return -1;
	}

	public static void main(String[] args) {

		int[] array = new int[] { 3, 4, 5, 6, 7, 1, 2 };
		int target = 5;

		System.out.println(searchRotatedArray23.shiftedBinarySearch(array, target));

	}
}
