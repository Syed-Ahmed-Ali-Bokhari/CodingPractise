package string;
import java.util.HashSet;

public class PalindromeCheck2 {

	public static boolean isPalindrome(String str) {

	StringBuilder strg = new StringBuilder();	
	
	for(int i = str.length()-1 ; i >=0  ; i--)
	{
		strg.append(str.charAt(i));
	}
	
	return str.equals(strg.toString());

	}

	public static void main(String[] args) {

		System.out.println(PalindromeCheck2.isPalindrome("abcdcba")); 

	}

}
