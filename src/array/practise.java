package array;

import java.util.*;

public class practise {

    // Reverse words in a String


    public static void main(String[] args) {

        int[] array = new int[]{1, 2, 3, 5, 6};

        int result = practise.secondMax(array);
        System.out.println(result);

    }

    private static int secondMax(int[] array) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                secondMax = max;
                max = array[i];
            } else if (array[i] > secondMax && max != array[i]) {
                secondMax = array[i];
            }
        }
        return secondMax;
    }


}