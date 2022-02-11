package hashmap;

import java.util.HashMap;
import java.util.Map;

public class subArraywithSumEqualToZero59 {

	// Reverse words in a String

	public static boolean subArrayWithZero(int[] array) {
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum+=array[i];
			if(map.get(sum)!=null || sum ==0 || array[i]==0)
				return true;
			
			map.put(sum, i);
		}

		return false;

	}

	public static void main(String[] args) {

		int[] array = new int[] { 6, 4, -7, 3, 12, 9 };

		Boolean result = subArraywithSumEqualToZero59.subArrayWithZero(array);
		System.out.println(result);

	}

}
