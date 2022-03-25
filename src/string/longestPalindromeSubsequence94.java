package string;

public class longestPalindromeSubsequence94 {

	public static String longestPalindrome(String str) {

		String longest = "";

		for (int i = 0; i < str.length(); i++) {
			for (int j = i; j < str.length(); j++) {
				String result = str.substring(i, j + 1);
				if (result.length() > longest.length() && isPalindrome(result))
					longest = result;

			}

		}

		return longest;

	}

	private static boolean isPalindrome(String result) {
		int left = 0;
		int right = result.length() - 1;
		while (left < right) {
			if (result.charAt(left) != result.charAt(right))
				return false;

			left++;
			right--;
		}

		return true;
	}

	public static void main(String[] args) {

		System.out.println(longestPalindromeSubsequence94.longestPalindrome("abaxyzzyxf"));

	}

}
