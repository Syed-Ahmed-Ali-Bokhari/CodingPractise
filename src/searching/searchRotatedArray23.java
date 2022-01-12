package searching;

public class searchRotatedArray23 {

	public static int shiftedBinarySearch(int[] array, int target) {

		return shiftedBinarySearch(array, target, 0, array.length - 1);
	}

	public static int shiftedBinarySearch(int[] array, int target, int left, int right) {

		return -1;
	}

	public static void main(String[] args) {

		int[] array = new int[] { 3, 4, 5, 6, 7, 1, 2 };
		int target = 5;

		System.out.println(searchRotatedArray23.shiftedBinarySearch(array, target));

	}
}
