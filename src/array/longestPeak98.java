package array;

public class longestPeak98 {

	public static int longestPeak(int[] array) {
		int i = 1;
		int longestPeak = 0;
		while (i < array.length - 1) {

			boolean flag = array[i - 1] < array[i] && array[i + 1] < array[i];
			if (!flag) {
				i++;
				continue;
			}
			int left = i - 2;
			while (left >= 0 && array[left] < array[left + 1]) {
				left--;
			}
			int right = i + 2;
			while (right < array.length && array[right] < array[right - 1]) {
				right++;
			}
			int current = right - left - 1;
			longestPeak = Math.max(longestPeak, current);

			i = right;
		}
		return longestPeak;

	}

	public static void main(String[] args) {
		int[] array = new int[] { 1, 2, 3, 3, 4, 0, 10, 6, 5, -1, -3, 2, 3 };

		int result = longestPeak98.longestPeak(array);
		System.out.println(result);

	}

}
