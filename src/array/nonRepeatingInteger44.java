package array;

import java.util.HashMap;
import java.util.Map;

public class nonRepeatingInteger44 {

	// non repeating integer to find
	//{ 9, 2, 3, 2, 6, 6 };
	// output ==> 9
	private static int nonRepeating(int[] array) {

		Map<Integer,Integer> map = new HashMap<Integer,Integer>();

		for (int i = 0; i < array.length; i++) {
			foo(map,array[i]);
		}
		for (int i = 0; i < array.length; i++) {
			if(map.get(array[i])==1)
				return array[i];
		}

		return -1;
	}

	private static void foo(Map<Integer, Integer> map, int i) {
		if (map.containsKey(i)) {
			int value = map.get(i)+1;
			map.put(i,value);
		} else {
			map.put(i,1);
		}


	}


	public static void main(String[] args) {
		int[] array = new int[] { 9, 2, 3, 2, 6, 6 };

		int result = nonRepeatingInteger44.nonRepeating(array);
		System.out.println(result);

	}

}
