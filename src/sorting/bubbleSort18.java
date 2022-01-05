package sorting;

public class bubbleSort18 {

	// (Find all triplets with the given sum)

	public static int[] bubbleSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] < array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}

		}

		return array;

	}

	public static void main(String[] args) {

		int[] array = new int[] { 8, 5, 2, 9, 5, 6, 3 };

		int[] result = bubbleSort18.bubbleSort(array);
		for (int res : result)
			System.out.println(res);

	}

}
