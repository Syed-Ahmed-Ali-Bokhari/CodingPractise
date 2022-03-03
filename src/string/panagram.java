package string;

import java.util.HashMap;
import java.util.Map;

public class panagram {

	// Reverse words in a String

	public static boolean reverseWordsInString(String word, Character[] arr) {

		boolean res = false;

		Map<Character, Integer> hash1 = new HashMap<Character, Integer>();
		for (int i = 0; i < arr.length; i++) {
			hash1.put(arr[i], 0);
		}

		for (int i = 0; i < word.length(); i++) {
			if (hash1.containsKey(word.charAt(i))) {
				hash1.put(word.charAt(i), hash1.get(word.charAt(i)) + 1);
			}

		}

		for (int i = 0; i < arr.length; i++) {
			if (hash1.containsValue(0)) {
				System.out.println("its not a panagram ");
				res = true;
				break;
			}

		}

		if (res == false) {
			System.out.println("its a panagram ");
	}
		return res;

	}

	public static void main(String[] args) {

		String word = "the quick brown fox jumps over the lazy dog";
		Character[] arr = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
				's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

		boolean result = panagram.reverseWordsInString(word, arr);
		System.out.println(result);

	}

}
