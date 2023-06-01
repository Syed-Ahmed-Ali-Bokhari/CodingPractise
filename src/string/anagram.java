package string;

import java.util.*;

public class anagram {
    //   Write a function that takes in an array of strings and groups anagrams together.
//	     Anagrams are strings made up of exactly the same letters, where order doesn't matter. For example,
//		"cinema" and "iceman" are anagrams; similarly, "foo' and "ofo' are anagrams.
//	     Your function should return a list of anagram groups in no particular order.
//       words = ["yo", "act", "flop", "tac", "foo", , "cat", , "oy" , "olfp"]
    //   [["yo", "oy"], ["flop", "olfp"], ["act", "tac", "cat"], ["foo"]]

    public static List<List<String>> groupAnagrams(List<String> words) {

        Map<String, List<String>> anagrams = new HashMap<String, List<String>>();
        for (String word : words) {
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);
            if (anagrams.containsKey(sortedWord)) {
                anagrams.get(sortedWord).add(word);
            } else {
                anagrams.put(sortedWord, new ArrayList<String>(Arrays.asList(word)));
            }
        }
        return new ArrayList<>(anagrams.values());
    }
}