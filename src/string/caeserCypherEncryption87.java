package string;

class caeserCypherEncryption87 {


//	Given a non-empty string of lowercase letters and a non-negative integer representing a key, write a function that
//	returns a new string obtained by shifting every letter in the input string by k positions in the alphabet, where k is the
//	key.
//	Note that letters should "wrap" around the alphabet; in other words, the letter z
//	shifted by one returns the letter a
//	Sample Input
//	string = xyz
//	key = 2
//	Sample Output
//"zab"


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
