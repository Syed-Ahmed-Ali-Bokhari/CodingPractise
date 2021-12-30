package array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class MoveElementToEnd9 {

	public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {		// TODO Auto-generated method stub
		int j = 0;
		for (int i = 0 ; i < array.size(); i++)
		{
			if(array.get(i).equals(toMove))
			{
				if(i!=j)
				{
					Integer temp = array.get(j);
					array.set(j,array.get(i));
					array.set(i,temp);
				}
				j++;
			}
		}
		
		return array;
	}

	public static void main(String[] args) {
		
		Integer[] numArray = {1, 0, 3, 4, 5, 0, 9, 0, 7, 6};
		List<Integer> array = new ArrayList<Integer>(Arrays.asList(numArray));
		int toMove = 0;
		
		List<Integer> numArray1 = MoveElementToEnd9.moveElementToEnd(array, toMove); 
		for(int num :numArray1)
			System.out.println(num);
		
	}

	

}
