package recursion;

public class sortUnsort76 {

	// Reverse words in a String

	public static boolean sortUnsort(int[] array, int index) {
		if (index >= array.length)
			return true;
		if (array[index] < array[index - 1])
			return false;
		return sortUnsort(array, index + 1);
	}

	public static void main(String[] args) {

		int[] array = new int[] { 1, 2, 3, 4, 5 };
		int index = 1;
		boolean result = sortUnsort76.sortUnsort(array, index);
		System.out.println(result);

	}

}
