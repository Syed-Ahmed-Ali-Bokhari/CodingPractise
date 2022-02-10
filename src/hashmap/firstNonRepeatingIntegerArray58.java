package hashmap;

import java.util.HashMap;
import java.util.Map;

public class firstNonRepeatingIntegerArray58 {

	// Reverse words in a String

	public static int nonRepeat(int[] array) {
		Map<Integer, Integer> hmap = new HashMap<Integer, Integer>();
		for (int i = 0; i < array.length; i++) {
			if (hmap.containsKey(array[i])) {
				int rs = hmap.get(array[i]) + 1;
				hmap.put(array[i], rs);
			} else
				hmap.put(array[i], 1);
		}
		for(int i = 0; i < array.length;i++)
		{
			if(hmap.get(array[i])==1)
				return array[i];
		}
		return 0;

	}

	public static void main(String[] args) {

		int[] array = new int[] { 9, 2, 3, 2, 6, 6 };

		int result = firstNonRepeatingIntegerArray58.nonRepeat(array);
		System.out.println(result);

	}

}
