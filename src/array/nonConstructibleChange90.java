package array;

import java.util.Arrays;

public class nonConstructibleChange90 {

	public static int nonConstructibleChange(int[] array) {
	Arrays.sort(array);
	int constructible = 0;
		for(int coin : array) {
			if(coin > constructible+1)
				return constructible+1;
			 constructible+=coin;
			
		}
		return constructible+1;
	}

	public static void main(String[] args) {

		int[] array =  { 1, 2, 5 };

		System.out.println(nonConstructibleChange90.nonConstructibleChange(array));

	}

}
