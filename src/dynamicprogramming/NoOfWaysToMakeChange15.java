package dynamicprogramming;

import java.util.Arrays;

public class NoOfWaysToMakeChange15 {

	public static int minNumberOfCoinsForChange(int n, int[] denoms) {
		int[] ways = new int[n + 1];
		Arrays.fill(ways,0);
		ways[0] = 1;
		for (int denom : denoms) {
			for (int amount = 1; amount <= n; amount++) {
				if (denom <= amount) {
					ways[amount]+=ways[amount-denom];
				}

			}

		}
		return ways[n];
	}

	public static void main(String[] args) {

		int[] denom = new int[] { 1, 5 };
		int n = 6;

		System.out.println(NoOfWaysToMakeChange15.minNumberOfCoinsForChange(n, denom));

	}

}
