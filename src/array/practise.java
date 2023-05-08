package array;

import java.util.*;

public class practise {


    public static void main(String[] args) {

        List<Integer> array =   new ArrayList<Integer>();
        array.add(1);
        array.add(3);
        array.add(5);
        List<Integer> sequence =   new ArrayList<Integer>();
        sequence.add(1);
        sequence.add(3);

        System.out.println(practise.isValidSubsequence(array, sequence));
    }

    private static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {

        return false;
    }


}