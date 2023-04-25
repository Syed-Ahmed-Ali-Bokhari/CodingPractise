package recursion;

public class palindromeCheck11 {

    // Reverse words in a String

    public static boolean checkPalindrome(String str) {
        if(str.length()==0||str.length()==1)
            return true;

        if(str.charAt(0)==str.charAt(str.length()-1))
            return checkPalindrome(str.substring(1,str.length()-1));

        return false;

    }

    public static void main(String[] args) {
        String str = "abba";
        System.out.println(palindromeCheck11.checkPalindrome(str));

    }
}
