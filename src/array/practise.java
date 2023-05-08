package array;

import java.util.*;

public class practise {


    public static void main(String[] args) {

        List<Integer> array = new ArrayList<Integer>();
        array.add(1);
        array.add(3);
        array.add(5);
        List<Integer> sequence = new ArrayList<Integer>();
        sequence.add(1);
        sequence.add(3);

        System.out.println(practise.isValidSubsequence(array, sequence));
    }

    private static boolean isValidSubsequence(List<Integer> list, List<Integer> sequence) {
        int i = 0;
        int j = 0;
        while (i < list.size() && j < sequence.size()) {
            if (list.get(i).equals(sequence.get(j)))
                j++;
            i++;
        }

        return j == sequence.size();
    }


}