package dynamicprogramming;

public class MaxSubsetSumNoAdjacent13 {

	public static int maxSubsetSumNoAdjacent(int[] array) {
		int first = array[0];
		int second = Math.max(array[0], array[1]);
		for(int i = 2; i < array.length; i++)
		{
			int max = Math.max(first + array[i], second);
			first = second;
			second = max;
		}
		return second;
	}

	public static void main(String[] args) {

		int[] array = new int[] { 75, 105, 120, 75, 90, 135 };
	//	int[] array1 = new int[] { 7, 10, 12, 7, 9, 14 };

		System.out.println(MaxSubsetSumNoAdjacent13.maxSubsetSumNoAdjacent(array));

	}

}
