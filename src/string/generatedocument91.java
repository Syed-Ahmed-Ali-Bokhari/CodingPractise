package string;

import java.util.HashMap;
import java.util.Map;

public class generatedocument91 {

//	You're given a string of available characters and a string representing a document that you need to generate. Write a
//	function that determines if you can generate the document using the available characters. If you can generate the
//	document, your function should return true ; otherwise, it should return false

//	You're only able to generate the document if the frequency of unique characters in the characters string is greater
//	than or equal to the frequency of unique characters in the document string. For example, if you're given
//	characters= "abcabc" and document = "aabbccc" you cannot generate the document because you're missing one C
//The document that you need to create may contain any characters, including special characters, capital letters,
//	numbers, and spaces.
//Note: you can always generate the empty string ("")
//	characters= "Bste!hetsi ogEAxpelrt x "
//	document = "AlgoExpert is the Best!"
//	Sample Output true

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
