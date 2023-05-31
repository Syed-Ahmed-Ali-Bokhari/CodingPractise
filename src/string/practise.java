package string;

import java.util.*;

class practice {


    // Driver code
    public static void main(String[] args) {
        String word = "the quick brown fox jumps over the lazy dg";
        Character[] arr = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
                's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

        boolean result = practice.panagram(word, arr);
        System.out.println(result);

    }

    private static boolean panagram(String word, Character[] arr) {
        Set<Character> set = new HashSet<Character>();
        for(char w : word.toCharArray()){
            if(!set.contains(w))
                set.add(w);

        }
        for (char w: arr) {
            if(!set.contains(w))
                return false;
        }

        return true;
    }


}


