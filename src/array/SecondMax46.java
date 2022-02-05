package array;

public class SecondMax46 {

	public static int secondMax(int[] array) {

		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				secondMax = max;
				max = array[i];
			} else if (secondMax < array[i] && array[i] != max) {
				secondMax = array[i];
			}

		}
		return secondMax;

	}

	public static void main(String[] args) {
		int[] array = new int[] { 1, 2, 3, 5, 6 };

		int result = SecondMax46.secondMax(array);
		System.out.println(result);

	}

}
