package string;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

class practice {


    // Driver code
    public static void main(String[] args) {
        String characters = "bstes!hetsi ogEAxpelrt x ";
        String document = "AlgoExpert is the best!z";

        System.out.println(practice.generateDocument(document, characters));

    }

    private static boolean generateDocument(String document, String characters) {
        Map<Character, Integer> mdoucment = new HashMap<Character, Integer>();
        Map<Character, Integer> mcharacters = new HashMap<Character, Integer>();


        for (char w : characters.toCharArray()) {
            mcharacters.put(w, mcharacters.getOrDefault(w, 0) + 1);
        }
        for (char w : document.toCharArray()) {
            mdoucment.put(w, mdoucment.getOrDefault(w, 0) + 1);
            if (!mcharacters.containsKey(w)||mcharacters.get(w) == 0) {
                return false;
            }
            mcharacters.put(w,mcharacters.get(w) - 1);
        }

        return true;
    }

}


