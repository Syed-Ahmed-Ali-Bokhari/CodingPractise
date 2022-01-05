package sorting;

public class InsertionSort19 {

	// (Find all triplets with the given sum)

	public static int[] insertionSort(int[] array) {

		for (int i = 1; i < array.length; i++) {
			int j = i;
			while (j > 0 && array[j - 1] < array[j]) {
				int temp = array[j-1];
				array[j-1]=array[j];
				array[j]=temp;
				j--;
			}

		}

		return array;

	}

	public static void main(String[] args) {

		int[] array = new int[] { 12, 3, 1, 2, -6, 5, -8, 6 };

		int[] result = InsertionSort19.insertionSort(array);
		for (int res : result)
			System.out.println(res);

	}

}
