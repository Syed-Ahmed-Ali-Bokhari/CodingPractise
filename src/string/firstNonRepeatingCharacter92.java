package string;

import java.util.HashMap;
import java.util.Map;

public class firstNonRepeatingCharacter92 {

	// Reverse words in a String

	public static int firstNonrepeat(String str) {
		Map<Character, Integer> hmap = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			Character ch = str.charAt(i);
			hmap.put(ch, hmap.getOrDefault(ch,0)+ 1);

		}
		for (int i = 0; i < str.length(); i++) {
			if (hmap.get(str.charAt(i)) == 1) {
				return str.indexOf(str.charAt(i));
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		String word = "abcdcaf";
		System.out.println(firstNonRepeatingCharacter92.firstNonrepeat(word));
	}

}
