package array;

public class rearrangeNegativePositive48 {

	public static int[] rearrange(int[] array) { // TODO Auto-generated method stub

		int j = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < 0) {
				if(i!=j)
				{
				int temp = array[i];
				array[i]=array[j];
				array[j]=temp;
				}
				j++;
			}

		}
		return array;
	}

	public static void main(String[] args) {

		int[] numArray = new int[] { 1, 3, 5, -4, -5, -9, 7 };

		int[] result = rearrangeNegativePositive48.rearrange(numArray);
		for (int num : result)
			System.out.println(num);

	}

}
