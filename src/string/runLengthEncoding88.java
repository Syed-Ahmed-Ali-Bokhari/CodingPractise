package string;

class runLengthEncoding88 {

	public static String runLength(String str) {
		StringBuilder result = new StringBuilder();
		int currentLength = 1;

		for (int i = 1; i < str.length(); i++) {
			char current = str.charAt(i);
			char prev = str.charAt(i - 1);
			if (current != prev || currentLength == 9) {
				result.append(prev);
				result.append(Integer.toString(currentLength));
				currentLength = 0;
			}
			currentLength++;
		}
		result.append(str.charAt(str.length()-1));
		result.append(Integer.toString(currentLength));
		return result.toString();
	}

// Driver code
	public static void main(String[] args) {
		String str = "abawwwhhsjjjaa";
		// a3w3h2s1j3a2
		System.out.println(runLengthEncoding88.runLength(str));
	}
}

