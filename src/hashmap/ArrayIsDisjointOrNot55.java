package hashmap;

import java.util.HashSet;
import java.util.Set;

public class ArrayIsDisjointOrNot55 {

	// Reverse words in a String

	public static boolean subset(int[] array, int[] array1) {
		Set<Integer> hset = new HashSet<Integer>();

		for (int i = 0; i < array.length; i++) {
			if(!hset.contains(array[i]))
				hset.add(array[i]);
		}
		
		for (int i = 0; i < array1.length; i++) {
			if(hset.contains(array1[i]))
				return false;
		}

		return true;
	}

	public static void main(String[] args) {

		int[] array = new int[] { 5, 1, 4, 2 };
		int[] array1 = new int[] { 8, 10 };

		boolean result = ArrayIsDisjointOrNot55.subset(array, array1);
		System.out.println(result);

	}

}
