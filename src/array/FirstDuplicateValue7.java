package array;

import java.util.HashSet;

public class FirstDuplicateValue7 {

	// first duplicate value {2,1,5,2,3,3,4} output = 2

	public static int firstDuplicateValue(int[] array) {
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i = 0 ; i < array.length;i++)
		{
			if(!set.contains(array[i]))
				set.add(array[i]);
			else {
			return array[i];
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		int[] array = new int[] { 2, 1, 5, 3, 3, 3, 4 };
		int[] array1 = new int[] { 1 };	
		int result = FirstDuplicateValue7.firstDuplicateValue(array);
		System.out.println(result);
	}

}
