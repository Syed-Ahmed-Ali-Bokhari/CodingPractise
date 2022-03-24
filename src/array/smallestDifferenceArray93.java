package array;

import java.util.Arrays;

public class smallestDifferenceArray93 {

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
