package string;

class practice {

	public static String caeser(String str, int key) {
		char[] result = new char[str.length()];
		String alpha="abcdefghijklmnopqrstuvwxyz";
		for (int i = 0; i < str.length(); i++) {
			int value =  (((str.charAt(i) + key) % 97) % 26);
			result[i]=alpha.charAt(value);
		}
		return new String(result);
	}

// Driver code
	public static void main(String[] args) {
		String str = new String("xyz");
		int key = 2;
		System.out.println(practice.caeser(str, key));
			
	}
}
