package string;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseWordString5 {

	// Reverse words in a String

	public static String reverseWordsInString(String string) {

		int startingPoint = 0;
		List<String> words = new ArrayList<String>();

		for (int idx = 0; idx < string.length(); idx++) {
			char character = string.charAt(idx);
			if (character == ' ') {
				words.add(string.substring(startingPoint, idx));
				startingPoint = idx + 1;
			}

		}
		words.add(string.substring(startingPoint));
		Collections.reverse(words);
		return String.join(" ", words);
	}

	public static void main(String[] args) {

		String word = "AlgoExpert is the best!";
		String word1 = "Reverse These Words";
		String word2 = "this      string     has a     lot of   whitespace";

		String result = ReverseWordString5.reverseWordsInString(word);
		System.out.println(result);

	}

}
