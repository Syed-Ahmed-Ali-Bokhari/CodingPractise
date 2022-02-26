package string;

public class subset77 {

	// Reverse words in a String

	public static String[] subset(String str) {
		int len = str.length();
		String[] result = new String[(len * (len + 1)) / 2];
		int temp = 0;
		for (int i = 0; i < len; i++) {
			for (int j = i; j < len; j++) {
				result[temp++] = str.substring(i, j + 1);

			}

		}
		return result;
	}

	public static void main(String[] args) {

		String str = "abc";

		String[] result = subset77.subset(str);
		for (String res : result)
			System.out.println(res);

	}

}
