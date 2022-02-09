package hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ArraySubsetOfAnotherArray54 {

	// Reverse words in a String

	public static String symmetric(int[][] array) {
		Map<Integer,Integer> hmap = new HashMap<Integer,Integer>();
		String result="";

		for (int i = 0; i < array.length; i++) {
			
			Integer first = array[i][0];
			Integer second = array[i][1];
			Integer value = hmap.get(second);
			if( value == first && value!=null)
			{
				result += "{"+ String.valueOf(first)+","+ String.valueOf(second)+"}";
			}
			else
				hmap.put(first, second);
			
		}

		return result;
	}

	public static void main(String[] args) {

		int[][] array = new int[][] { { 1, 2 }, { 3, 4 }, { 5, 9 }, { 4, 3 } };
		String result = ArraySubsetOfAnotherArray54.symmetric(array);
		System.out.println(result);

	}

}
