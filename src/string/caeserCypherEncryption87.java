package string;

class caeserCypherEncryption87 {

	public static String caeser(String str, int key) {
		char[] chr  = new char[str.length()];
		String alpha="abcdefghijklmnopqrstuvwxyz";
		for (int i = 0; i < str.length(); i++) {
			int value = ((str.charAt(i)+key)%97)%26;
			chr[i]=alpha.charAt(value);
		}
		return new String(chr);
	}

// Driver code
	public static void main(String[] args) {
		String str = "xyz";
		int key = 4;
		System.out.println(caeserCypherEncryption87.caeser(str, key));
			
	}
}
