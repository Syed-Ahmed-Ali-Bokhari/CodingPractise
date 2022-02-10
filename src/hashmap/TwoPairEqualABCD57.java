package hashmap;

import java.util.HashMap;
import java.util.Map;

public class TwoPairEqualABCD57 {

	// Reverse words in a String

	public static String pairs(int[] array) {
		Map<Integer, int[]> hmap = new HashMap<Integer, int[]>();
		String result = "";
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				int sum = array[i] + array[j];
				if (!hmap.containsKey(sum)) {
					hmap.put(sum, new int[] { array[i], array[j] });
				} else {
					int[] prev = hmap.get(sum);
					result += "{"+ prev[0]+","+ prev[1]+"}"+"{"+ array[i]+","+ array[j]+"}";
					
				}

			}

		}

		return result;

	}

	public static void main(String[] args) {

		int[] array = new int[] { 3, 4, 7, 1, 12, 9 };

		String result = TwoPairEqualABCD57.pairs(array);
		System.out.println(result);

	}

}
