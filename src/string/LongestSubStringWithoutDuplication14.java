package string;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LongestSubStringWithoutDuplication14 {

	//Write a function that takes in a string and returns its longest substring without duplicate characters.
	//You can assume that there will only be one longest substring without duplication.


	// input  string = "clementisacap"
	// output "mentisac"

	public static String longestSubstringWithoutDuplication(String str) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		int[] longest = new int[] { 0, 1 };
		int startIdx = 0;

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(map.containsKey(c)) {
				startIdx=Math.max(startIdx, map.get(c)+1);
			}
			if (longest[1] - longest[0] < i + 1 - startIdx) {
				longest=new int[] {startIdx,i+1};
			}
			map.put(c, i);
		}
		for (Entry<Character, Integer> entry : map.entrySet()) {
		    System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		return str.substring(longest[0], longest[1]);
	}

	public static void main(String[] args) {

		String word = "clementisacap";
		String word1= "abccdeaabbcddef";
		System.out.println(LongestSubStringWithoutDuplication14.longestSubstringWithoutDuplication(word));
		System.out.println(LongestSubStringWithoutDuplication14.longestSubstringWithoutDuplication(word1));
	}

}
