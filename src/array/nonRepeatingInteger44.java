package array;

public class nonRepeatingInteger44 {

	public static int nonRepeating(int[] array) {

		boolean set = false;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[i] == array[j] && i != j) {
					set = true;
				break;
				}
			}
			if (set == false)
				return array[i];
			set = false;
		}
		return 0;

	}

	public static void main(String[] args) {
		int[] array = new int[] { 9, 2, 3, 2, 6, 6 };

		int result = nonRepeatingInteger44.nonRepeating(array);
		System.out.println(result);

	}

}
