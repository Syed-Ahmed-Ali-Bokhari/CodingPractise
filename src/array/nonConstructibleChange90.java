package array;

import java.util.Arrays;

public class nonConstructibleChange90 {

//	Given an array of positive integers representing the values of coins in your possession, write a function that returns
//	the minimum amount of change (the minimum sum of money) that you cannot create. The given coins can have any
//	positive integer value and aren't necessarily unique (i.e., you can have multiple coins of the same value).
//	For example, if you're given coins =
//			[1, 2, 5], the minimum amount of change that you can't create is
//	you're given no coins, the minimum amount of change that you can't create is 1
//			. If
//	Sample Input
//	coins = [5, 7, 1, 1, 2, 3, 22]
//	Sample Output ==> 20
//
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
