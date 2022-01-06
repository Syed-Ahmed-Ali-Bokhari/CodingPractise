package sorting;

public class SelectionSort20 {

	// (Find all triplets with the given sum)

	public static int[] selectionSort(int[] array) {
		int start = 0;
		while (start < array.length - 1) {
			int small = start;
			for (int i = start + 1; i < array.length; i++) {
				if (array[small] > array[i]) {
					small = i;
				}
			}
			swap(start,small,array);
			start++;

		}

		return array;

	}

	public static void swap(int i, int j,int[] array){
		int temp = array[j];
		array[j] = array[i];
		array[i] = temp;
	}

	public static void main(String[] args) {

		int[] array = new int[] { 12, 3, 1, 2, -6, 5, -8, 6 };

		int[] result = SelectionSort20.selectionSort(array);
		for (int res : result)
			System.out.println(res);

	}

}
