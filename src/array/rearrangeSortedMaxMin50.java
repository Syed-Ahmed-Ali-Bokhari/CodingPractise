package array;

public class rearrangeSortedMaxMin50 {

	public static int[] rearrange(int[] array) { // TODO Auto-generated method stub

		boolean state = false;
		int j = array.length - 1;
		int k = 0;
		int[] array2 = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			if (state) {
				array2[i] = array[k++];
			} else {
				array2[i] = array[j--];
			}
			state = !state;

		}
		return array2;
	}

	public static void main(String[] args) {

		int[] numArray = new int[] { 1, 2, 3, 4, 5 };

		int[] result = rearrangeSortedMaxMin50.rearrange(numArray);
		for (int num : result)
			System.out.println(num);

	}

}
