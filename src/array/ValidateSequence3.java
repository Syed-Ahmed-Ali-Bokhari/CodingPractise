package array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ValidateSequence3 {
	
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
