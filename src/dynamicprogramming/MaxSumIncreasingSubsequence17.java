package dynamicprogramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxSumIncreasingSubsequence17 {

	public static List<List<Integer>> maxSumIncreasingSubsequence(int[] array) {
		int[] sequences = new int[array.length];
		Arrays.fill(sequences, Integer.MIN_VALUE);
		int[] sum = array.clone();
		int max = 0;

		for (int i = 0; i < array.length; i++) {
			int current = array[i];
			for (int j = 0; j < i; j++) {
				int other = array[j];
				if (current > other && sum[j] + current >= sum[i]) {
					sum[i] = sum[j] + current;
					sequences[i]=j;
				}

			}
			if (sum[i] >= sum[max]) {
				max = i;
			}

		}
		return buildSequence(array, sequences, max, sum[max]);
	}

	public static List<List<Integer>> buildSequence(int[] array, int[] sequences, int currentIdx, int sum) {

		List<List<Integer>> sequence = new ArrayList<List<Integer>>();
		sequence.add(new ArrayList<Integer>());
		sequence.add(new ArrayList<Integer>());
		sequence.get(0).add(sum);

		while (currentIdx != Integer.MIN_VALUE) {
			sequence.get(1).add(0, array[currentIdx]);
			currentIdx = sequences[currentIdx];

		}

		return sequence;
	}

	public static void main(String[] args) {

		int[] array = new int[] { 10, 70, 20, 30, 50, 11, 30 };

		List<List<Integer>> result = new ArrayList<List<Integer>>();
		result = MaxSumIncreasingSubsequence17.maxSumIncreasingSubsequence(array);
		System.out.println(result.get(0));
		
		for (int j = 0; j < result.get(1).size(); j++) {
			System.out.print(result.get(1).get(j) +" ");
		}
	
		
	}

}
