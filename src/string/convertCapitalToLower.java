package string;

public class convertCapitalToLower {

	// Reverse words in a String

	public static String alphabet(String word) {

		for (int i = 0; i < word.length(); i++) {
			if(Character.isUpperCase(word.charAt(i))) {
				word=word.replace(word.charAt(i), Character.toLowerCase(word.charAt(i)));
			}
		}
		return word;

	}

	public static void main(String[] args) {

		String word = "aHHmed";

		String result = convertCapitalToLower.alphabet(word);
		System.out.println(result);

	}

}
