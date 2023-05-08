package array;

import java.util.Arrays;

public class smallestDifferenceArray93 {

//	Smallest Difference O
//	Write a function that takes in two non-empty arrays of integers, finds the pair of numbers (one from each array)
//	whose absolute difference is closest to zero, and returns an array containing these two numbers, with the number
//	from the first array in the first position.
//	Note that the absolute difference of two integers is the distance between them on the real number line. For example,
//	the absolute difference of -5 and 5 is 10, and the absolute difference of -5 and -4 is 1.
//	You can assume that there will only be one pair of numbers with the smallest difference.
//	Sample Input
//	arrayOne
//= [-1, 5, 10, 20, 28, 3]
//	arrayTwo = [26, 134, 135, 15, 171
//	Sample Output
//[28, 26]

	public static int[] smallest(int[] array, int[] array1) {

		int i = 0;
		int j = 0;
		int smallest = Integer.MAX_VALUE;
		int current = Integer.MAX_VALUE;
		int[] newArray = new int[2];
		Arrays.sort(array);
		Arrays.sort(array1);

		while (i < array.length && j < array1.length) {
			
			int first = array[i];
			int second = array1[j];

			if (first < second) {
				current = second - first;
				i++;

			} else if (first > second) {
				current = first - second;
				j++;
			} else {
				 return new int []{first,second};
			}
			if(smallest > current) {
				smallest = current;
				newArray = new int[]{first,second};
				
			}

		}
		return newArray;

	}

	public static void main(String[] args) {
		int[] array = new int[] { -1, 5, 10, 20, 28, 3 };
		int[] array1 = new int[] { 26, 134, 135, 15, 17 };

		int[] result = smallestDifferenceArray93.smallest(array, array1);

		for (int res : result)
			System.out.println(res);

	}

}
