package array;

import java.util.HashSet;

public class rotateArrayByOneIndex52 {

	// Reverse words in a String

	public static int[] rotate(int[] array) {
		int temp = array[0];
		for (int i = 1; i < array.length; i++) {
			array[i-1]=array[i];
			if(array.length-1==i)
				array[array.length-1]=temp;
			
		}
		return array;
	}

	public static void main(String[] args) {

		int[] array = new int[] { 1, 2, 3, 4, 5 };
		int[] result = rotateArrayByOneIndex52.rotate(array);
		for (int res : result)
			System.out.println(res);
	}

}
