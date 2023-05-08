package array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ValidateSequence3 {
//	Validate Subsequence
//	Given two non-empty arrays of integers, write a function that determines whether the second array is a subsequence
//	of the first one.
//	A subsequence of an array is a set of numbers that aren't necessarily adjacent in the array but that are in the same
//	order as they appear in the array. For instance, the numbers [1, 3, 4] form a subsequence of the array
//[1, 2, 3, 4] , and so do the numbers [2, 4] . Note that a single number in an array and the array itself are
//	both valid subsequences of the array.
//	Sample Input
//	array = 15, 1, 22, 25, 6,-1, 8, 10]
//	sequence = [1, 6,-1, 10]
//	Sample Output ==> true
	 public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
	 		int i=0;
			int j=0;
			while ( i < array.size() && j < sequence.size() ){
				
				if (sequence.get(j).equals(array.get(i)))
				{	j++;}
				
				i++;
				
			}
			
			return (j == sequence.size());
	  }

	public static void main(String[] args) {
		
	List<Integer> array =   new ArrayList<Integer>();
	array.add(1);
	array.add(3);
	array.add(5);
	List<Integer> sequence =   new ArrayList<Integer>();
	sequence.add(1);
	sequence.add(3);
		
	System.out.println(ValidateSequence3.isValidSubsequence(array, sequence));
		
	}

}
