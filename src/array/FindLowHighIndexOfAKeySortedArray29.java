package array;

public class FindLowHighIndexOfAKeySortedArray29 {

	// Reverse words in a String

	public static int findEndingIndex(int[] array, int target) {
		int left = 0;
		int right = array.length - 1;
		int index = -1;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (array[mid] <= target) {
				left = mid + 1;

			} else
				right = mid - 1;
			if (array[mid] == target)
				index = mid;
		}

		return index;
	}

	public static int findStartingIndex(int[] array, int target) {
		int index=-1;
		int left = 0;
		int right = array.length - 1;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (target <= array[mid]) {
				right = mid - 1;

			} else
				left = mid + 1;
			if (array[mid] == target)
				index = mid;
		}

		return index;
	}

	public static void main(String[] args) {

		int[] array = new int[] { 5, 7, 8, 8, 8, 10, 11 };
		int target = 8;

		int result = FindLowHighIndexOfAKeySortedArray29.findEndingIndex(array, target);
		System.out.println("ENDING INDEX ="+ " "+result);
		int result1 = FindLowHighIndexOfAKeySortedArray29.findStartingIndex(array, target);
		System.out.println("STARTING INDEX ="+ " "+result1);

	}

}
