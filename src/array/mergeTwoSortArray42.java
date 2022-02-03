package array;

public class mergeTwoSortArray42 {

	public static int[] sortArray(int[] array, int[] array1) {
		int i = 0, k = 0, j = 0;
		int[] array3 = new int[array.length + array1.length];
		while (i < array.length && j < array1.length) {
			if (array[i] < array1[j]) {
				array3[k++] = array[i++];
			} else {
				array3[k++] = array1[j++];
			}
		}
		while (j < array1.length) {
			array3[k++]=array1[j++];
		}
		while (i < array.length) {
			array3[k++] = array[i++];
		}

		return array3;

	}

	public static void main(String[] args) {
		int[] array = new int[] { 1, 3, 5, 7 };
		int[] array1 = new int[] { 2, 4, 6, 8, 10, 12 };
		int[] result = mergeTwoSortArray42.sortArray(array, array1);
		for (int res : result)
			System.out.println(res);

	}

}
