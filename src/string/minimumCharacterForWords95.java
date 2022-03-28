package string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class minimumCharacterForWords95 {

	static public char[] minimumCharactersForWords(String[] words) {

		HashMap<Character, Integer> max = new HashMap<Character, Integer>();
		for (String word : words) {
			HashMap<Character, Integer> map = countFrequencies(word);
			UpdateFrequemcies(max, map);

		}

		return makeArrayFromCharacterFreq(max);

	}

	private static void UpdateFrequemcies(HashMap<Character, Integer> max, HashMap<Character, Integer> map) {

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			char character = entry.getKey();
			int value = entry.getValue();

			if (max.containsKey(character)) {
				max.put(character, Math.max(value, max.get(character)));
			} else
				max.put(character, value);

		}

	}

	private static HashMap<Character, Integer> countFrequencies(String word) {
		HashMap<Character, Integer> count = new HashMap<Character, Integer>();
		for (char ch : word.toCharArray()) {

			count.put(ch, count.getOrDefault(ch, 0) + 1);
		}

		return count;
	}

	static public char[] makeArrayFromCharacterFreq(HashMap<Character, Integer> freq) {
		ArrayList<Character> characters = new ArrayList<Character>();

		for (Map.Entry<Character, Integer> frequency : freq.entrySet()) {
			int charFreq = frequency.getValue();
			char character = frequency.getKey();
			for (int i = 0; i < charFreq; i++) {
				characters.add(character);

			}
		}

		char[] characterarray = new char[characters.size()];
		for (int i = 0; i < characters.size(); i++)
			characterarray[i] = characters.get(i);

		return characterarray;
	}

	public static void main(String[] args) {

		String[] words = { "this", "that", "did", "deed", "them!", "a" };
		char[] chr = minimumCharacterForWords95.minimumCharactersForWords(words);
		for (char ch : chr)
			System.out.print(ch +" ");

	}

}
