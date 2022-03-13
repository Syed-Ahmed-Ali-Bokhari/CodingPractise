package string;

import java.util.HashMap;

class practise {

	public static String prac(String str) {
		String result = "";

		for (int i = 0; i < str.length(); i++) {
			Character ch = str.charAt(i);
			HashMap<Character, Integer> counting = new HashMap<Character, Integer>();
			for (int j = i; j < str.length(); j++) {
				if (ch == str.charAt(j)) {
					if (counting.containsKey(ch)) {
						counting.put(str.charAt(i), counting.get(str.charAt(i)) + 1);
					} else {
						counting.put(ch, 1);
					}
				}
				else
					break;
				i=j;
			}
				result += ch.toString() + counting.get(ch).toString();
		}
		return result;
	}

// Driver code
	public static void main(String[] args) {
		String str = "aaawwwhhsjjjaa";
		// a3w3h2s1j3a2
		System.out.println(practise.prac(str));
	}
}

// This code is contributed by Satyam Singh
