package array;

public class monotonicArray96 {

	// Reverse words in a String

	static public boolean monotonic(int[] array) {

		boolean isNonIncreasing = true;
		boolean isNonDecreasing = true;

		for (int i = 1; i < array.length; i++) {
			if (array[i] > array[i - 1])
				isNonIncreasing = false;
			if (array[i] < array[i - 1])
				isNonDecreasing = false;
		}

		return isNonIncreasing||isNonDecreasing;
	}

	public static void main(String[] args) {

		int[] array = new int[] { -1, -5, -10, -1100, -1101, -9001 };

		System.out.println(monotonicArray96.monotonic(array));

	}

}
