package array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class practise {

    // Reverse words in a String

    public static int firstDuplicateValue(int[] array) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i: array) {
            if (set.contains(i))
                return i;
            set.add(i);

        }

        return -1;
    }
    public static void main(String[] args) {

        int[] array = new int[]{2,1,5,1,3,3,4};

        int result = practise.firstDuplicateValue(array);
        System.out.println(result);

    }

}
