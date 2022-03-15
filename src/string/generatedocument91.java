package string;

import java.util.HashMap;
import java.util.Map;

public class generatedocument91 {

	// Reverse words in a String

	public static boolean generateDocument(String document, String characters) {

		Map<Character, Integer> hmap = new HashMap<Character, Integer>();
		for (int i = 0; i < characters.length(); i++) {
			char ch = characters.charAt(i);
			hmap.put(ch, hmap.getOrDefault(ch, 0) + 1);
		}
		for (int i = 0; i < document.length(); i++) {
			char ch = document.charAt(i);
			if (!hmap.containsKey(ch) || hmap.get(ch) == 0) {
				return false;
			}

			hmap.put(ch, hmap.get(ch) - 1);

		}

		return true;
	}

	public static void main(String[] args) {

		String characters = "bstes!hetsi ogEAxpelrt x ";
		String document = "AlgoExpert is the best!";

		System.out.println(generatedocument91.generateDocument(document, characters));

	}

}
