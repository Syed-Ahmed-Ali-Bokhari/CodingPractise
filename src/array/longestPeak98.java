package array;

public class longestPeak98 {
// write a function that takes an array and return the length of the
// longest peak in the array [1,2,3,3,4,0,10,6,5,-1,-3,2,3] ==> 6 (0,10,6,5,-1,-3)
//A peak is defined as adjacent integers in the array that are strictly increasing until they reach a tip (the highest value
//in the peak), at which point they become strictly decreasing. At least three integers are required to form a peak.
// for example the integers 1,4,10,2 forms a peak but 4,0,10 and 1,2,2,0 and 1,2,3 does not form the peak
//For example, the integers 1, 4, 10, 2 form a peak, but the integers 4, 0, 10 don't and neither do the integers
//			1, 2, 2, 0. Similarly, the integers 1, 2, 3 don't form a peak because there aren't any strictly decreasing
//	integers after the 3

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
