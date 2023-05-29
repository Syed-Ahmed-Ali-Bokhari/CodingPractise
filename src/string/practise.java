package string;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

class practice {


    // Driver code
    public static void main(String[] args) {
        System.out.println(practice.longestPalindrome("abaxyzzyxf"));

    }

    private static String longestPalindrome(String str) {

        String palindrome = "";
        for (int i = 0; i < str.length(); i++) {

            for (int j = str.length() - 1; j > i; j--) {
                String result = str.substring(i, j + 1);
                if (result.length() > palindrome.length() && checkPalindrome(result))
                    palindrome = result;

            }

        }

        return palindrome;
    }

    static boolean checkPalindrome(String st) {
        int i = 0;
        int j = st.length() - 1;
        while (i < j) {
            if (st.charAt(i) != st.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

}


