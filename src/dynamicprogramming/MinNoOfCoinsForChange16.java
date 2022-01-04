package dynamicprogramming;

import java.util.Arrays;

public class MinNoOfCoinsForChange16 {

	public static int numberOfWaysToMakeChange(int n, int[] denoms) {

		int[] ways = new int[n + 1];
		Arrays.fill(ways, Integer.MAX_VALUE);
		int toCompare = 0;
		ways[0] = 0;
		for (int denom : denoms) {
			for (int amount = 1; amount < ways.length; amount++) {
				if (denom <= amount) {
					if (ways[amount - denom] == Integer.MAX_VALUE) {
						toCompare = ways[amount - denom];
					} else {
						toCompare = ways[amount - denom] + 1;
					}
					ways[amount] = Math.min(toCompare, ways[amount]);
				}

			}

		}

		return ways[n] != Integer.MAX_VALUE ? ways[n] : -1;
	}

	public static void main(String[] args) {

		int[] denom = new int[] { 1, 5, 10 };
		int n = 7;

		System.out.println(MinNoOfCoinsForChange16.numberOfWaysToMakeChange(n, denom));

	}

}
