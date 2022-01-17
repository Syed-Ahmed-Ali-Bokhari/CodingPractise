package array;

public class MoveAllZeroesBeginning26 {

	public static int[] moveZeroToBeginning(int[] array) { // TODO Auto-generated method stub
		int i = array.length-1;
		int j = array.length-1;
		while(i >= 0)
		{
			if(array[i]!=0)
			{
				array[j--]=array[i];
			}
			i--;
		}
		while(j>=0) {
			array[j--]=0;
		}

		return array;
	}

	public static void main(String[] args) {

		int[] numArray = new int[] { 1, 0, 3, 4, 5, 0, 9, 0, 7, 6 };

		int[] result = MoveAllZeroesBeginning26.moveZeroToBeginning(numArray);
		for (int num : result)
			System.out.println(num);

	}

}
